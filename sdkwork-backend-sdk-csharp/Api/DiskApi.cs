using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class DiskApi
    {
        private readonly HttpClient _client;

        public DiskApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing file disk
        /// </summary>
        public async Task<PlusApiResultPlusDiskVO?> UpdateAsync(PlusDiskForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDiskVO>(ApiPaths.BackendPath("/disk"), body);
        }

        /// <summary>
        /// Create a new file disk
        /// </summary>
        public async Task<PlusApiResultPlusDiskVO?> CreateAsync(PlusDiskForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDiskVO>(ApiPaths.BackendPath("/disk"), body);
        }

        /// <summary>
        /// Update an existing disk member
        /// </summary>
        public async Task<PlusApiResultPlusDiskMemberVO?> UpdateMemberAsync(PlusDiskMemberForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDiskMemberVO>(ApiPaths.BackendPath("/disk/member"), body);
        }

        /// <summary>
        /// Create a new disk member
        /// </summary>
        public async Task<PlusApiResultPlusDiskMemberVO?> CreateMemberAsync(PlusDiskMemberForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDiskMemberVO>(ApiPaths.BackendPath("/disk/member"), body);
        }

        /// <summary>
        /// Get disk members by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDiskMemberVO?> CreateListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDiskMemberVO>(ApiPaths.BackendPath("/disk/member/list"), body, query);
        }

        /// <summary>
        /// Get all disk members
        /// </summary>
        public async Task<PlusApiResultListPlusDiskMemberVO?> CreateListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDiskMemberVO>(ApiPaths.BackendPath("/disk/member/list/all"), body);
        }

        /// <summary>
        /// Get file disks by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDiskVO?> CreateListByPageDiskAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDiskVO>(ApiPaths.BackendPath("/disk/list"), body, query);
        }

        /// <summary>
        /// Get all file disks
        /// </summary>
        public async Task<PlusApiResultListPlusDiskVO?> CreateListAllEntitiesDiskAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDiskVO>(ApiPaths.BackendPath("/disk/list/all"), body);
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
        /// Get a file disk by ID
        /// </summary>
        public async Task<PlusApiResultPlusDiskVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDiskVO>(ApiPaths.BackendPath($"/disk/{id}"));
        }

        /// <summary>
        /// Delete a file disk
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/disk/{id}"));
        }

        /// <summary>
        /// Get a disk member by ID
        /// </summary>
        public async Task<PlusApiResultPlusDiskMemberVO?> GetByIdMemberAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDiskMemberVO>(ApiPaths.BackendPath($"/disk/member/{id}"));
        }

        /// <summary>
        /// Delete a disk member
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteMemberAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/disk/member/{id}"));
        }

        /// <summary>
        /// Get file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> GetFileAsync(string fileId)
        {
            return await _client.GetAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/disk/files/{fileId}"));
        }

        /// <summary>
        /// Delete file
        /// </summary>
        public async Task<PlusApiResultFileItemVO?> DeleteFileAsync(string fileId)
        {
            return await _client.DeleteAsync<PlusApiResultFileItemVO>(ApiPaths.BackendPath($"/disk/files/{fileId}"));
        }

        /// <summary>
        /// Get file content
        /// </summary>
        public async Task<string?> GetFileContentAsync(string fileId)
        {
            return await _client.GetAsync<string>(ApiPaths.BackendPath($"/disk/files/{fileId}/content"));
        }
    }
}
