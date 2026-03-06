using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class TenantApi
    {
        private readonly HttpClient _client;

        public TenantApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing tenant
        /// </summary>
        public async Task<PlusApiResultPlusTenantVO?> UpdateAsync(PlusTenantForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusTenantVO>(ApiPaths.BackendPath("/tenant"), body);
        }

        /// <summary>
        /// Create a new tenant
        /// </summary>
        public async Task<PlusApiResultPlusTenantVO?> CreateAsync(PlusTenantForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusTenantVO>(ApiPaths.BackendPath("/tenant"), body);
        }

        /// <summary>
        /// Uninstall app from tenant
        /// </summary>
        public async Task<PlusApiResultPlusTenantVO?> UninstallAsync(string id, PlusTenantForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusTenantVO>(ApiPaths.BackendPath($"/tenant/{id}/uninstall"), body);
        }

        /// <summary>
        /// Install app for tenant
        /// </summary>
        public async Task<PlusApiResultPlusTenantVO?> InstallAsync(string id, PlusTenantForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusTenantVO>(ApiPaths.BackendPath($"/tenant/{id}/install"), body);
        }

        /// <summary>
        /// Get tenant audit logs by page
        /// </summary>
        public async Task<PlusApiResultPagePlusTenantAuditLogVO?> ListAuditLogsAsync(string id, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusTenantAuditLogVO>(ApiPaths.BackendPath($"/tenant/{id}/audit_logs/list"), null, query);
        }

        /// <summary>
        /// Get tenants by page
        /// </summary>
        public async Task<PlusApiResultPagePlusTenantVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusTenantVO>(ApiPaths.BackendPath("/tenant/list"), body, query);
        }

        /// <summary>
        /// Get all tenants
        /// </summary>
        public async Task<PlusApiResultListPlusTenantVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusTenantVO>(ApiPaths.BackendPath("/tenant/list/all"), body);
        }

        /// <summary>
        /// Get access tokens
        /// </summary>
        public async Task<PlusApiResultListTokenResult?> GetAccessTokensAsync(GetAccessTokenForm body)
        {
            return await _client.PostAsync<PlusApiResultListTokenResult>(ApiPaths.BackendPath("/tenant/get_access_tokens"), body);
        }

        /// <summary>
        /// Get a tenant by ID
        /// </summary>
        public async Task<PlusApiResultPlusTenantVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusTenantVO>(ApiPaths.BackendPath($"/tenant/{id}"));
        }

        /// <summary>
        /// Delete a tenant
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/tenant/{id}"));
        }
    }
}
