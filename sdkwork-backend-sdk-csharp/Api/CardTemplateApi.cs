using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class CardTemplateApi
    {
        private readonly HttpClient _client;

        public CardTemplateApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing card template
        /// </summary>
        public async Task<PlusApiResultPlusCardTemplateVO?> UpdateAsync(PlusCardTemplateForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCardTemplateVO>(ApiPaths.BackendPath("/card/template"), body);
        }

        /// <summary>
        /// Create a new card template
        /// </summary>
        public async Task<PlusApiResultPlusCardTemplateVO?> CreateAsync(PlusCardTemplateForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCardTemplateVO>(ApiPaths.BackendPath("/card/template"), body);
        }

        /// <summary>
        /// Get card templates by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCardTemplateVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCardTemplateVO>(ApiPaths.BackendPath("/card/template/list"), body, query);
        }

        /// <summary>
        /// Get all card templates
        /// </summary>
        public async Task<PlusApiResultListPlusCardTemplateVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCardTemplateVO>(ApiPaths.BackendPath("/card/template/list/all"), body);
        }

        /// <summary>
        /// Get a card template by ID
        /// </summary>
        public async Task<PlusApiResultPlusCardTemplateVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCardTemplateVO>(ApiPaths.BackendPath($"/card/template/{id}"));
        }

        /// <summary>
        /// Delete a card template
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/card/template/{id}"));
        }
    }
}
