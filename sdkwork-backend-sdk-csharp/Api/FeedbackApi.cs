using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class FeedbackApi
    {
        private readonly HttpClient _client;

        public FeedbackApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update feedback
        /// </summary>
        public async Task<PlusApiResultPlusFeedbackVO?> UpdateAsync(PlusFeedbackForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFeedbackVO>(ApiPaths.BackendPath("/feedback"), body);
        }

        /// <summary>
        /// Create new feedback
        /// </summary>
        public async Task<PlusApiResultPlusFeedbackVO?> CreateAsync(PlusFeedbackForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFeedbackVO>(ApiPaths.BackendPath("/feedback"), body);
        }

        /// <summary>
        /// Get feedback by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFeedbackVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFeedbackVO>(ApiPaths.BackendPath("/feedback/list"), body, query);
        }

        /// <summary>
        /// Get all feedback records
        /// </summary>
        public async Task<PlusApiResultListPlusFeedbackVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFeedbackVO>(ApiPaths.BackendPath("/feedback/list/all"), body);
        }

        /// <summary>
        /// Get feedback by ID
        /// </summary>
        public async Task<PlusApiResultPlusFeedbackVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFeedbackVO>(ApiPaths.BackendPath($"/feedback/{id}"));
        }

        /// <summary>
        /// Delete feedback
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/feedback/{id}"));
        }
    }
}
