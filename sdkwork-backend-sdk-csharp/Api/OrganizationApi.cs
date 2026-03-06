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
        /// Get organizations by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrganizationVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrganizationVO>(ApiPaths.BackendPath("/organization/list"), body, query);
        }

        /// <summary>
        /// Get all organizations
        /// </summary>
        public async Task<PlusApiResultListPlusOrganizationVO?> ListAllEntitiesAsync(QueryListForm? body = null)
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
    }
}
