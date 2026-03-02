using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class OssBucketApi
    {
        private readonly HttpClient _client;

        public OssBucketApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing OSS bucket
        /// </summary>
        public async Task<PlusApiResultPlusOssBucketVO?> UpdateAsync(PlusOssBucketForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOssBucketVO>(ApiPaths.BackendPath("/oss/bucket"), body);
        }

        /// <summary>
        /// Create a new OSS bucket
        /// </summary>
        public async Task<PlusApiResultPlusOssBucketVO?> CreateAsync(PlusOssBucketForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOssBucketVO>(ApiPaths.BackendPath("/oss/bucket"), body);
        }

        /// <summary>
        /// Get OSS buckets by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOssBucketVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOssBucketVO>(ApiPaths.BackendPath("/oss/bucket/list"), body, query);
        }

        /// <summary>
        /// Get all OSS buckets
        /// </summary>
        public async Task<PlusApiResultListPlusOssBucketVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOssBucketVO>(ApiPaths.BackendPath("/oss/bucket/list/all"), body);
        }

        /// <summary>
        /// Get an OSS bucket by ID
        /// </summary>
        public async Task<PlusApiResultPlusOssBucketVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOssBucketVO>(ApiPaths.BackendPath($"/oss/bucket/{id}"));
        }

        /// <summary>
        /// Delete an OSS bucket
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/oss/bucket/{id}"));
        }
    }
}
