import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusRefundVO, PlusApiResultPagePlusRefundVO, PlusApiResultPlusRefundVO, PlusRefundForm, QueryListForm } from '../types';


export class RefundApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing refund record */
  async update(body: PlusRefundForm): Promise<PlusApiResultPlusRefundVO> {
    return this.client.put<PlusApiResultPlusRefundVO>(backendApiPath(`/trade/refund`), body);
  }

/** Create a new refund record */
  async create(body: PlusRefundForm): Promise<PlusApiResultPlusRefundVO> {
    return this.client.post<PlusApiResultPlusRefundVO>(backendApiPath(`/trade/refund`), body);
  }

/** Get refund records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusRefundVO> {
    return this.client.post<PlusApiResultPagePlusRefundVO>(backendApiPath(`/trade/refund/list`), body, params);
  }

/** Get all refund records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusRefundVO> {
    return this.client.post<PlusApiResultListPlusRefundVO>(backendApiPath(`/trade/refund/list/all`), body);
  }

/** Get a refund record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusRefundVO> {
    return this.client.get<PlusApiResultPlusRefundVO>(backendApiPath(`/trade/refund/${id}`));
  }

/** Delete a refund record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/refund/${id}`));
  }
}

export function createRefundApi(client: HttpClient): RefundApi {
  return new RefundApi(client);
}
