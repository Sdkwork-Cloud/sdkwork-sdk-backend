using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class InvitationApi
    {
        private readonly HttpClient _client;

        public InvitationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an invitation relation
        /// </summary>
        public async Task<PlusApiResultInvitationRelationVO?> UpdateAsync(InvitationRelationForm body)
        {
            return await _client.PutAsync<PlusApiResultInvitationRelationVO>(ApiPaths.BackendPath("/invitation/relation"), body);
        }

        /// <summary>
        /// Create a new invitation relation
        /// </summary>
        public async Task<PlusApiResultInvitationRelationVO?> CreateAsync(InvitationRelationForm body)
        {
            return await _client.PostAsync<PlusApiResultInvitationRelationVO>(ApiPaths.BackendPath("/invitation/relation"), body);
        }

        /// <summary>
        /// Update an existing invitation code
        /// </summary>
        public async Task<PlusApiResultInvitationCodeVO?> UpdateCodeAsync(InvitationCodeForm body)
        {
            return await _client.PutAsync<PlusApiResultInvitationCodeVO>(ApiPaths.BackendPath("/invitation/code"), body);
        }

        /// <summary>
        /// Create a new invitation code
        /// </summary>
        public async Task<PlusApiResultInvitationCodeVO?> CreateCodeAsync(InvitationCodeForm body)
        {
            return await _client.PostAsync<PlusApiResultInvitationCodeVO>(ApiPaths.BackendPath("/invitation/code"), body);
        }

        /// <summary>
        /// Get invitation relations by page
        /// </summary>
        public async Task<PlusApiResultPageInvitationRelationVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPageInvitationRelationVO>(ApiPaths.BackendPath("/invitation/relation/list"), body, query);
        }

        /// <summary>
        /// Get all invitation relations
        /// </summary>
        public async Task<PlusApiResultListInvitationRelationVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListInvitationRelationVO>(ApiPaths.BackendPath("/invitation/relation/list/all"), body);
        }

        /// <summary>
        /// Get invitation codes by page
        /// </summary>
        public async Task<PlusApiResultPageInvitationCodeVO?> CreateListByPageCodeAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPageInvitationCodeVO>(ApiPaths.BackendPath("/invitation/code/list"), body, query);
        }

        /// <summary>
        /// Get all invitation codes
        /// </summary>
        public async Task<PlusApiResultListInvitationCodeVO?> CreateListAllEntitiesCodeAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListInvitationCodeVO>(ApiPaths.BackendPath("/invitation/code/list/all"), body);
        }

        /// <summary>
        /// Get an invitation relation by ID
        /// </summary>
        public async Task<PlusApiResultInvitationRelationVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultInvitationRelationVO>(ApiPaths.BackendPath($"/invitation/relation/{id}"));
        }

        /// <summary>
        /// Delete an invitation relation
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/invitation/relation/{id}"));
        }

        /// <summary>
        /// Get an invitation code by ID
        /// </summary>
        public async Task<PlusApiResultInvitationCodeVO?> GetByIdCodeAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultInvitationCodeVO>(ApiPaths.BackendPath($"/invitation/code/{id}"));
        }

        /// <summary>
        /// Delete an invitation code
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteCodeAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/invitation/code/{id}"));
        }
    }
}
