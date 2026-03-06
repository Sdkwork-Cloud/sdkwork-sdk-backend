using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class DepartmentApi
    {
        private readonly HttpClient _client;

        public DepartmentApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update an existing department
        /// </summary>
        public async Task<PlusApiResultPlusDepartmentVO?> UpdateAsync(PlusDepartmentForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusDepartmentVO>(ApiPaths.BackendPath("/department"), body);
        }

        /// <summary>
        /// Create a new department
        /// </summary>
        public async Task<PlusApiResultPlusDepartmentVO?> CreateAsync(PlusDepartmentForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusDepartmentVO>(ApiPaths.BackendPath("/department"), body);
        }

        /// <summary>
        /// Move department
        /// </summary>
        public async Task<PlusApiResultPlusDepartmentVO?> MoveAsync(string id, Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultPlusDepartmentVO>(ApiPaths.BackendPath($"/department/{id}/move"), null, query);
        }

        /// <summary>
        /// Set primary department
        /// </summary>
        public async Task<PlusApiResultBoolean?> SetPrimaryAsync(string id, string memberId)
        {
            return await _client.PutAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/department/{id}/members/{memberId}/primary"), null);
        }

        /// <summary>
        /// Add member to department
        /// </summary>
        public async Task<PlusApiResultBoolean?> AddMemberToAsync(string id, string memberId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/department/{id}/members/{memberId}"), null, query);
        }

        /// <summary>
        /// Remove member from department
        /// </summary>
        public async Task<PlusApiResultBoolean?> RemoveMemberFromAsync(string id, string memberId)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/department/{id}/members/{memberId}"));
        }

        /// <summary>
        /// Get departments by page
        /// </summary>
        public async Task<PlusApiResultPagePlusDepartmentVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusDepartmentVO>(ApiPaths.BackendPath("/department/list"), body, query);
        }

        /// <summary>
        /// Get all departments
        /// </summary>
        public async Task<PlusApiResultListPlusDepartmentVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusDepartmentVO>(ApiPaths.BackendPath("/department/list/all"), body);
        }

        /// <summary>
        /// Get a department by ID
        /// </summary>
        public async Task<PlusApiResultPlusDepartmentVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusDepartmentVO>(ApiPaths.BackendPath($"/department/{id}"));
        }

        /// <summary>
        /// Delete a department
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/department/{id}"));
        }

        /// <summary>
        /// Get department members
        /// </summary>
        public async Task<PlusApiResultListPlusOrganizationMemberVO?> GetDepartmentMembersAsync(string id, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListPlusOrganizationMemberVO>(ApiPaths.BackendPath($"/department/{id}/members"), query);
        }
    }
}
