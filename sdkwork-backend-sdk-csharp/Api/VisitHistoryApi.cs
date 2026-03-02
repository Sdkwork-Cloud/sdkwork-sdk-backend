using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class VisitHistoryApi
    {
        private readonly HttpClient _client;

        public VisitHistoryApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update Visit History
        /// </summary>
        public async Task<PlusApiResultPlusVisitHistoryVO?> UpdateAsync(PlusVisitHistoryForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusVisitHistoryVO>(ApiPaths.BackendPath("/visit_history"), body);
        }

        /// <summary>
        /// Create Visit History
        /// </summary>
        public async Task<PlusApiResultPlusVisitHistoryVO?> CreateAsync(PlusVisitHistoryForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusVisitHistoryVO>(ApiPaths.BackendPath("/visit_history"), body);
        }

        /// <summary>
        /// List Visit Histories by Page
        /// </summary>
        public async Task<PlusApiResultPagePlusVisitHistoryVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusVisitHistoryVO>(ApiPaths.BackendPath("/visit_history/list"), body, query);
        }

        /// <summary>
        /// List All Visit Histories
        /// </summary>
        public async Task<PlusApiResultListPlusVisitHistoryVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusVisitHistoryVO>(ApiPaths.BackendPath("/visit_history/list/all"), body);
        }

        /// <summary>
        /// Get Visit History by ID
        /// </summary>
        public async Task<PlusApiResultPlusVisitHistoryVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusVisitHistoryVO>(ApiPaths.BackendPath($"/visit_history/{id}"));
        }

        /// <summary>
        /// Delete Visit History
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/visit_history/{id}"));
        }
    }
}
