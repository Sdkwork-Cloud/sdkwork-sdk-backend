import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusRolePermissionVO, PlusApiResultPagePlusRolePermissionVO, PlusApiResultPlusRolePermissionVO, PlusRolePermissionForm, QueryListForm } from '../types';


export class RolePermissionApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update role-permission association */
  async update(body: PlusRolePermissionForm): Promise<PlusApiResultPlusRolePermissionVO> {
    return this.client.put<PlusApiResultPlusRolePermissionVO>(backendApiPath(`/role/permission`), body);
  }

/** Create role-permission association */
  async create(body: PlusRolePermissionForm): Promise<PlusApiResultPlusRolePermissionVO> {
    return this.client.post<PlusApiResultPlusRolePermissionVO>(backendApiPath(`/role/permission`), body);
  }

/** Get role-permission associations by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusRolePermissionVO> {
    return this.client.post<PlusApiResultPagePlusRolePermissionVO>(backendApiPath(`/role/permission/list`), body, params);
  }

/** Get all role-permission associations */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusRolePermissionVO> {
    return this.client.post<PlusApiResultListPlusRolePermissionVO>(backendApiPath(`/role/permission/list/all`), body);
  }

/** Get role-permission association by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusRolePermissionVO> {
    return this.client.get<PlusApiResultPlusRolePermissionVO>(backendApiPath(`/role/permission/${id}`));
  }

/** Delete role-permission association */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/role/permission/${id}`));
  }
}

export function createRolePermissionApi(client: HttpClient): RolePermissionApi {
  return new RolePermissionApi(client);
}
