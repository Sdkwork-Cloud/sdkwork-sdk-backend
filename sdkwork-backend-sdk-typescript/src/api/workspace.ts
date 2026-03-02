import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusWorkspaceVO, PlusApiResultPagePlusWorkspaceVO, PlusApiResultPlusWorkspaceVO, PlusWorkspaceForm, QueryListForm } from '../types';


export class WorkspaceApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing workspace */
  async update(body: PlusWorkspaceForm): Promise<PlusApiResultPlusWorkspaceVO> {
    return this.client.put<PlusApiResultPlusWorkspaceVO>(backendApiPath(`/workspace`), body);
  }

/** Create a new workspace */
  async create(body: PlusWorkspaceForm): Promise<PlusApiResultPlusWorkspaceVO> {
    return this.client.post<PlusApiResultPlusWorkspaceVO>(backendApiPath(`/workspace`), body);
  }

/** Get workspaces by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusWorkspaceVO> {
    return this.client.post<PlusApiResultPagePlusWorkspaceVO>(backendApiPath(`/workspace/list`), body, params);
  }

/** Get all workspaces */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusWorkspaceVO> {
    return this.client.post<PlusApiResultListPlusWorkspaceVO>(backendApiPath(`/workspace/list/all`), body);
  }

/** Get a workspace by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusWorkspaceVO> {
    return this.client.get<PlusApiResultPlusWorkspaceVO>(backendApiPath(`/workspace/${id}`));
  }

/** Delete a workspace */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/workspace/${id}`));
  }
}

export function createWorkspaceApi(client: HttpClient): WorkspaceApi {
  return new WorkspaceApi(client);
}
