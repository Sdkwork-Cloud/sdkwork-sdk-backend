using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class FavoriteApi
    {
        private readonly HttpClient _client;

        public FavoriteApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing favorite
        /// </summary>
        public async Task<PlusApiResultPlusFavoriteVO?> UpdateAsync(PlusFavoriteForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFavoriteVO>(ApiPaths.BackendPath("/favorite"), body);
        }

        /// <summary>
        /// Create a new favorite
        /// </summary>
        public async Task<PlusApiResultPlusFavoriteVO?> CreateAsync(PlusFavoriteForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFavoriteVO>(ApiPaths.BackendPath("/favorite"), body);
        }

        /// <summary>
        /// Get favorites by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFavoriteVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFavoriteVO>(ApiPaths.BackendPath("/favorite/list"), body, query);
        }

        /// <summary>
        /// Get all favorites
        /// </summary>
        public async Task<PlusApiResultListPlusFavoriteVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFavoriteVO>(ApiPaths.BackendPath("/favorite/list/all"), body);
        }

        /// <summary>
        /// Get a favorite by ID
        /// </summary>
        public async Task<PlusApiResultPlusFavoriteVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFavoriteVO>(ApiPaths.BackendPath($"/favorite/{id}"));
        }

        /// <summary>
        /// Delete a favorite
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/favorite/{id}"));
        }
    }
}
