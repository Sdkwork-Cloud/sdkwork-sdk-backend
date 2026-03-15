using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class OrganizationApi
    {
        private readonly HttpClient _client;

        public OrganizationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing organization
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationVO?> UpdateAsync(PlusOrganizationForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrganizationVO>(ApiPaths.BackendPath("/organization"), body);
        }

        /// <summary>
        /// Create a new organization
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationVO?> CreateAsync(PlusOrganizationForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrganizationVO>(ApiPaths.BackendPath("/organization"), body);
        }

        /// <summary>
        /// Update an existing position
        /// </summary>
        public async Task<PlusApiResultPlusPositionVO?> UpdatePositionAsync(PlusPositionForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusPositionVO>(ApiPaths.BackendPath("/organization/position"), body);
        }

        /// <summary>
        /// Create a new position
        /// </summary>
        public async Task<PlusApiResultPlusPositionVO?> CreatePositionAsync(PlusPositionForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusPositionVO>(ApiPaths.BackendPath("/organization/position"), body);
        }

        /// <summary>
        /// Update member relation
        /// </summary>
        public async Task<PlusApiResultPlusMemberRelationsVO?> UpdateMemberRelationsAsync(PlusMemberRelationsForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusMemberRelationsVO>(ApiPaths.BackendPath("/organization/member-relations"), body);
        }

        /// <summary>
        /// Create member relation
        /// </summary>
        public async Task<PlusApiResultPlusMemberRelationsVO?> CreateMemberRelationsAsync(PlusMemberRelationsForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMemberRelationsVO>(ApiPaths.BackendPath("/organization/member-relations"), body);
        }

        /// <summary>
        /// Uninstall app from organization
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationVO?> UninstallAsync(string id, PlusOrganizationForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrganizationVO>(ApiPaths.BackendPath($"/organization/{id}/uninstall"), body);
        }

        /// <summary>
        /// Install app for organization
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationVO?> InstallAsync(string id, PlusOrganizationForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrganizationVO>(ApiPaths.BackendPath($"/organization/{id}/install"), body);
        }

        /// <summary>
        /// Get positions by page
        /// </summary>
        public async Task<PlusApiResultPagePlusPositionVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusPositionVO>(ApiPaths.BackendPath("/organization/position/list"), body, query);
        }

        /// <summary>
        /// Get all positions
        /// </summary>
        public async Task<PlusApiResultListPlusPositionVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusPositionVO>(ApiPaths.BackendPath("/organization/position/list/all"), body);
        }

        /// <summary>
        /// Get member relations by page
        /// </summary>
        public async Task<PlusApiResultPagePlusMemberRelationsVO?> CreateListByPageMemberRelationsAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusMemberRelationsVO>(ApiPaths.BackendPath("/organization/member-relations/list"), body, query);
        }

        /// <summary>
        /// Get all member relations
        /// </summary>
        public async Task<PlusApiResultListPlusMemberRelationsVO?> CreateListAllEntitiesMemberRelationsAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusMemberRelationsVO>(ApiPaths.BackendPath("/organization/member-relations/list/all"), body);
        }

        /// <summary>
        /// Get organizations by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrganizationVO?> CreateListByPageOrganizationAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrganizationVO>(ApiPaths.BackendPath("/organization/list"), body, query);
        }

        /// <summary>
        /// Get all organizations
        /// </summary>
        public async Task<PlusApiResultListPlusOrganizationVO?> CreateListAllEntitiesOrganizationAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrganizationVO>(ApiPaths.BackendPath("/organization/list/all"), body);
        }

        /// <summary>
        /// Get access tokens
        /// </summary>
        public async Task<PlusApiResultListTokenResult?> GetAccessTokensAsync(GetAccessTokenForm body)
        {
            return await _client.PostAsync<PlusApiResultListTokenResult>(ApiPaths.BackendPath("/organization/get_access_tokens"), body);
        }

        /// <summary>
        /// Get an organization by ID
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrganizationVO>(ApiPaths.BackendPath($"/organization/{id}"));
        }

        /// <summary>
        /// Delete an organization
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization/{id}"));
        }

        /// <summary>
        /// Get child organizations
        /// </summary>
        public async Task<PlusApiResultListPlusOrganizationVO?> GetChildrenAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultListPlusOrganizationVO>(ApiPaths.BackendPath($"/organization/{id}/children"));
        }

        /// <summary>
        /// Get a position by ID
        /// </summary>
        public async Task<PlusApiResultPlusPositionVO?> GetByIdPositionAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusPositionVO>(ApiPaths.BackendPath($"/organization/position/{id}"));
        }

        /// <summary>
        /// Delete a position
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeletePositionAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization/position/{id}"));
        }

        /// <summary>
        /// Get member relation by ID
        /// </summary>
        public async Task<PlusApiResultPlusMemberRelationsVO?> GetByIdMemberRelationsAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusMemberRelationsVO>(ApiPaths.BackendPath($"/organization/member-relations/{id}"));
        }

        /// <summary>
        /// Delete member relation
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteMemberRelationsAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization/member-relations/{id}"));
        }
    }
}
