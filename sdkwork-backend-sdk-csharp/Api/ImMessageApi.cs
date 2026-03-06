using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ImMessageApi
    {
        private readonly HttpClient _client;

        public ImMessageApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Mark conversation messages as read
        /// </summary>
        public async Task<PlusApiResultBoolean?> MarkReadAsync(PlusImMessageMarkReadForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/im/message/mark_read"), body);
        }

        /// <summary>
        /// Get messages by page
        /// </summary>
        public async Task<PlusApiResultPagePlusMessage?> ListByPageAsync(PlusImMessageQueryForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusMessage>(ApiPaths.BackendPath("/im/message/list"), body, query);
        }
    }
}
