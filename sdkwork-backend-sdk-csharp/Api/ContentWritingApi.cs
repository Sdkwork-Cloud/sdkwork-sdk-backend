using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class ContentWritingApi
    {
        private readonly HttpClient _client;

        public ContentWritingApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Rename chapter
        /// </summary>
        public async Task<FileTreeNodeVO?> RenameChapterAsync(string fileId, string body)
        {
            return await _client.PutAsync<FileTreeNodeVO>(ApiPaths.BackendPath($"/content-writing/chapters/{fileId}/rename"), body);
        }

        /// <summary>
        /// Move chapter
        /// </summary>
        public async Task<FileTreeNodeVO?> MoveChapterAsync(string fileId, int body)
        {
            return await _client.PutAsync<FileTreeNodeVO>(ApiPaths.BackendPath($"/content-writing/chapters/{fileId}/move"), body);
        }

        /// <summary>
        /// Get chapter content
        /// </summary>
        public async Task<string?> GetChapterContentAsync(string fileId)
        {
            return await _client.GetAsync<string>(ApiPaths.BackendPath($"/content-writing/chapters/{fileId}"));
        }

        /// <summary>
        /// Update chapter
        /// </summary>
        public async Task<FileTreeNodeVO?> UpdateChapterAsync(string fileId, string body)
        {
            return await _client.PutAsync<FileTreeNodeVO>(ApiPaths.BackendPath($"/content-writing/chapters/{fileId}"), body);
        }

        /// <summary>
        /// Delete chapter
        /// </summary>
        public async Task DeleteChapterAsync(string fileId)
        {
            await _client.DeleteAsync<object>(ApiPaths.BackendPath($"/content-writing/chapters/{fileId}"));
        }

        /// <summary>
        /// Create chapter
        /// </summary>
        public async Task<FileTreeNodeVO?> CreateChapterAsync(CreateChapterForm body)
        {
            return await _client.PostAsync<FileTreeNodeVO>(ApiPaths.BackendPath("/content-writing/chapters"), body);
        }

        /// <summary>
        /// Get all contents
        /// </summary>
        public async Task<GetAllContentsResponse?> GetAllContentsAsync()
        {
            return await _client.GetAsync<GetAllContentsResponse>(ApiPaths.BackendPath("/content-writing"));
        }

        /// <summary>
        /// Create content
        /// </summary>
        public async Task<ContentWorkVO?> CreateContentAsync(CreateContentForm body)
        {
            return await _client.PostAsync<ContentWorkVO>(ApiPaths.BackendPath("/content-writing"), body);
        }

        /// <summary>
        /// Get content
        /// </summary>
        public async Task<ContentWorkVO?> GetContentAsync(string id)
        {
            return await _client.GetAsync<ContentWorkVO>(ApiPaths.BackendPath($"/content-writing/{id}"));
        }

        /// <summary>
        /// Delete content
        /// </summary>
        public async Task DeleteContentAsync(string id)
        {
            await _client.DeleteAsync<object>(ApiPaths.BackendPath($"/content-writing/{id}"));
        }

        /// <summary>
        /// Get directory tree
        /// </summary>
        public async Task<FileTreeNodeVO?> GetDirectoryTreeAsync(string contentWorkId)
        {
            return await _client.GetAsync<FileTreeNodeVO>(ApiPaths.BackendPath($"/content-writing/{contentWorkId}/tree"));
        }

        /// <summary>
        /// Get content stats
        /// </summary>
        public async Task<ContentStatsVO?> GetContentStatsAsync(string contentWorkId)
        {
            return await _client.GetAsync<ContentStatsVO>(ApiPaths.BackendPath($"/content-writing/{contentWorkId}/stats"));
        }

        /// <summary>
        /// Get all scripts
        /// </summary>
        public async Task<GetAllScriptsResponse?> GetAllScriptsAsync()
        {
            return await _client.GetAsync<GetAllScriptsResponse>(ApiPaths.BackendPath("/content-writing/scripts"));
        }

        /// <summary>
        /// Get all prose
        /// </summary>
        public async Task<GetAllProseResponse?> GetAllProseAsync()
        {
            return await _client.GetAsync<GetAllProseResponse>(ApiPaths.BackendPath("/content-writing/prose"));
        }

        /// <summary>
        /// Get all novels
        /// </summary>
        public async Task<GetAllNovelsResponse?> GetAllNovelsAsync()
        {
            return await _client.GetAsync<GetAllNovelsResponse>(ApiPaths.BackendPath("/content-writing/novels"));
        }

        /// <summary>
        /// Get all articles
        /// </summary>
        public async Task<GetAllArticlesResponse?> GetAllArticlesAsync()
        {
            return await _client.GetAsync<GetAllArticlesResponse>(ApiPaths.BackendPath("/content-writing/articles"));
        }
    }
}
