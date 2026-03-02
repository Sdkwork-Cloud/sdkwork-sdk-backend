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
        /// Get app SDK config
        /// </summary>
        public async Task<PlusApiResultAppSdkConfigVO?> GetSdkConfigAsync(CreateJsapiSignatureForm body)
        {
            return await _client.PostAsync<PlusApiResultAppSdkConfigVO>(ApiPaths.BackendPath("/app/get_sdk_config"), body);
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
