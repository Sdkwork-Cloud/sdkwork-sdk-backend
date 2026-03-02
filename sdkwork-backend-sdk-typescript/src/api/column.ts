import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusColumnVO, PlusApiResultPagePlusColumnVO, PlusApiResultPlusColumnVO, PlusColumnForm, QueryListForm } from '../types';


export class ColumnApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update column */
  async update(body: PlusColumnForm): Promise<PlusApiResultPlusColumnVO> {
    return this.client.put<PlusApiResultPlusColumnVO>(backendApiPath(`/column`), body);
  }

/** Create column */
  async create(body: PlusColumnForm): Promise<PlusApiResultPlusColumnVO> {
    return this.client.post<PlusApiResultPlusColumnVO>(backendApiPath(`/column`), body);
  }

/** Get columns by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusColumnVO> {
    return this.client.post<PlusApiResultPagePlusColumnVO>(backendApiPath(`/column/list`), body, params);
  }

/** Get all columns */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusColumnVO> {
    return this.client.post<PlusApiResultListPlusColumnVO>(backendApiPath(`/column/list/all`), body);
  }

/** Get column by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusColumnVO> {
    return this.client.get<PlusApiResultPlusColumnVO>(backendApiPath(`/column/${id}`));
  }

/** Delete column */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/column/${id}`));
  }
}

export function createColumnApi(client: HttpClient): ColumnApi {
  return new ColumnApi(client);
}
