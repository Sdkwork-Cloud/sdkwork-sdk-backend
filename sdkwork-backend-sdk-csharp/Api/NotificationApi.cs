using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class NotificationApi
    {
        private readonly HttpClient _client;

        public NotificationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing notification
        /// </summary>
        public async Task<PlusApiResultPlusNotificationVO?> UpdateAsync(PlusNotificationForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusNotificationVO>(ApiPaths.BackendPath("/notification"), body);
        }

        /// <summary>
        /// Create a new notification
        /// </summary>
        public async Task<PlusApiResultPlusNotificationVO?> CreateAsync(PlusNotificationForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusNotificationVO>(ApiPaths.BackendPath("/notification"), body);
        }

        /// <summary>
        /// Get notifications by page
        /// </summary>
        public async Task<PlusApiResultPagePlusNotificationVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusNotificationVO>(ApiPaths.BackendPath("/notification/list"), body, query);
        }

        /// <summary>
        /// Get all notifications
        /// </summary>
        public async Task<PlusApiResultListPlusNotificationVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusNotificationVO>(ApiPaths.BackendPath("/notification/list/all"), body);
        }

        /// <summary>
        /// Get a notification by ID
        /// </summary>
        public async Task<PlusApiResultPlusNotificationVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusNotificationVO>(ApiPaths.BackendPath($"/notification/{id}"));
        }

        /// <summary>
        /// Delete a notification
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/notification/{id}"));
        }
    }
}
