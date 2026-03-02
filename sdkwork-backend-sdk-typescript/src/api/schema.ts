import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusSchemaVO, PlusApiResultPagePlusSchemaVO, PlusApiResultPlusSchemaVO, PlusSchemaForm, QueryListForm } from '../types';


export class SchemaApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing database schema */
  async update(body: PlusSchemaForm): Promise<PlusApiResultPlusSchemaVO> {
    return this.client.put<PlusApiResultPlusSchemaVO>(backendApiPath(`/schema`), body);
  }

/** Create a new database schema */
  async create(body: PlusSchemaForm): Promise<PlusApiResultPlusSchemaVO> {
    return this.client.post<PlusApiResultPlusSchemaVO>(backendApiPath(`/schema`), body);
  }

/** Get database schemas by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusSchemaVO> {
    return this.client.post<PlusApiResultPagePlusSchemaVO>(backendApiPath(`/schema/list`), body, params);
  }

/** Get all database schemas */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusSchemaVO> {
    return this.client.post<PlusApiResultListPlusSchemaVO>(backendApiPath(`/schema/list/all`), body);
  }

/** Get a database schema by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusSchemaVO> {
    return this.client.get<PlusApiResultPlusSchemaVO>(backendApiPath(`/schema/${id}`));
  }

/** Delete a database schema */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/schema/${id}`));
  }
}

export function createSchemaApi(client: HttpClient): SchemaApi {
  return new SchemaApi(client);
}
