using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class SkillApi
    {
        private readonly HttpClient _client;

        public SkillApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get one skill detail
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}"));
        }

        /// <summary>
        /// Update skill
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> UpdateAsync(string id, PlusAgentSkillForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}"), body);
        }

        /// <summary>
        /// Get skill package detail
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> GetByIdPackageAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath($"/skill/package/{id}"));
        }

        /// <summary>
        /// Update skill package
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> UpdatePackageAsync(string id, PlusAgentSkillPackageForm body)
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
        /// Create skill
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> CreateAsync(PlusAgentSkillForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath("/skill"), body);
        }

        /// <summary>
        /// Submit skill for review
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> SubmitForReviewAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/review/submit"), null);
        }

        /// <summary>
        /// Reject skill review
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> RejectReviewAsync(string id, PlusAgentSkillReviewForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/review/reject"), body);
        }

        /// <summary>
        /// Approve skill review
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> ApproveReviewAsync(string id, PlusAgentSkillReviewForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/review/approve"), body);
        }

        /// <summary>
        /// Publish skill
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> PublishAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/publish"), null);
        }

        /// <summary>
        /// Offline skill
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> OfflineAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/offline"), null);
        }

        /// <summary>
        /// Update skill featured status
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> UpdateFeatureAsync(string id, PlusAgentSkillFeatureForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/feature"), body);
        }

        /// <summary>
        /// Enable skill
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> CreateEnableAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/enable"), null);
        }

        /// <summary>
        /// Disable skill
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> CreateDisableAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/disable"), null);
        }

        /// <summary>
        /// List pending review skills by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAgentSkillVO?> ListPendingReviewByPageAsync(PlusAgentSkillQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAgentSkillVO>(ApiPaths.BackendPath("/skill/review/pending/list"), body, query);
        }

        /// <summary>
        /// Batch reject skill review
        /// </summary>
        public async Task<PlusApiResultListPlusAgentSkillVO?> BatchRejectReviewAsync(PlusAgentSkillBatchReviewForm body)
        {
            return await _client.PostAsync<PlusApiResultListPlusAgentSkillVO>(ApiPaths.BackendPath("/skill/review/batch/reject"), body);
        }

        /// <summary>
        /// Batch approve skill review
        /// </summary>
        public async Task<PlusApiResultListPlusAgentSkillVO?> BatchApproveReviewAsync(PlusAgentSkillBatchReviewForm body)
        {
            return await _client.PostAsync<PlusApiResultListPlusAgentSkillVO>(ApiPaths.BackendPath("/skill/review/batch/approve"), body);
        }

        /// <summary>
        /// Create skill package
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> CreatePackageAsync(PlusAgentSkillPackageForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath("/skill/package"), body);
        }

        /// <summary>
        /// Enable skill package
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> CreateEnablePackageAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath($"/skill/package/{id}/enable"), null);
        }

        /// <summary>
        /// Disable skill package
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillPackageVO?> CreateDisablePackageAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillPackageVO>(ApiPaths.BackendPath($"/skill/package/{id}/disable"), null);
        }

        /// <summary>
        /// Query skill package list by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAgentSkillPackageVO?> CreateListByPageAsync(PlusAgentSkillPackageQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAgentSkillPackageVO>(ApiPaths.BackendPath("/skill/package/list"), body, query);
        }

        /// <summary>
        /// Query all skill packages
        /// </summary>
        public async Task<PlusApiResultListPlusAgentSkillPackageVO?> CreateListAllAsync(PlusAgentSkillPackageQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAgentSkillPackageVO>(ApiPaths.BackendPath("/skill/package/list/all"), body);
        }

        /// <summary>
        /// Query skill list by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAgentSkillVO?> CreateListByPageSkillAsync(PlusAgentSkillQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAgentSkillVO>(ApiPaths.BackendPath("/skill/list"), body, query);
        }

        /// <summary>
        /// Query all skills
        /// </summary>
        public async Task<PlusApiResultListPlusAgentSkillVO?> CreateListAllSkillAsync(PlusAgentSkillQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAgentSkillVO>(ApiPaths.BackendPath("/skill/list/all"), body);
        }
    }
}
