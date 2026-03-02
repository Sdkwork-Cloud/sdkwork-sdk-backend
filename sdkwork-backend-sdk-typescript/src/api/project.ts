import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusProjectVO, PlusApiResultPagePlusProjectVO, PlusApiResultPlusProjectVO, PlusProjectForm, QueryListForm } from '../types';


export class ProjectApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing project */
  async update(body: PlusProjectForm): Promise<PlusApiResultPlusProjectVO> {
    return this.client.put<PlusApiResultPlusProjectVO>(backendApiPath(`/project`), body);
  }

/** Create a new project */
  async create(body: PlusProjectForm): Promise<PlusApiResultPlusProjectVO> {
    return this.client.post<PlusApiResultPlusProjectVO>(backendApiPath(`/project`), body);
  }

/** Get projects by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusProjectVO> {
    return this.client.post<PlusApiResultPagePlusProjectVO>(backendApiPath(`/project/list`), body, params);
  }

/** Get all projects */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusProjectVO> {
    return this.client.post<PlusApiResultListPlusProjectVO>(backendApiPath(`/project/list/all`), body);
  }

/** Get a project by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusProjectVO> {
    return this.client.get<PlusApiResultPlusProjectVO>(backendApiPath(`/project/${id}`));
  }

/** Delete a project */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/project/${id}`));
  }
}

export function createProjectApi(client: HttpClient): ProjectApi {
  return new ProjectApi(client);
}
