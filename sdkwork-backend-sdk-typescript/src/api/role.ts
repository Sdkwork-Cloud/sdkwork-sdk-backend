import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusRolePermissionVO, PlusApiResultListPlusRoleVO, PlusApiResultPagePlusRolePermissionVO, PlusApiResultPagePlusRoleVO, PlusApiResultPlusRolePermissionVO, PlusApiResultPlusRoleVO, PlusRoleForm, PlusRolePermissionForm, QueryListForm } from '../types';


export class RoleApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing system role */
  async update(body: PlusRoleForm): Promise<PlusApiResultPlusRoleVO> {
    return this.client.put<PlusApiResultPlusRoleVO>(backendApiPath(`/role`), body);
  }

/** Create a new system role */
  async create(body: PlusRoleForm): Promise<PlusApiResultPlusRoleVO> {
    return this.client.post<PlusApiResultPlusRoleVO>(backendApiPath(`/role`), body);
  }

/** Update role-permission association */
  async updatePermission(body: PlusRolePermissionForm): Promise<PlusApiResultPlusRolePermissionVO> {
    return this.client.put<PlusApiResultPlusRolePermissionVO>(backendApiPath(`/role/permission`), body);
  }

/** Create role-permission association */
  async createPermission(body: PlusRolePermissionForm): Promise<PlusApiResultPlusRolePermissionVO> {
    return this.client.post<PlusApiResultPlusRolePermissionVO>(backendApiPath(`/role/permission`), body);
  }

/** Get role-permission associations by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusRolePermissionVO> {
    return this.client.post<PlusApiResultPagePlusRolePermissionVO>(backendApiPath(`/role/permission/list`), body, params);
  }

/** Get all role-permission associations */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusRolePermissionVO> {
    return this.client.post<PlusApiResultListPlusRolePermissionVO>(backendApiPath(`/role/permission/list/all`), body);
  }

/** Get system roles by page */
  async createListByPageRole(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusRoleVO> {
    return this.client.post<PlusApiResultPagePlusRoleVO>(backendApiPath(`/role/list`), body, params);
  }

/** Get all system roles */
  async createListAllEntitiesRole(body?: QueryListForm): Promise<PlusApiResultListPlusRoleVO> {
    return this.client.post<PlusApiResultListPlusRoleVO>(backendApiPath(`/role/list/all`), body);
  }

/** Get a system role by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusRoleVO> {
    return this.client.get<PlusApiResultPlusRoleVO>(backendApiPath(`/role/${id}`));
  }

/** Delete a system role */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/role/${id}`));
  }

/** Get role-permission association by ID */
  async getByIdPermission(id: string | number): Promise<PlusApiResultPlusRolePermissionVO> {
    return this.client.get<PlusApiResultPlusRolePermissionVO>(backendApiPath(`/role/permission/${id}`));
  }

/** Delete role-permission association */
  async deletePermission(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/role/permission/${id}`));
  }
}

export function createRoleApi(client: HttpClient): RoleApi {
  return new RoleApi(client);
}
