import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { AccountExchangeRateUpdateForm, PlusApiResultAccountExchangeRateVO } from '../types';


export class AccountExchangeConfigApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get points-to-cash rate */
  async getPointsToCashRate(): Promise<PlusApiResultAccountExchangeRateVO> {
    return this.client.get<PlusApiResultAccountExchangeRateVO>(backendApiPath(`/account/exchange-config/points-cash-rate`));
  }

/** Update points-to-cash rate */
  async updatePointsToCashRate(body: AccountExchangeRateUpdateForm): Promise<PlusApiResultAccountExchangeRateVO> {
    return this.client.put<PlusApiResultAccountExchangeRateVO>(backendApiPath(`/account/exchange-config/points-cash-rate`), body);
  }
}

export function createAccountExchangeConfigApi(client: HttpClient): AccountExchangeConfigApi {
  return new AccountExchangeConfigApi(client);
}
