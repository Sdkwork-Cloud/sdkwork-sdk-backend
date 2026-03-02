import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusShareVisitRecordVO, PlusApiResultPagePlusShareVisitRecordVO, PlusApiResultPlusShareVisitRecordVO, PlusShareVisitRecordForm, QueryListForm } from '../types';


export class ShareVisitRecordApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update visit record */
  async update(body: PlusShareVisitRecordForm): Promise<PlusApiResultPlusShareVisitRecordVO> {
    return this.client.put<PlusApiResultPlusShareVisitRecordVO>(backendApiPath(`/share/visit_record`), body);
  }

/** Create visit record */
  async create(body: PlusShareVisitRecordForm): Promise<PlusApiResultPlusShareVisitRecordVO> {
    return this.client.post<PlusApiResultPlusShareVisitRecordVO>(backendApiPath(`/share/visit_record`), body);
  }

/** Get visit records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShareVisitRecordVO> {
    return this.client.post<PlusApiResultPagePlusShareVisitRecordVO>(backendApiPath(`/share/visit_record/list`), body, params);
  }

/** Get all visit records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShareVisitRecordVO> {
    return this.client.post<PlusApiResultListPlusShareVisitRecordVO>(backendApiPath(`/share/visit_record/list/all`), body);
  }

/** Get visit record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusShareVisitRecordVO> {
    return this.client.get<PlusApiResultPlusShareVisitRecordVO>(backendApiPath(`/share/visit_record/${id}`));
  }

/** Delete visit record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/share/visit_record/${id}`));
  }
}

export function createShareVisitRecordApi(client: HttpClient): ShareVisitRecordApi {
  return new ShareVisitRecordApi(client);
}
