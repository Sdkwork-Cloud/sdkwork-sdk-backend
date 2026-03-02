using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class HostApi
    {
        private readonly HttpClient _client;

        public HostApi(HttpClient client)
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
        /// 分页获取域名
        /// </summary>
        public async Task<PlusApiResultPagePlusHostDomainVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusHostDomainVO>(ApiPaths.BackendPath("/net/host/domain/list"), body, query);
        }

        /// <summary>
        /// 获取所有域名
        /// </summary>
        public async Task<PlusApiResultListPlusHostDomainVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusHostDomainVO>(ApiPaths.BackendPath("/net/host/domain/list/all"), body);
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
    }
}
