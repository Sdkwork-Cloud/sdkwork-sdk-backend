import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusPaymentVO, PlusApiResultPagePlusPaymentVO, PlusApiResultPlusPaymentVO, PlusPaymentCancelForm, PlusPaymentForm, PlusPaymentStatusQueryForm, PlusRefundForm, QueryListForm } from '../types';


export class PaymentApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing payment record */
  async update(body: PlusPaymentForm): Promise<PlusApiResultPlusPaymentVO> {
    return this.client.put<PlusApiResultPlusPaymentVO>(backendApiPath(`/trade/payment`), body);
  }

/** Create a new payment record */
  async create(body: PlusPaymentForm): Promise<PlusApiResultPlusPaymentVO> {
    return this.client.post<PlusApiResultPlusPaymentVO>(backendApiPath(`/trade/payment`), body);
  }

/** Check payment status */
  async checkPaymentStatus(body: PlusPaymentStatusQueryForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/trade/payment/status`), body);
  }

/** Refund payment */
  async refund(body: PlusRefundForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/trade/payment/refund`), body);
  }

/** Get payment records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPaymentVO> {
    return this.client.post<PlusApiResultPagePlusPaymentVO>(backendApiPath(`/trade/payment/list`), body, params);
  }

/** Get all payment records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusPaymentVO> {
    return this.client.post<PlusApiResultListPlusPaymentVO>(backendApiPath(`/trade/payment/list/all`), body);
  }

/** Cancel payment */
  async cancel(body: PlusPaymentCancelForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/trade/payment/cancel`), body);
  }

/** Get a payment record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusPaymentVO> {
    return this.client.get<PlusApiResultPlusPaymentVO>(backendApiPath(`/trade/payment/${id}`));
  }

/** Delete a payment record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/payment/${id}`));
  }
}

export function createPaymentApi(client: HttpClient): PaymentApi {
  return new PaymentApi(client);
}
