import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusInvokeRecordVO, PlusApiResultPagePlusInvokeRecordVO, PlusApiResultPlusInvokeRecordVO, PlusInvokeRecordForm, QueryListForm } from '../types';


export class RecordApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing invocation record */
  async update(body: PlusInvokeRecordForm): Promise<PlusApiResultPlusInvokeRecordVO> {
    return this.client.put<PlusApiResultPlusInvokeRecordVO>(backendApiPath(`/record`), body);
  }

/** Create a new invocation record */
  async create(body: PlusInvokeRecordForm): Promise<PlusApiResultPlusInvokeRecordVO> {
    return this.client.post<PlusApiResultPlusInvokeRecordVO>(backendApiPath(`/record`), body);
  }

/** Get invocation records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusInvokeRecordVO> {
    return this.client.post<PlusApiResultPagePlusInvokeRecordVO>(backendApiPath(`/record/list`), body, params);
  }

/** Get all invocation records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusInvokeRecordVO> {
    return this.client.post<PlusApiResultListPlusInvokeRecordVO>(backendApiPath(`/record/list/all`), body);
  }

/** Get an invocation record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusInvokeRecordVO> {
    return this.client.get<PlusApiResultPlusInvokeRecordVO>(backendApiPath(`/record/${id}`));
  }

/** Delete an invocation record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/record/${id}`));
  }
}

export function createRecordApi(client: HttpClient): RecordApi {
  return new RecordApi(client);
}
