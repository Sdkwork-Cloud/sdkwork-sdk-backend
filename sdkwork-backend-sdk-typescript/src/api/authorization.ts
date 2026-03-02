import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PermissionCheckForm, PlusApiResultBoolean, PlusApiResultListString, RoleCheckForm } from '../types';


export class AuthorizationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 检查用户角色 */
  async hasRole(body: RoleCheckForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/auth/authorization/has_role`), body);
  }

/** 检查用户权限 */
  async hasPermission(body: PermissionCheckForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/auth/authorization/has_permission`), body);
  }

/** 获取用户角色列表 */
  async getRoles(): Promise<PlusApiResultListString> {
    return this.client.get<PlusApiResultListString>(backendApiPath(`/auth/authorization/roles`));
  }

/** 获取用户权限列表 */
  async getPermissions(): Promise<PlusApiResultListString> {
    return this.client.get<PlusApiResultListString>(backendApiPath(`/auth/authorization/permissions`));
  }
}

export function createAuthorizationApi(client: HttpClient): AuthorizationApi {
  return new AuthorizationApi(client);
}
