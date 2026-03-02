import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAccountForm, PlusApiResultBoolean, PlusApiResultListPlusAccountVO, PlusApiResultPagePlusAccountVO, PlusApiResultPlusAccountVO, PlusGetAccountForm, QueryListForm } from '../types';


export class AccountApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing account */
  async update(body: PlusAccountForm): Promise<PlusApiResultPlusAccountVO> {
    return this.client.put<PlusApiResultPlusAccountVO>(backendApiPath(`/account`), body);
  }

/** Create a new account */
  async create(body: PlusAccountForm): Promise<PlusApiResultPlusAccountVO> {
    return this.client.post<PlusApiResultPlusAccountVO>(backendApiPath(`/account`), body);
  }

/** Get accounts by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAccountVO> {
    return this.client.post<PlusApiResultPagePlusAccountVO>(backendApiPath(`/account/list`), body, params);
  }

/** Get all accounts */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAccountVO> {
    return this.client.post<PlusApiResultListPlusAccountVO>(backendApiPath(`/account/list/all`), body);
  }

/** Get points account */
  async getPoints(body: PlusGetAccountForm): Promise<PlusApiResultPlusAccountVO> {
    return this.client.post<PlusApiResultPlusAccountVO>(backendApiPath(`/account/get_points`), body);
  }

/** Get cash account */
  async getCash(body: PlusGetAccountForm): Promise<PlusApiResultPlusAccountVO> {
    return this.client.post<PlusApiResultPlusAccountVO>(backendApiPath(`/account/get_cash`), body);
  }

/** Get an account by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAccountVO> {
    return this.client.get<PlusApiResultPlusAccountVO>(backendApiPath(`/account/${id}`));
  }

/** Delete an account */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/account/${id}`));
  }
}

export function createAccountApi(client: HttpClient): AccountApi {
  return new AccountApi(client);
}
