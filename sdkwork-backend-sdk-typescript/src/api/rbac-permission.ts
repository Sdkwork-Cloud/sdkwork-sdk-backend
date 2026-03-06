import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusPermissionVO, PlusApiResultPagePlusPermissionVO, PlusApiResultPlusPermissionVO, PlusPermissionForm, QueryListForm } from '../types';


export class RbacPermissionApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

async update(body: PlusPermissionForm): Promise<PlusApiResultPlusPermissionVO> {
    return this.client.put<PlusApiResultPlusPermissionVO>(backendApiPath(`/permission`), body);
  }

async create(body: PlusPermissionForm): Promise<PlusApiResultPlusPermissionVO> {
    return this.client.post<PlusApiResultPlusPermissionVO>(backendApiPath(`/permission`), body);
  }

/** List permissions by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPermissionVO> {
    return this.client.post<PlusApiResultPagePlusPermissionVO>(backendApiPath(`/permission/list`), body, params);
  }

/** List all permissions */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusPermissionVO> {
    return this.client.post<PlusApiResultListPlusPermissionVO>(backendApiPath(`/permission/list/all`), body);
  }

async getById(id: string | number): Promise<PlusApiResultPlusPermissionVO> {
    return this.client.get<PlusApiResultPlusPermissionVO>(backendApiPath(`/permission/${id}`));
  }

async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/permission/${id}`));
  }
}

export function createRbacPermissionApi(client: HttpClient): RbacPermissionApi {
  return new RbacPermissionApi(client);
}
