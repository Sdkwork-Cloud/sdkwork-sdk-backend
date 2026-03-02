import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusTableVO, PlusApiResultPagePlusTableVO, PlusApiResultPlusTableVO, PlusTableForm, QueryListForm } from '../types';


export class DatabaseTableApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing database table */
  async update(body: PlusTableForm): Promise<PlusApiResultPlusTableVO> {
    return this.client.put<PlusApiResultPlusTableVO>(backendApiPath(`/table`), body);
  }

/** Create a new database table */
  async create(body: PlusTableForm): Promise<PlusApiResultPlusTableVO> {
    return this.client.post<PlusApiResultPlusTableVO>(backendApiPath(`/table`), body);
  }

/** Get database tables by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusTableVO> {
    return this.client.post<PlusApiResultPagePlusTableVO>(backendApiPath(`/table/list`), body, params);
  }

/** Get all database tables */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusTableVO> {
    return this.client.post<PlusApiResultListPlusTableVO>(backendApiPath(`/table/list/all`), body);
  }

/** Get a database table by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusTableVO> {
    return this.client.get<PlusApiResultPlusTableVO>(backendApiPath(`/table/${id}`));
  }

/** Delete a database table */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/table/${id}`));
  }
}

export function createDatabaseTableApi(client: HttpClient): DatabaseTableApi {
  return new DatabaseTableApi(client);
}
