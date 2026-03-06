using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class KnowledgeBaseFileApi
    {
        private readonly HttpClient _client;

        public KnowledgeBaseFileApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// List files
        /// </summary>
        public async Task<PlusApiResultFileListVO?> ListFilesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultFileListVO>(ApiPaths.BackendPath("/knowledge_base/files"), query);
        }

        /// <summary>
        /// Upload file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> UploadFileAsync(UploadFilePostRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath("/knowledge_base/files"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// List files
        /// </summary>
        public async Task<PlusApiResultFileListVO?> GetListFilesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultFileListVO>(ApiPaths.BackendPath("/disk/files"), query);
        }

        /// <summary>
        /// Upload file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> CreateUploadFileAsync(CreateUploadFileRequest? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath("/disk/files"), body, query, null, "multipart/form-data");
        }

        /// <summary>
        /// Get file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> GetFileAsync(string fileId)
        {
            return await _client.GetAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/knowledge_base/files/{fileId}"));
        }

        /// <summary>
        /// Delete file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> DeleteFileAsync(string fileId)
        {
            return await _client.DeleteAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/knowledge_base/files/{fileId}"));
        }

        /// <summary>
        /// Get file content
        /// </summary>
        public async Task<string?> GetFileContentAsync(string fileId)
        {
            return await _client.GetAsync<string>(ApiPaths.BackendPath($"/knowledge_base/files/{fileId}/content"));
        }

        /// <summary>
        /// Get file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> GetFileDiskAsync(string fileId)
        {
            return await _client.GetAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/disk/files/{fileId}"));
        }

        /// <summary>
        /// Delete file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> DeleteFileDiskAsync(string fileId)
        {
            return await _client.DeleteAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/disk/files/{fileId}"));
        }

        /// <summary>
        /// Get file content
        /// </summary>
        public async Task<string?> GetFileContentDiskAsync(string fileId)
        {
            return await _client.GetAsync<string>(ApiPaths.BackendPath($"/disk/files/{fileId}/content"));
        }
    }
}
