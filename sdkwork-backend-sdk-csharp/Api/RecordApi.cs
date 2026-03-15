using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class RecordApi
    {
        private readonly HttpClient _client;

        public RecordApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing invocation record
        /// </summary>
        public async Task<PlusApiResultPlusInvokeRecordVO?> UpdateAsync(PlusInvokeRecordForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusInvokeRecordVO>(ApiPaths.BackendPath("/record"), body);
        }

        /// <summary>
        /// Create a new invocation record
        /// </summary>
        public async Task<PlusApiResultPlusInvokeRecordVO?> CreateAsync(PlusInvokeRecordForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusInvokeRecordVO>(ApiPaths.BackendPath("/record"), body);
        }

        /// <summary>
        /// Get invocation records by page
        /// </summary>
        public async Task<PlusApiResultPagePlusInvokeRecordVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusInvokeRecordVO>(ApiPaths.BackendPath("/record/list"), body, query);
        }

        /// <summary>
        /// Get all invocation records
        /// </summary>
        public async Task<PlusApiResultListPlusInvokeRecordVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusInvokeRecordVO>(ApiPaths.BackendPath("/record/list/all"), body);
        }

        /// <summary>
        /// Get an invocation record by ID
        /// </summary>
        public async Task<PlusApiResultPlusInvokeRecordVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusInvokeRecordVO>(ApiPaths.BackendPath($"/record/{id}"));
        }

        /// <summary>
        /// Delete an invocation record
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/record/{id}"));
        }
    }
}
