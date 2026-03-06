using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ConversationApi
    {
        private readonly HttpClient _client;

        public ConversationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing conversation
        /// </summary>
        public async Task<PlusApiResultPlusConversationVO?> UpdateAsync(PlusConversationForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusConversationVO>(ApiPaths.BackendPath("/conversation"), body);
        }

        /// <summary>
        /// Create a new conversation
        /// </summary>
        public async Task<PlusApiResultPlusConversationVO?> CreateAsync(PlusConversationForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusConversationVO>(ApiPaths.BackendPath("/conversation"), body);
        }

        /// <summary>
        /// Pin/Unpin a conversation
        /// </summary>
        public async Task<PlusApiResultPlusConversationVO?> PinAsync(string id, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPlusConversationVO>(ApiPaths.BackendPath($"/conversation/{id}/pin"), null, query);
        }

        /// <summary>
        /// Get all open conversations
        /// </summary>
        public async Task<PlusApiResultPlusConversationVO?> OpenAsync(PlusConversationOpenForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusConversationVO>(ApiPaths.BackendPath("/conversation/open"), body);
        }

        /// <summary>
        /// Update an existing conversation
        /// </summary>
        public async Task<PlusApiResultBoolean?> MessageFeedbackAsync(PlusMessageFeedbackForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/conversation/message_feedback"), body);
        }

        /// <summary>
        /// Get conversations by page
        /// </summary>
        public async Task<PlusApiResultPagePlusConversationVO?> ListByPageAsync(PlusConversationQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusConversationVO>(ApiPaths.BackendPath("/conversation/list"), body, query);
        }

        /// <summary>
        /// Get all conversations
        /// </summary>
        public async Task<PlusApiResultListPlusConversationVO?> ListAllEntitiesAsync(PlusConversationQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusConversationVO>(ApiPaths.BackendPath("/conversation/list/all"), body);
        }

        /// <summary>
        /// Get a conversation by ID
        /// </summary>
        public async Task<PlusApiResultPlusConversationVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusConversationVO>(ApiPaths.BackendPath($"/conversation/{id}"));
        }

        /// <summary>
        /// Delete a conversation
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/conversation/{id}"));
        }
    }
}
