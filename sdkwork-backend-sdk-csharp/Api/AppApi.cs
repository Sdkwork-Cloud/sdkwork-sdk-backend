using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AppApi
    {
        private readonly HttpClient _client;

        public AppApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update application
        /// </summary>
        public async Task<PlusApiResultPlusAppVO?> UpdateAsync(PlusAppForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAppVO>(ApiPaths.BackendPath("/app"), body);
        }

        /// <summary>
        /// Create application
        /// </summary>
        public async Task<PlusApiResultPlusAppVO?> CreateAsync(PlusAppForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAppVO>(ApiPaths.BackendPath("/app"), body);
        }

        /// <summary>
        /// Get applications by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAppVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAppVO>(ApiPaths.BackendPath("/app/list"), body, query);
        }

        /// <summary>
        /// Get all applications
        /// </summary>
        public async Task<PlusApiResultListPlusAppVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAppVO>(ApiPaths.BackendPath("/app/list/all"), body);
        }

        /// <summary>
        /// Get app SDK config
        /// </summary>
        public async Task<PlusApiResultAppSdkConfigVO?> GetSdkConfigAsync(CreateJsapiSignatureForm body)
        {
            return await _client.PostAsync<PlusApiResultAppSdkConfigVO>(ApiPaths.BackendPath("/app/get_sdk_config"), body);
        }

        /// <summary>
        /// Get application by ID
        /// </summary>
        public async Task<PlusApiResultPlusAppVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAppVO>(ApiPaths.BackendPath($"/app/{id}"));
        }

        /// <summary>
        /// Delete application
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/app/{id}"));
        }

        /// <summary>
        /// Get app info
        /// </summary>
        public async Task<PlusApiResultAppInfoVO?> GetAppInfoAsync()
        {
            return await _client.GetAsync<PlusApiResultAppInfoVO>(ApiPaths.BackendPath("/app/info"));
        }
    }
}
