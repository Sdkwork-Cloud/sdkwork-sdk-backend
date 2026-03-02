using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class FileApi
    {
        private readonly HttpClient _client;

        public FileApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update existing file metadata
        /// </summary>
        public async Task<PlusApiResultPlusFileVO?> UpdateAsync(PlusFileForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusFileVO>(ApiPaths.BackendPath("/file"), body);
        }

        /// <summary>
        /// Create a new file metadata
        /// </summary>
        public async Task<PlusApiResultPlusFileVO?> CreateAsync(PlusFileForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusFileVO>(ApiPaths.BackendPath("/file"), body);
        }

        /// <summary>
        /// 获取文件列表
        /// </summary>
        public async Task<PlusApiResultFileListVO?> ListFilesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultFileListVO>(ApiPaths.BackendPath("/oss/files"), query);
        }

        /// <summary>
        /// 上传文件
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> UploadAsync(UploadFileRequest? body = null, Dictionary<string, object>? query = null)
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
        /// Get file metadata by page
        /// </summary>
        public async Task<PlusApiResultPagePlusFileVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusFileVO>(ApiPaths.BackendPath("/file/list"), body, query);
        }

        /// <summary>
        /// Get all file metadata
        /// </summary>
        public async Task<PlusApiResultListPlusFileVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusFileVO>(ApiPaths.BackendPath("/file/list/all"), body);
        }

        /// <summary>
        /// Get Tree
        /// </summary>
        public async Task<PlusApiResultSetPlusTreeNodePlusFileVO?> GetTreeAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultSetPlusTreeNodePlusFileVO>(ApiPaths.BackendPath("/file/get_tree"), body, query);
        }

        /// <summary>
        /// 获取单个文件信息
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> GetFileAsync(string fileId)
        {
            return await _client.GetAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/oss/files/{fileId}"));
        }

        /// <summary>
        /// 删除文件
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> DeleteFileAsync(string fileId)
        {
            return await _client.DeleteAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/oss/files/{fileId}"));
        }

        /// <summary>
        /// 获取文件内容
        /// </summary>
        public async Task<string?> GetFileContentAsync(string fileId)
        {
            return await _client.GetAsync<string>(ApiPaths.BackendPath($"/oss/files/{fileId}/content"));
        }

        /// <summary>
        /// Get file metadata by ID
        /// </summary>
        public async Task<PlusApiResultPlusFileVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusFileVO>(ApiPaths.BackendPath($"/file/{id}"));
        }

        /// <summary>
        /// Delete file metadata
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/file/{id}"));
        }
    }
}
