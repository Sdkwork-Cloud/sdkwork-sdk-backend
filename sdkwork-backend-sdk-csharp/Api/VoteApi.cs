using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VoteApi
    {
        private readonly HttpClient _client;

        public VoteApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing content vote
        /// </summary>
        public async Task<PlusApiResultContentVoteVO?> UpdateAsync(ContentVoteForm body)
        {
            return await _client.PutAsync<PlusApiResultContentVoteVO>(ApiPaths.BackendPath("/vote"), body);
        }

        /// <summary>
        /// Create a new content vote
        /// </summary>
        public async Task<PlusApiResultContentVoteVO?> CreateAsync(ContentVoteForm body)
        {
            return await _client.PostAsync<PlusApiResultContentVoteVO>(ApiPaths.BackendPath("/vote"), body);
        }

        /// <summary>
        /// Get content votes by page
        /// </summary>
        public async Task<PlusApiResultPageContentVoteVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPageContentVoteVO>(ApiPaths.BackendPath("/vote/list"), body, query);
        }

        /// <summary>
        /// Get all content votes
        /// </summary>
        public async Task<PlusApiResultListContentVoteVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListContentVoteVO>(ApiPaths.BackendPath("/vote/list/all"), body);
        }

        /// <summary>
        /// Get a content vote by ID
        /// </summary>
        public async Task<PlusApiResultContentVoteVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultContentVoteVO>(ApiPaths.BackendPath($"/vote/{id}"));
        }

        /// <summary>
        /// Delete a content vote
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/vote/{id}"));
        }
    }
}
