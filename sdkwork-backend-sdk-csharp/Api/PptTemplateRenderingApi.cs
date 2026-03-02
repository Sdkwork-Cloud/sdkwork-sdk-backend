using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class PptTemplateRenderingApi
    {
        private readonly HttpClient _client;

        public PptTemplateRenderingApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Render PPT template
        /// </summary>
        public async Task<PlusApiResult?> RenderAsync(PlusPptTemplateRenderForm body)
        {
            return await _client.PostAsync<PlusApiResult>(ApiPaths.BackendPath("/ppt/template/render"), body);
        }
    }
}
