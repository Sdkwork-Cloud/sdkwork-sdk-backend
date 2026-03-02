using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class CommentApi
    {
        private readonly HttpClient _client;

        public CommentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing comment
        /// </summary>
        public async Task<PlusApiResultPlusCommentsVO?> UpdateAsync(PlusCommentsForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusCommentsVO>(ApiPaths.BackendPath("/comments"), body);
        }

        /// <summary>
        /// Create a new comment
        /// </summary>
        public async Task<PlusApiResultPlusCommentsVO?> CreateAsync(PlusCommentsForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCommentsVO>(ApiPaths.BackendPath("/comments"), body);
        }

        /// <summary>
        /// Unlike a comment
        /// </summary>
        public async Task<PlusApiResultPlusCommentsVO?> UnlikeAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusCommentsVO>(ApiPaths.BackendPath($"/comments/{id}/unlike"), null);
        }

        /// <summary>
        /// Reply to a comment
        /// </summary>
        public async Task<PlusApiResultPlusCommentsVO?> ReplyAsync(string id, PlusCommentsReplyForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusCommentsVO>(ApiPaths.BackendPath($"/comments/{id}/reply"), body);
        }

        /// <summary>
        /// Like a comment
        /// </summary>
        public async Task<PlusApiResultPlusCommentsVO?> LikeAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusCommentsVO>(ApiPaths.BackendPath($"/comments/{id}/like"), null);
        }

        /// <summary>
        /// Get comments by page
        /// </summary>
        public async Task<PlusApiResultPagePlusCommentsVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusCommentsVO>(ApiPaths.BackendPath("/comments/list"), body, query);
        }

        /// <summary>
        /// Get all comments
        /// </summary>
        public async Task<PlusApiResultListPlusCommentsVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusCommentsVO>(ApiPaths.BackendPath("/comments/list/all"), body);
        }

        /// <summary>
        /// Get a comment by ID
        /// </summary>
        public async Task<PlusApiResultPlusCommentsVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusCommentsVO>(ApiPaths.BackendPath($"/comments/{id}"));
        }

        /// <summary>
        /// Delete a comment
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/comments/{id}"));
        }
    }
}
