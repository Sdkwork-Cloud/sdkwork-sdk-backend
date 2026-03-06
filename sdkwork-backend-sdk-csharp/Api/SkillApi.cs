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
        public async Task<PlusApiResultPlusAgentSkillVO?> EnableAsync(string id)
        {
            return await _client.PostAsync<PlusApiResultPlusAgentSkillVO>(ApiPaths.BackendPath($"/skill/{id}/enable"), null);
        }

        /// <summary>
        /// Disable skill
        /// </summary>
        public async Task<PlusApiResultPlusAgentSkillVO?> DisableAsync(string id)
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
        /// Query skill list by page
        /// </summary>
        public async Task<PlusApiResultPagePlusAgentSkillVO?> ListByPageAsync(PlusAgentSkillQueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusAgentSkillVO>(ApiPaths.BackendPath("/skill/list"), body, query);
        }

        /// <summary>
        /// Query all skills
        /// </summary>
        public async Task<PlusApiResultListPlusAgentSkillVO?> ListAllAsync(PlusAgentSkillQueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusAgentSkillVO>(ApiPaths.BackendPath("/skill/list/all"), body);
        }
    }
}
