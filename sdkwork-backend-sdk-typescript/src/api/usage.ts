import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListUsageRecordVO, PlusApiResultPageUsageRecordVO, PlusApiResultUsageRecordVO, QueryListForm, UsageRecordForm } from '../types';


export class UsageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing usage record */
  async update(body: UsageRecordForm): Promise<PlusApiResultUsageRecordVO> {
    return this.client.put<PlusApiResultUsageRecordVO>(backendApiPath(`/usage/record`), body);
  }

/** Create a new usage record */
  async create(body: UsageRecordForm): Promise<PlusApiResultUsageRecordVO> {
    return this.client.post<PlusApiResultUsageRecordVO>(backendApiPath(`/usage/record`), body);
  }

/** Get usage records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPageUsageRecordVO> {
    return this.client.post<PlusApiResultPageUsageRecordVO>(backendApiPath(`/usage/record/list`), body, params);
  }

/** Get all usage records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListUsageRecordVO> {
    return this.client.post<PlusApiResultListUsageRecordVO>(backendApiPath(`/usage/record/list/all`), body);
  }

/** Get a usage record by ID */
  async getById(id: string | number): Promise<PlusApiResultUsageRecordVO> {
    return this.client.get<PlusApiResultUsageRecordVO>(backendApiPath(`/usage/record/${id}`));
  }

/** Delete a usage record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/usage/record/${id}`));
  }
}

export function createUsageApi(client: HttpClient): UsageApi {
  return new UsageApi(client);
}
