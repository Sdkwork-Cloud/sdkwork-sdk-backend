import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusRoleVO, PlusApiResultPagePlusRoleVO, PlusApiResultPlusRoleVO, PlusRoleForm, QueryListForm } from '../types';


export class RbacRoleApi {
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

/** Get system roles by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusRoleVO> {
    return this.client.post<PlusApiResultPagePlusRoleVO>(backendApiPath(`/role/list`), body, params);
  }

/** Get all system roles */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusRoleVO> {
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
}

export function createRbacRoleApi(client: HttpClient): RbacRoleApi {
  return new RbacRoleApi(client);
}
