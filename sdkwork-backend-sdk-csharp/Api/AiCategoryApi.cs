using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AiCategoryApi
    {
        private readonly HttpClient _client;

        public AiCategoryApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing category
        /// </summary>
        public async Task<PlusApiResultPlusCategoryVO?> UpdateAsync(PlusCategoryForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCategoryVO>(ApiPaths.BackendPath("/category"), body);
        }

        /// <summary>
        /// Create a new category
        /// </summary>
        public async Task<PlusApiResultPlusCategoryVO?> CreateAsync(PlusCategoryForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCategoryVO>(ApiPaths.BackendPath("/category"), body);
        }

        /// <summary>
        /// Get categories by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCategoryVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCategoryVO>(ApiPaths.BackendPath("/category/list"), body, query);
        }

        /// <summary>
        /// Get all categories
        /// </summary>
        public async Task<PlusApiResultListPlusCategoryVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCategoryVO>(ApiPaths.BackendPath("/category/list/all"), body);
        }

        /// <summary>
        /// Get Tree
        /// </summary>
        public async Task<PlusApiResultSetPlusTreeNodePlusCategoryVO?> GetTreeAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultSetPlusTreeNodePlusCategoryVO>(ApiPaths.BackendPath("/category/get_tree"), body, query);
        }

        /// <summary>
        /// Get a category by ID
        /// </summary>
        public async Task<PlusApiResultPlusCategoryVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCategoryVO>(ApiPaths.BackendPath($"/category/{id}"));
        }

        /// <summary>
        /// Delete a category
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/category/{id}"));
        }
    }
}
