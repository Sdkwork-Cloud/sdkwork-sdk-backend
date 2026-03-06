using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class SkillPackageApi
    {
        private readonly HttpClient _client;

        public SkillPackageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get skill package detail
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath($"/skill/package/{id}"));
        }

        /// <summary>
        /// Update skill package
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> UpdateAsync(string id, PlusAgentSkillPackageForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath($"/skill/package/{id}"), body);
        }

        /// <summary>
        /// Delete skill package
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/skill/package/{id}"));
        }

        /// <summary>
        /// Create skill package
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> CreateAsync(PlusAgentSkillPackageForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath("/skill/package"), body);
        }

        /// <summary>
        /// Enable skill package
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> EnableAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath($"/skill/package/{id}/enable"), null);
        }

        /// <summary>
        /// Disable skill package
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> DisableAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath($"/skill/package/{id}/disable"), null);
        }

        /// <summary>
        /// Query skill package list by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAgentSkillPackageVO?> ListByPageAsync(PlusAgentSkillPackageQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAgentSkillPackageVO>(ApiPaths.BackendPath("/skill/package/list"), body, query);
        }

        /// <summary>
        /// Query all skill packages
        /// </summary>
        public async Task<PlusApiResultListPlusAgentSkillPackageVO?> ListAllAsync(PlusAgentSkillPackageQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAgentSkillPackageVO>(ApiPaths.BackendPath("/skill/package/list/all"), body);
        }
    }
}
