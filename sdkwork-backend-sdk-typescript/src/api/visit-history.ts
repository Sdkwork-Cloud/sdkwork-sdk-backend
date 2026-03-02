import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVisitHistoryVO, PlusApiResultPagePlusVisitHistoryVO, PlusApiResultPlusVisitHistoryVO, PlusVisitHistoryForm, QueryListForm } from '../types';


export class VisitHistoryApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update Visit History */
  async update(body: PlusVisitHistoryForm): Promise<PlusApiResultPlusVisitHistoryVO> {
    return this.client.put<PlusApiResultPlusVisitHistoryVO>(backendApiPath(`/visit_history`), body);
  }

/** Create Visit History */
  async create(body: PlusVisitHistoryForm): Promise<PlusApiResultPlusVisitHistoryVO> {
    return this.client.post<PlusApiResultPlusVisitHistoryVO>(backendApiPath(`/visit_history`), body);
  }

/** List Visit Histories by Page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVisitHistoryVO> {
    return this.client.post<PlusApiResultPagePlusVisitHistoryVO>(backendApiPath(`/visit_history/list`), body, params);
  }

/** List All Visit Histories */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVisitHistoryVO> {
    return this.client.post<PlusApiResultListPlusVisitHistoryVO>(backendApiPath(`/visit_history/list/all`), body);
  }

/** Get Visit History by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVisitHistoryVO> {
    return this.client.get<PlusApiResultPlusVisitHistoryVO>(backendApiPath(`/visit_history/${id}`));
  }

/** Delete Visit History */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/visit_history/${id}`));
  }
}

export function createVisitHistoryApi(client: HttpClient): VisitHistoryApi {
  return new VisitHistoryApi(client);
}
