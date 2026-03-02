using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class InvitationRelationApi
    {
        private readonly HttpClient _client;

        public InvitationRelationApi(HttpClient client)
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
        /// Get invitation relations by page
        /// </summary>
        public async Task<PlusApiResultPageInvitationRelationVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPageInvitationRelationVO>(ApiPaths.BackendPath("/invitation/relation/list"), body, query);
        }

        /// <summary>
        /// Get all invitation relations
        /// </summary>
        public async Task<PlusApiResultListInvitationRelationVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListInvitationRelationVO>(ApiPaths.BackendPath("/invitation/relation/list/all"), body);
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
    }
}
