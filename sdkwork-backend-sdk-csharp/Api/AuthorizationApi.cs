using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AuthorizationApi
    {
        private readonly HttpClient _client;

        public AuthorizationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 检查用户角色
        /// </summary>
        public async Task<PlusApiResultBoolean?> HasRoleAsync(RoleCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/auth/authorization/has_role"), body);
        }

        /// <summary>
        /// 检查用户权限
        /// </summary>
        public async Task<PlusApiResultBoolean?> HasPermissionAsync(PermissionCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.BackendPath("/auth/authorization/has_permission"), body);
        }

        /// <summary>
        /// 获取用户角色列表
        /// </summary>
        public async Task<PlusApiResultListString?> GetRolesAsync()
        {
            return await _client.GetAsync<PlusApiResultListString>(ApiPaths.BackendPath("/auth/authorization/roles"));
        }

        /// <summary>
        /// 获取用户权限列表
        /// </summary>
        public async Task<PlusApiResultListString?> GetPermissionsAsync()
        {
            return await _client.GetAsync<PlusApiResultListString>(ApiPaths.BackendPath("/auth/authorization/permissions"));
        }
    }
}
