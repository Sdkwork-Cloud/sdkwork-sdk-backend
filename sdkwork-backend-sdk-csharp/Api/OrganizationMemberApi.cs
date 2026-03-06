using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class OrganizationMemberApi
    {
        private readonly HttpClient _client;

        public OrganizationMemberApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Update organization member
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationMemberVO?> UpdateAsync(PlusOrganizationMemberForm body)
        {
            return await _client.PutAsync<PlusApiResultPlusOrganizationMemberVO>(ApiPaths.BackendPath("/organization-member"), body);
        }

        /// <summary>
        /// Create organization member
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationMemberVO?> CreateAsync(PlusOrganizationMemberForm body)
        {
            return await _client.PostAsync<PlusApiResultPlusOrganizationMemberVO>(ApiPaths.BackendPath("/organization-member"), body);
        }

        /// <summary>
        /// Transfer member position
        /// </summary>
        public async Task<PlusApiResultBoolean?> TransferPositionAsync(string id, Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}/positions/transfer"), null, query);
        }

        /// <summary>
        /// Set member primary department
        /// </summary>
        public async Task<PlusApiResultBoolean?> SetPrimaryDepartmentAsync(string id, string departmentId)
        {
            return await _client.PutAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}/departments/{departmentId}/primary"), null);
        }

        /// <summary>
        /// Transfer member department
        /// </summary>
        public async Task<PlusApiResultBoolean?> TransferDepartmentAsync(string id, Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}/departments/transfer"), null, query);
        }

        /// <summary>
        /// Deactivate member
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeactivateMemberAsync(string id)
        {
            return await _client.PutAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}/deactivate"), null);
        }

        /// <summary>
        /// Activate member
        /// </summary>
        public async Task<PlusApiResultBoolean?> ActivateMemberAsync(string id)
        {
            return await _client.PutAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}/activate"), null);
        }

        /// <summary>
        /// Bind member to department
        /// </summary>
        public async Task<PlusApiResultBoolean?> AddToDepartmentAsync(string id, string departmentId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}/departments/{departmentId}"), null, query);
        }

        /// <summary>
        /// Unbind member from department
        /// </summary>
        public async Task<PlusApiResultBoolean?> RemoveFromDepartmentAsync(string id, string departmentId)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}/departments/{departmentId}"));
        }

        /// <summary>
        /// Get organization members by page
        /// </summary>
        public async Task<PlusApiResultPagePlusOrganizationMemberVO?> ListByPageAsync(QueryListForm? body = null, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultPagePlusOrganizationMemberVO>(ApiPaths.BackendPath("/organization-member/list"), body, query);
        }

        /// <summary>
        /// Get all organization members
        /// </summary>
        public async Task<PlusApiResultListPlusOrganizationMemberVO?> ListAllEntitiesAsync(QueryListForm? body = null)
        {
            return await _client.PostAsync<PlusApiResultListPlusOrganizationMemberVO>(ApiPaths.BackendPath("/organization-member/list/all"), body);
        }

        /// <summary>
        /// Get organization member by ID
        /// </summary>
        public async Task<PlusApiResultPlusOrganizationMemberVO?> GetByIdAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultPlusOrganizationMemberVO>(ApiPaths.BackendPath($"/organization-member/{id}"));
        }

        /// <summary>
        /// Delete organization member
        /// </summary>
        public async Task<PlusApiResultBoolean?> DeleteAsync(string id)
        {
            return await _client.DeleteAsync<PlusApiResultBoolean>(ApiPaths.BackendPath($"/organization-member/{id}"));
        }

        /// <summary>
        /// Get member role ids
        /// </summary>
        public async Task<PlusApiResultListLong?> GetMemberRoleIdsAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultListLong>(ApiPaths.BackendPath($"/organization-member/{id}/roles"));
        }

        /// <summary>
        /// Get member positions
        /// </summary>
        public async Task<PlusApiResultListPlusPositionVO?> GetMemberPositionsAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultListPlusPositionVO>(ApiPaths.BackendPath($"/organization-member/{id}/positions"));
        }

        /// <summary>
        /// Get member departments
        /// </summary>
        public async Task<PlusApiResultListPlusDepartmentVO?> GetMemberDepartmentsAsync(string id)
        {
            return await _client.GetAsync<PlusApiResultListPlusDepartmentVO>(ApiPaths.BackendPath($"/organization-member/{id}/departments"));
        }
    }
}
