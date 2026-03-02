import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusOrderItemVO, PlusApiResultPagePlusOrderItemVO, PlusApiResultPlusOrderItemVO, PlusOrderItemForm, QueryListForm } from '../types';


export class OrderItemApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing order item */
  async update(body: PlusOrderItemForm): Promise<PlusApiResultPlusOrderItemVO> {
    return this.client.put<PlusApiResultPlusOrderItemVO>(backendApiPath(`/trade/order/item`), body);
  }

/** Create a new order item */
  async create(body: PlusOrderItemForm): Promise<PlusApiResultPlusOrderItemVO> {
    return this.client.post<PlusApiResultPlusOrderItemVO>(backendApiPath(`/trade/order/item`), body);
  }

/** Get order items by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrderItemVO> {
    return this.client.post<PlusApiResultPagePlusOrderItemVO>(backendApiPath(`/trade/order/item/list`), body, params);
  }

/** Get all order items */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusOrderItemVO> {
    return this.client.post<PlusApiResultListPlusOrderItemVO>(backendApiPath(`/trade/order/item/list/all`), body);
  }

/** Get an order item by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusOrderItemVO> {
    return this.client.get<PlusApiResultPlusOrderItemVO>(backendApiPath(`/trade/order/item/${id}`));
  }

/** Delete an order item */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/order/item/${id}`));
  }
}

export function createOrderItemApi(client: HttpClient): OrderItemApi {
  return new OrderItemApi(client);
}
