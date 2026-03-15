using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ShareApi
    {
        private readonly HttpClient _client;

        public ShareApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 更新分享
        /// </summary>
        public async Task<PlusApiResultPlusShareVO?> UpdateAsync(PlusShareForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusShareVO>(ApiPaths.BackendPath("/share"), body);
        }

        /// <summary>
        /// 创建分享
        /// </summary>
        public async Task<PlusApiResultPlusShareVO?> CreateAsync(PlusShareForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusShareVO>(ApiPaths.BackendPath("/share"), body);
        }

        /// <summary>
        /// Update visit record
        /// </summary>
        public async Task<PlusApiResultPlusShareVisitRecordVO?> UpdateVisitRecordAsync(PlusShareVisitRecordForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusShareVisitRecordVO>(ApiPaths.BackendPath("/share/visit_record"), body);
        }

        /// <summary>
        /// Create visit record
        /// </summary>
        public async Task<PlusApiResultPlusShareVisitRecordVO?> CreateVisitRecordAsync(PlusShareVisitRecordForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusShareVisitRecordVO>(ApiPaths.BackendPath("/share/visit_record"), body);
        }

        /// <summary>
        /// Get visit records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusShareVisitRecordVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShareVisitRecordVO>(ApiPaths.BackendPath("/share/visit_record/list"), body, query);
        }

        /// <summary>
        /// Get all visit records
        /// </summary>
        public async Task<PlusApiResultListPlusShareVisitRecordVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShareVisitRecordVO>(ApiPaths.BackendPath("/share/visit_record/list/all"), body);
        }

        /// <summary>
        /// 分页获取分享
        /// </summary>
        public async Task<PlusApiResultPagePlusShareVO?> CreateListByPageShareAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShareVO>(ApiPaths.BackendPath("/share/list"), body, query);
        }

        /// <summary>
        /// 获取所有分享
        /// </summary>
        public async Task<PlusApiResultListPlusShareVO?> CreateListAllEntitiesShareAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShareVO>(ApiPaths.BackendPath("/share/list/all"), body);
        }

        /// <summary>
        /// 获取分享详情
        /// </summary>
        public async Task<PlusApiResultPlusShareVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusShareVO>(ApiPaths.BackendPath($"/share/{id}"));
        }

        /// <summary>
        /// 删除分享
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/share/{id}"));
        }

        /// <summary>
        /// Get visit record by ID
        /// </summary>
        public async Task<PlusApiResultPlusShareVisitRecordVO?> GetByIdVisitRecordAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusShareVisitRecordVO>(ApiPaths.BackendPath($"/share/visit_record/{id}"));
        }

        /// <summary>
        /// Delete visit record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteVisitRecordAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/share/visit_record/{id}"));
        }
    }
}
