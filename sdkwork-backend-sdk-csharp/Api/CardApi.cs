using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class CardApi
    {
        private readonly HttpClient _client;

        public CardApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing membership card
        /// </summary>
        public async Task<PlusApiResultPlusCardVO?> UpdateAsync(PlusCardForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCardVO>(ApiPaths.BackendPath("/card"), body);
        }

        /// <summary>
        /// Create a new membership card
        /// </summary>
        public async Task<PlusApiResultPlusCardVO?> CreateAsync(PlusCardForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCardVO>(ApiPaths.BackendPath("/card"), body);
        }

        /// <summary>
        /// Update an existing card template
        /// </summary>
        public async Task<PlusApiResultPlusCardTemplateVO?> UpdateTemplateAsync(PlusCardTemplateForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCardTemplateVO>(ApiPaths.BackendPath("/card/template"), body);
        }

        /// <summary>
        /// Create a new card template
        /// </summary>
        public async Task<PlusApiResultPlusCardTemplateVO?> CreateTemplateAsync(PlusCardTemplateForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCardTemplateVO>(ApiPaths.BackendPath("/card/template"), body);
        }

        /// <summary>
        /// Get card templates by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCardTemplateVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCardTemplateVO>(ApiPaths.BackendPath("/card/template/list"), body, query);
        }

        /// <summary>
        /// Get all card templates
        /// </summary>
        public async Task<PlusApiResultListPlusCardTemplateVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCardTemplateVO>(ApiPaths.BackendPath("/card/template/list/all"), body);
        }

        /// <summary>
        /// Get membership cards by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCardVO?> CreateListByPageCardAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCardVO>(ApiPaths.BackendPath("/card/list"), body, query);
        }

        /// <summary>
        /// Get all membership cards
        /// </summary>
        public async Task<PlusApiResultListPlusCardVO?> CreateListAllEntitiesCardAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCardVO>(ApiPaths.BackendPath("/card/list/all"), body);
        }

        /// <summary>
        /// Get a membership card by ID
        /// </summary>
        public async Task<PlusApiResultPlusCardVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCardVO>(ApiPaths.BackendPath($"/card/{id}"));
        }

        /// <summary>
        /// Delete a membership card
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/card/{id}"));
        }

        /// <summary>
        /// Get a card template by ID
        /// </summary>
        public async Task<PlusApiResultPlusCardTemplateVO?> GetByIdTemplateAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCardTemplateVO>(ApiPaths.BackendPath($"/card/template/{id}"));
        }

        /// <summary>
        /// Delete a card template
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteTemplateAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/card/template/{id}"));
        }
    }
}
