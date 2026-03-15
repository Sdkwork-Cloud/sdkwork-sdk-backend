import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { AccountExchangeRateUpdateForm, PlusAccountForm, PlusAccountHistoryForm, PlusApiResultAccountExchangeRateVO, PlusApiResultBoolean, PlusApiResultListPlusAccountHistoryVO, PlusApiResultListPlusAccountVO, PlusApiResultPagePlusAccountHistoryVO, PlusApiResultPagePlusAccountVO, PlusApiResultPlusAccountHistoryVO, PlusApiResultPlusAccountVO, PlusGetAccountForm, QueryListForm } from '../types';


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

/** Update an existing account history record */
  async updateHistory(body: PlusAccountHistoryForm): Promise<PlusApiResultPlusAccountHistoryVO> {
    return this.client.put<PlusApiResultPlusAccountHistoryVO>(backendApiPath(`/account/history`), body);
  }

/** Create a new account history record */
  async createHistory(body: PlusAccountHistoryForm): Promise<PlusApiResultPlusAccountHistoryVO> {
    return this.client.post<PlusApiResultPlusAccountHistoryVO>(backendApiPath(`/account/history`), body);
  }

/** Get points-to-cash rate */
  async getPointsToCashRate(): Promise<PlusApiResultAccountExchangeRateVO> {
    return this.client.get<PlusApiResultAccountExchangeRateVO>(backendApiPath(`/account/exchange-config/points-cash-rate`));
  }

/** Update points-to-cash rate */
  async updatePointsToCashRate(body: AccountExchangeRateUpdateForm): Promise<PlusApiResultAccountExchangeRateVO> {
    return this.client.put<PlusApiResultAccountExchangeRateVO>(backendApiPath(`/account/exchange-config/points-cash-rate`), body);
  }

/** Get accounts by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAccountVO> {
    return this.client.post<PlusApiResultPagePlusAccountVO>(backendApiPath(`/account/list`), body, params);
  }

/** Get all accounts */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAccountVO> {
    return this.client.post<PlusApiResultListPlusAccountVO>(backendApiPath(`/account/list/all`), body);
  }

/** Get account history records by page */
  async createListByPageHistory(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAccountHistoryVO> {
    return this.client.post<PlusApiResultPagePlusAccountHistoryVO>(backendApiPath(`/account/history/list`), body, params);
  }

/** Get all account history records */
  async createListAllEntitiesHistory(body?: QueryListForm): Promise<PlusApiResultListPlusAccountHistoryVO> {
    return this.client.post<PlusApiResultListPlusAccountHistoryVO>(backendApiPath(`/account/history/list/all`), body);
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

/** Get an account history record by ID */
  async getByIdHistory(id: string | number): Promise<PlusApiResultPlusAccountHistoryVO> {
    return this.client.get<PlusApiResultPlusAccountHistoryVO>(backendApiPath(`/account/history/${id}`));
  }

/** Delete an account history record */
  async deleteHistory(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/account/history/${id}`));
  }
}

export function createAccountApi(client: HttpClient): AccountApi {
  return new AccountApi(client);
}
