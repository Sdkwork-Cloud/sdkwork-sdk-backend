import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultPagePlusSystemInvoiceVO, PlusApiResultPlusSystemInvoiceVO, PlusSystemInvoiceApplyForm } from '../types';


export class SystemApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Apply invoice */
  async apply(body: PlusSystemInvoiceApplyForm): Promise<PlusApiResultPlusSystemInvoiceVO> {
    return this.client.post<PlusApiResultPlusSystemInvoiceVO>(backendApiPath(`/system/invoice/apply`), body);
  }

/** Query invoice page */
  async listByPage(params?: QueryParams): Promise<PlusApiResultPagePlusSystemInvoiceVO> {
    return this.client.get<PlusApiResultPagePlusSystemInvoiceVO>(backendApiPath(`/system/invoice/page`), params);
  }
}

export function createSystemApi(client: HttpClient): SystemApi {
  return new SystemApi(client);
}
