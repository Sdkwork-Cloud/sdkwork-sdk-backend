import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAccountHistoryForm, PlusApiResultBoolean, PlusApiResultListPlusAccountHistoryVO, PlusApiResultPagePlusAccountHistoryVO, PlusApiResultPlusAccountHistoryVO, QueryListForm } from '../types';


export class AccountHistoryApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing account history record */
  async update(body: PlusAccountHistoryForm): Promise<PlusApiResultPlusAccountHistoryVO> {
    return this.client.put<PlusApiResultPlusAccountHistoryVO>(backendApiPath(`/account/history`), body);
  }

/** Create a new account history record */
  async create(body: PlusAccountHistoryForm): Promise<PlusApiResultPlusAccountHistoryVO> {
    return this.client.post<PlusApiResultPlusAccountHistoryVO>(backendApiPath(`/account/history`), body);
  }

/** Get account history records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAccountHistoryVO> {
    return this.client.post<PlusApiResultPagePlusAccountHistoryVO>(backendApiPath(`/account/history/list`), body, params);
  }

/** Get all account history records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAccountHistoryVO> {
    return this.client.post<PlusApiResultListPlusAccountHistoryVO>(backendApiPath(`/account/history/list/all`), body);
  }

/** Get an account history record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAccountHistoryVO> {
    return this.client.get<PlusApiResultPlusAccountHistoryVO>(backendApiPath(`/account/history/${id}`));
  }

/** Delete an account history record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/account/history/${id}`));
  }
}

export function createAccountHistoryApi(client: HttpClient): AccountHistoryApi {
  return new AccountHistoryApi(client);
}
