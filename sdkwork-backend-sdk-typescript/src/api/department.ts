import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusDepartmentVO, PlusApiResultPagePlusDepartmentVO, PlusApiResultPlusDepartmentVO, PlusDepartmentForm, QueryListForm } from '../types';


export class DepartmentApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing department */
  async update(body: PlusDepartmentForm): Promise<PlusApiResultPlusDepartmentVO> {
    return this.client.put<PlusApiResultPlusDepartmentVO>(backendApiPath(`/department`), body);
  }

/** Create a new department */
  async create(body: PlusDepartmentForm): Promise<PlusApiResultPlusDepartmentVO> {
    return this.client.post<PlusApiResultPlusDepartmentVO>(backendApiPath(`/department`), body);
  }

/** Get departments by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDepartmentVO> {
    return this.client.post<PlusApiResultPagePlusDepartmentVO>(backendApiPath(`/department/list`), body, params);
  }

/** Get all departments */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusDepartmentVO> {
    return this.client.post<PlusApiResultListPlusDepartmentVO>(backendApiPath(`/department/list/all`), body);
  }

/** Get a department by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusDepartmentVO> {
    return this.client.get<PlusApiResultPlusDepartmentVO>(backendApiPath(`/department/${id}`));
  }

/** Delete a department */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/department/${id}`));
  }
}

export function createDepartmentApi(client: HttpClient): DepartmentApi {
  return new DepartmentApi(client);
}
