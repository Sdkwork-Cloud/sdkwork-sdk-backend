import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusUserRoleVO, PlusApiResultPagePlusUserRoleVO, PlusApiResultPlusUserRoleVO, PlusUserRoleForm, QueryListForm } from '../types';


export class RbacUserRoleApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update user-role relationship */
  async update(body: PlusUserRoleForm): Promise<PlusApiResultPlusUserRoleVO> {
    return this.client.put<PlusApiResultPlusUserRoleVO>(backendApiPath(`/rbac/user/role`), body);
  }

/** Create user-role relationship */
  async create(body: PlusUserRoleForm): Promise<PlusApiResultPlusUserRoleVO> {
    return this.client.post<PlusApiResultPlusUserRoleVO>(backendApiPath(`/rbac/user/role`), body);
  }

/** Get user-role relationships by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserRoleVO> {
    return this.client.post<PlusApiResultPagePlusUserRoleVO>(backendApiPath(`/rbac/user/role/list`), body, params);
  }

/** Get all user-role relationships */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusUserRoleVO> {
    return this.client.post<PlusApiResultListPlusUserRoleVO>(backendApiPath(`/rbac/user/role/list/all`), body);
  }

/** Get user-role relationship by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusUserRoleVO> {
    return this.client.get<PlusApiResultPlusUserRoleVO>(backendApiPath(`/rbac/user/role/${id}`));
  }

/** Delete user-role relationship */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/rbac/user/role/${id}`));
  }
}

export function createRbacUserRoleApi(client: HttpClient): RbacUserRoleApi {
  return new RbacUserRoleApi(client);
}
