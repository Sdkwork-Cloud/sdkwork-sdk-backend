import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CreateGoodsOrderForm, CreateImGroupOrderForm, CreatePointsOrderForm, CreateVipOrderForm, CreateVirtualOrderForm, PlusApiResultBoolean, PlusApiResultGoodsOrderVO, PlusApiResultImGroupOrderVO, PlusApiResultListPlusOrderVO, PlusApiResultOrderCancelVO, PlusApiResultOrderCloseVO, PlusApiResultOrderCompleteVO, PlusApiResultOrderConfirmVO, PlusApiResultOrderShipVO, PlusApiResultPagePlusOrderVO, PlusApiResultPlusOrderVO, PlusApiResultPointsOrderVO, PlusApiResultVipOrderVO, PlusApiResultVirtualOrderVO, PlusOrderForm, QueryListForm } from '../types';


export class OrderApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing order */
  async update(body: PlusOrderForm): Promise<PlusApiResultPlusOrderVO> {
    return this.client.put<PlusApiResultPlusOrderVO>(backendApiPath(`/trade/order`), body);
  }

/** Create a new order */
  async create(body: PlusOrderForm): Promise<PlusApiResultPlusOrderVO> {
    return this.client.post<PlusApiResultPlusOrderVO>(backendApiPath(`/trade/order`), body);
  }

/** Ship an order */
  async ship(id: string | number, body: string): Promise<PlusApiResultOrderShipVO> {
    return this.client.post<PlusApiResultOrderShipVO>(backendApiPath(`/trade/order/${id}/ship`), body);
  }

/** Confirm an order */
  async confirm(id: string | number): Promise<PlusApiResultOrderConfirmVO> {
    return this.client.post<PlusApiResultOrderConfirmVO>(backendApiPath(`/trade/order/${id}/confirm`));
  }

/** Complete an order */
  async complete(id: string | number): Promise<PlusApiResultOrderCompleteVO> {
    return this.client.post<PlusApiResultOrderCompleteVO>(backendApiPath(`/trade/order/${id}/complete`));
  }

/** Close an order */
  async close(id: string | number): Promise<PlusApiResultOrderCloseVO> {
    return this.client.post<PlusApiResultOrderCloseVO>(backendApiPath(`/trade/order/${id}/close`));
  }

/** Cancel an order */
  async cancel(id: string | number): Promise<PlusApiResultOrderCancelVO> {
    return this.client.post<PlusApiResultOrderCancelVO>(backendApiPath(`/trade/order/${id}/cancel`));
  }

/** Create virtual order */
  async createVirtual(body: CreateVirtualOrderForm): Promise<PlusApiResultVirtualOrderVO> {
    return this.client.post<PlusApiResultVirtualOrderVO>(backendApiPath(`/trade/order/virtual`), body);
  }

/** Create VIP order */
  async createVip(body: CreateVipOrderForm): Promise<PlusApiResultVipOrderVO> {
    return this.client.post<PlusApiResultVipOrderVO>(backendApiPath(`/trade/order/vip`), body);
  }

/** Create points order */
  async createPoints(body: CreatePointsOrderForm): Promise<PlusApiResultPointsOrderVO> {
    return this.client.post<PlusApiResultPointsOrderVO>(backendApiPath(`/trade/order/points`), body);
  }

/** Get orders by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrderVO> {
    return this.client.post<PlusApiResultPagePlusOrderVO>(backendApiPath(`/trade/order/list`), body, params);
  }

/** Get all orders */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusOrderVO> {
    return this.client.post<PlusApiResultListPlusOrderVO>(backendApiPath(`/trade/order/list/all`), body);
  }

/** Create IM group order */
  async createImGroup(body: CreateImGroupOrderForm): Promise<PlusApiResultImGroupOrderVO> {
    return this.client.post<PlusApiResultImGroupOrderVO>(backendApiPath(`/trade/order/im_group`), body);
  }

/** Create goods order */
  async createGoods(body: CreateGoodsOrderForm): Promise<PlusApiResultGoodsOrderVO> {
    return this.client.post<PlusApiResultGoodsOrderVO>(backendApiPath(`/trade/order/goods`), body);
  }

/** Get an order by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusOrderVO> {
    return this.client.get<PlusApiResultPlusOrderVO>(backendApiPath(`/trade/order/${id}`));
  }

/** Delete an order */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/order/${id}`));
  }
}

export function createOrderApi(client: HttpClient): OrderApi {
  return new OrderApi(client);
}
