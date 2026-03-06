using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class NotesApi
    {
        private readonly HttpClient _client;

        public NotesApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update a note
        /// </summary>
        public async Task<PlusApiResultPlusNotesVO?> UpdateAsync(PlusNotesForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusNotesVO>(ApiPaths.BackendPath("/notes"), body);
        }

        /// <summary>
        /// Create a note
        /// </summary>
        public async Task<PlusApiResultPlusNotesVO?> CreateAsync(PlusNotesForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusNotesVO>(ApiPaths.BackendPath("/notes"), body);
        }

        /// <summary>
        /// Publish notes directly
        /// </summary>
        public async Task<PlusApiResultPlusMediaPublishResultDTO?> PublishNotesToMediaAsync(PlusNotesMediaDraftForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMediaPublishResultDTO>(ApiPaths.BackendPath("/notes/media/publish"), body);
        }

        /// <summary>
        /// Create media draft
        /// </summary>
        public async Task<PlusApiResultPlusMediaPublishResultDTO?> CreateMediaDraftAsync(PlusNotesMediaDraftForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMediaPublishResultDTO>(ApiPaths.BackendPath("/notes/media/drafts"), body);
        }

        /// <summary>
        /// Publish media draft
        /// </summary>
        public async Task<PlusApiResultPlusMediaPublishResultDTO?> PublishMediaDraftAsync(PlusNotesMediaPublishDraftForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMediaPublishResultDTO>(ApiPaths.BackendPath("/notes/media/drafts/publish"), body);
        }

        /// <summary>
        /// Preview media draft
        /// </summary>
        public async Task<PlusApiResultPlusMediaPublishResultDTO?> PreviewMediaDraftAsync(PlusNotesMediaPreviewForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusMediaPublishResultDTO>(ApiPaths.BackendPath("/notes/media/drafts/preview"), body);
        }

        /// <summary>
        /// Get note by UUID
        /// </summary>
        public async Task<PlusApiResultPlusNotesVO?> GetByUuidAsync(string uuid)
        {
            return await _client.GetAsync<PlusApiResultPlusNotesVO>(ApiPaths.BackendPath($"/notes/{uuid}"));
        }

        /// <summary>
        /// Search notes
        /// </summary>
        public async Task<PlusApiResultPagePlusNotesVO?> SearchAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePlusNotesVO>(ApiPaths.BackendPath("/notes/search"), query);
        }

        /// <summary>
        /// Get paginated notes by user
        /// </summary>
        public async Task<PlusApiResultPagePlusNotesVO?> PageByUserAsync(string userId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePlusNotesVO>(ApiPaths.BackendPath($"/notes/page_by_user/{userId}"), query);
        }

        /// <summary>
        /// Get paginated notes by tag
        /// </summary>
        public async Task<PlusApiResultPagePlusNotesVO?> PageByTagAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePlusNotesVO>(ApiPaths.BackendPath("/notes/page_by_tag"), query);
        }

        /// <summary>
        /// Get paginated notes by category
        /// </summary>
        public async Task<PlusApiResultPagePlusNotesVO?> PageByCategoryAsync(string categoryId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePlusNotesVO>(ApiPaths.BackendPath($"/notes/page_by_category/{categoryId}"), query);
        }

        /// <summary>
        /// Get paginated notes
        /// </summary>
        public async Task<PlusApiResultPagePlusNotesVO?> ListByPageAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePlusNotesVO>(ApiPaths.BackendPath("/notes/page"), query);
        }

        /// <summary>
        /// List media publish records
        /// </summary>
        public async Task<PlusApiResultPagePlusMediaPublishRecordDTO?> ListMediaPublishRecordsAsync(string noteId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPagePlusMediaPublishRecordDTO>(ApiPaths.BackendPath($"/notes/media/records/{noteId}"), query);
        }

        /// <summary>
        /// List notes by user
        /// </summary>
        public async Task<PlusApiResultListPlusNotesVO?> ListByUserIdAsync(string userId)
        {
            return await _client.GetAsync<PlusApiResultListPlusNotesVO>(ApiPaths.BackendPath($"/notes/list_by_user/{userId}"));
        }

        /// <summary>
        /// List notes by tag
        /// </summary>
        public async Task<PlusApiResultListPlusNotesVO?> ListByTagAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListPlusNotesVO>(ApiPaths.BackendPath("/notes/list_by_tag"), query);
        }

        /// <summary>
        /// List notes by category
        /// </summary>
        public async Task<PlusApiResultListPlusNotesVO?> ListByCategoryIdAsync(string categoryId)
        {
            return await _client.GetAsync<PlusApiResultListPlusNotesVO>(ApiPaths.BackendPath($"/notes/list_by_category/{categoryId}"));
        }

        /// <summary>
        /// Get note by ID
        /// </summary>
        public async Task<PlusApiResultPlusNotesVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusNotesVO>(ApiPaths.BackendPath($"/notes/id/{id}"));
        }

        /// <summary>
        /// List all notes
        /// </summary>
        public async Task<PlusApiResultListPlusNotesVO?> ListAllAsync()
        {
            return await _client.GetAsync<PlusApiResultListPlusNotesVO>(ApiPaths.BackendPath("/notes/all"));
        }

        /// <summary>
        /// Delete a note
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/notes/{id}"));
        }
    }
}
