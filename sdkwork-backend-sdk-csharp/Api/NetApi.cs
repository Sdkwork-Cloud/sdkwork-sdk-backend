using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class NetApi
    {
        private readonly HttpClient _client;

        public NetApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 更新域名
        /// </summary>
        public async Task<PlusApiResultPlusHostDomainVO?> UpdateAsync(PlusHostDomainForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusHostDomainVO>(ApiPaths.BackendPath("/net/host/domain"), body);
        }

        /// <summary>
        /// 创建域名
        /// </summary>
        public async Task<PlusApiResultPlusHostDomainVO?> CreateAsync(PlusHostDomainForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusHostDomainVO>(ApiPaths.BackendPath("/net/host/domain"), body);
        }

        /// <summary>
        /// Update an existing DNS record
        /// </summary>
        public async Task<PlusApiResultPlusDnsRecordVO?> UpdateRecordAsync(PlusDnsRecordForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDnsRecordVO>(ApiPaths.BackendPath("/net/dns/record"), body);
        }

        /// <summary>
        /// Create a new DNS record
        /// </summary>
        public async Task<PlusApiResultPlusDnsRecordVO?> CreateRecordAsync(PlusDnsRecordForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDnsRecordVO>(ApiPaths.BackendPath("/net/dns/record"), body);
        }

        /// <summary>
        /// 分页获取域名
        /// </summary>
        public async Task<PlusApiResultPagePlusHostDomainVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusHostDomainVO>(ApiPaths.BackendPath("/net/host/domain/list"), body, query);
        }

        /// <summary>
        /// 获取所有域名
        /// </summary>
        public async Task<PlusApiResultListPlusHostDomainVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusHostDomainVO>(ApiPaths.BackendPath("/net/host/domain/list/all"), body);
        }

        /// <summary>
        /// Get DNS records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDnsRecordVO?> CreateListByPageRecordAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDnsRecordVO>(ApiPaths.BackendPath("/net/dns/record/list"), body, query);
        }

        /// <summary>
        /// Get all DNS records
        /// </summary>
        public async Task<PlusApiResultListPlusDnsRecordVO?> CreateListAllEntitiesRecordAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDnsRecordVO>(ApiPaths.BackendPath("/net/dns/record/list/all"), body);
        }

        /// <summary>
        /// 获取域名详情
        /// </summary>
        public async Task<PlusApiResultPlusHostDomainVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusHostDomainVO>(ApiPaths.BackendPath($"/net/host/domain/{id}"));
        }

        /// <summary>
        /// 删除域名
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/net/host/domain/{id}"));
        }

        /// <summary>
        /// Get a DNS record by ID
        /// </summary>
        public async Task<PlusApiResultPlusDnsRecordVO?> GetByIdRecordAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDnsRecordVO>(ApiPaths.BackendPath($"/net/dns/record/{id}"));
        }

        /// <summary>
        /// Delete a DNS record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteRecordAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/net/dns/record/{id}"));
        }
    }
}
