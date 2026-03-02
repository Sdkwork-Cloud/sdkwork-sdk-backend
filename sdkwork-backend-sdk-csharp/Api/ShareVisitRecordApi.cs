using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ShareVisitRecordApi
    {
        private readonly HttpClient _client;

        public ShareVisitRecordApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update visit record
        /// </summary>
        public async Task<PlusApiResultPlusShareVisitRecordVO?> UpdateAsync(PlusShareVisitRecordForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusShareVisitRecordVO>(ApiPaths.BackendPath("/share/visit_record"), body);
        }

        /// <summary>
        /// Create visit record
        /// </summary>
        public async Task<PlusApiResultPlusShareVisitRecordVO?> CreateAsync(PlusShareVisitRecordForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusShareVisitRecordVO>(ApiPaths.BackendPath("/share/visit_record"), body);
        }

        /// <summary>
        /// Get visit records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusShareVisitRecordVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusShareVisitRecordVO>(ApiPaths.BackendPath("/share/visit_record/list"), body, query);
        }

        /// <summary>
        /// Get all visit records
        /// </summary>
        public async Task<PlusApiResultListPlusShareVisitRecordVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusShareVisitRecordVO>(ApiPaths.BackendPath("/share/visit_record/list/all"), body);
        }

        /// <summary>
        /// Get visit record by ID
        /// </summary>
        public async Task<PlusApiResultPlusShareVisitRecordVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusShareVisitRecordVO>(ApiPaths.BackendPath($"/share/visit_record/{id}"));
        }

        /// <summary>
        /// Delete visit record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/share/visit_record/{id}"));
        }
    }
}
