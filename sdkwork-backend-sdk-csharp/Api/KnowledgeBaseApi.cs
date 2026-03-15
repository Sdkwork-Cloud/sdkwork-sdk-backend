using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class KnowledgeBaseApi
    {
        private readonly HttpClient _client;

        public KnowledgeBaseApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing knowledge base
        /// </summary>
        public async Task<PlusApiResultPlusKnowledgeBaseVO?> UpdateAsync(PlusKnowledgeBaseForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base"), body);
        }

        /// <summary>
        /// Create a new knowledge base
        /// </summary>
        public async Task<PlusApiResultPlusKnowledgeBaseVO?> CreateAsync(PlusKnowledgeBaseForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base"), body);
        }

        /// <summary>
        /// Get knowledge bases by page
        /// </summary>
        public async Task<PlusApiResultPagePlusKnowledgeBaseVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base/list"), body, query);
        }

        /// <summary>
        /// Get all knowledge bases
        /// </summary>
        public async Task<PlusApiResultListPlusKnowledgeBaseVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base/list/all"), body);
        }

        /// <summary>
        /// Get a knowledge base detail by ID
        /// </summary>
        public async Task<PlusApiResultPlusKnowledgeBaseVO?> GetDetailAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPlusKnowledgeBaseVO>(ApiPaths.BackendPath("/knowledge_base/get_detail"), null, query);
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

        public async Task<PlusApiResultBoolean?> StopAsync(Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/knowledge_base/chat/stop"), null, query, headers);
        }

        /// <summary>
        /// Create a chat completion with Knowledge base
        /// </summary>
        public async Task<ChatCompletionChunk?> CreateCompletionsAsync(ChatCompletionCreateForm body, Dictionary<string, object>? query = null, Dictionary<string, string>? headers = null)
        {
            return await _client.PostAsync<ChatCompletionChunk>(ApiPaths.BackendPath("/knowledge_base/chat/completions"), body, query, headers);
        }

        /// <summary>
        /// Get a knowledge base by ID
        /// </summary>
        public async Task<PlusApiResultPlusKnowledgeBaseVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusKnowledgeBaseVO>(ApiPaths.BackendPath($"/knowledge_base/{id}"));
        }

        /// <summary>
        /// Delete a knowledge base
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/knowledge_base/{id}"));
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
    }
}
