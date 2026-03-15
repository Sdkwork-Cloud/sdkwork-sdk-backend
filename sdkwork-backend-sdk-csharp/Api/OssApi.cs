using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class OssApi
    {
        private readonly HttpClient _client;

        public OssApi(HttpClient client)
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
        /// List files
        /// </summary>
        public async Task<PlusApiResultFileListVO?> ListFilesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultFileListVO>(ApiPaths.BackendPath("/oss/files"), query);
        }

        /// <summary>
        /// Upload file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> UploadFileAsync(UploadFileRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath("/oss/files"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Get upload temporary session
        /// </summary>
        public async Task<PlusApiResultPlusTempSessionVO?> GetTempSessionAsync(PlusGetTempSessionForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusTempSessionVO>(ApiPaths.BackendPath("/oss/files/temp_session"), body);
        }

        /// <summary>
        /// Generate presigned URL
        /// </summary>
        public async Task<PlusApiResultGetUrlResult?> GetPresignedUrlAsync(PlusGetPresignedUrlForm body)
        {
            return await _client.PostAsync<PlusApiResultGetUrlResult>(ApiPaths.BackendPath("/oss/files/get_presigned_url"), body);
        }

        /// <summary>
        /// Upload file
        /// </summary>
        public async Task<PlusApiResultPlusFileVO?> CreateFilesAsync(PlusUploadForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFileVO>(ApiPaths.BackendPath("/oss/files/create"), body);
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
        /// Get file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> GetFileAsync(string fileId)
        {
            return await _client.GetAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/oss/files/{fileId}"));
        }

        /// <summary>
        /// Delete file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> DeleteFileAsync(string fileId)
        {
            return await _client.DeleteAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/oss/files/{fileId}"));
        }

        /// <summary>
        /// Get file content
        /// </summary>
        public async Task<string?> GetFileContentAsync(string fileId)
        {
            return await _client.GetAsync<string>(ApiPaths.BackendPath($"/oss/files/{fileId}/content"));
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
