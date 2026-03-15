import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CreateBookingOrderForm, CreateGoodsOrderForm, CreateImGroupOrderForm, CreatePointsOrderForm, CreateServiceOrderForm, CreateVipOrderForm, CreateVirtualOrderForm, OrderDispatchActionForm, OrderDispatchAssignForm, PlusApiResultBookingOrderVO, PlusApiResultBoolean, PlusApiResultGoodsOrderVO, PlusApiResultImGroupOrderVO, PlusApiResultListPlusOrderDispatchRuleVO, PlusApiResultListPlusOrderItemVO, PlusApiResultListPlusOrderVO, PlusApiResultListPlusOrderWorkerDispatchProfileVO, PlusApiResultListPlusPaymentVO, PlusApiResultListPlusRefundVO, PlusApiResultListPlusShoppingCartItemVO, PlusApiResultListPlusShoppingCartVO, PlusApiResultOrderCancelVO, PlusApiResultOrderCloseVO, PlusApiResultOrderCompleteVO, PlusApiResultOrderConfirmVO, PlusApiResultOrderShipVO, PlusApiResultPagePlusOrderDispatchRuleVO, PlusApiResultPagePlusOrderItemVO, PlusApiResultPagePlusOrderVO, PlusApiResultPagePlusOrderWorkerDispatchProfileVO, PlusApiResultPagePlusPaymentVO, PlusApiResultPagePlusRefundVO, PlusApiResultPagePlusShoppingCartItemVO, PlusApiResultPagePlusShoppingCartVO, PlusApiResultPlusOrderDispatchRuleVO, PlusApiResultPlusOrderItemVO, PlusApiResultPlusOrderVO, PlusApiResultPlusOrderWorkerDispatchProfileVO, PlusApiResultPlusPaymentVO, PlusApiResultPlusRefundVO, PlusApiResultPlusShoppingCartItemVO, PlusApiResultPlusShoppingCartVO, PlusApiResultPointsOrderVO, PlusApiResultServiceOrderVO, PlusApiResultVipOrderVO, PlusApiResultVirtualOrderVO, PlusOrderDispatchRuleForm, PlusOrderForm, PlusOrderItemForm, PlusOrderWorkerDispatchProfileForm, PlusPaymentCancelForm, PlusPaymentForm, PlusPaymentStatusQueryForm, PlusRefundForm, PlusShoppingCartForm, PlusShoppingCartItemForm, QueryListForm } from '../types';


export class TradeApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update shopping cart */
  async update(body: PlusShoppingCartForm): Promise<PlusApiResultPlusShoppingCartVO> {
    return this.client.put<PlusApiResultPlusShoppingCartVO>(backendApiPath(`/trade/shopping/cart`), body);
  }

/** Create shopping cart */
  async create(body: PlusShoppingCartForm): Promise<PlusApiResultPlusShoppingCartVO> {
    return this.client.post<PlusApiResultPlusShoppingCartVO>(backendApiPath(`/trade/shopping/cart`), body);
  }

/** Update an existing shopping cart item */
  async updateItem(body: PlusShoppingCartItemForm): Promise<PlusApiResultPlusShoppingCartItemVO> {
    return this.client.put<PlusApiResultPlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item`), body);
  }

/** Create a new shopping cart item */
  async createItem(body: PlusShoppingCartItemForm): Promise<PlusApiResultPlusShoppingCartItemVO> {
    return this.client.post<PlusApiResultPlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item`), body);
  }

/** Update an existing refund record */
  async updateRefund(body: PlusRefundForm): Promise<PlusApiResultPlusRefundVO> {
    return this.client.put<PlusApiResultPlusRefundVO>(backendApiPath(`/trade/refund`), body);
  }

/** Create a new refund record */
  async createRefund(body: PlusRefundForm): Promise<PlusApiResultPlusRefundVO> {
    return this.client.post<PlusApiResultPlusRefundVO>(backendApiPath(`/trade/refund`), body);
  }

/** Update an existing payment record */
  async updatePayment(body: PlusPaymentForm): Promise<PlusApiResultPlusPaymentVO> {
    return this.client.put<PlusApiResultPlusPaymentVO>(backendApiPath(`/trade/payment`), body);
  }

/** Create a new payment record */
  async createPayment(body: PlusPaymentForm): Promise<PlusApiResultPlusPaymentVO> {
    return this.client.post<PlusApiResultPlusPaymentVO>(backendApiPath(`/trade/payment`), body);
  }

/** Update an existing order */
  async updateOrder(body: PlusOrderForm): Promise<PlusApiResultPlusOrderVO> {
    return this.client.put<PlusApiResultPlusOrderVO>(backendApiPath(`/trade/order`), body);
  }

/** Create a new order */
  async createOrder(body: PlusOrderForm): Promise<PlusApiResultPlusOrderVO> {
    return this.client.post<PlusApiResultPlusOrderVO>(backendApiPath(`/trade/order`), body);
  }

/** Update worker dispatch profile */
  async updateWorkerDispatchProfile(body: PlusOrderWorkerDispatchProfileForm): Promise<PlusApiResultPlusOrderWorkerDispatchProfileVO> {
    return this.client.put<PlusApiResultPlusOrderWorkerDispatchProfileVO>(backendApiPath(`/trade/order/worker-dispatch-profile`), body);
  }

/** Create worker dispatch profile */
  async createWorkerDispatchProfile(body: PlusOrderWorkerDispatchProfileForm): Promise<PlusApiResultPlusOrderWorkerDispatchProfileVO> {
    return this.client.post<PlusApiResultPlusOrderWorkerDispatchProfileVO>(backendApiPath(`/trade/order/worker-dispatch-profile`), body);
  }

/** Update an existing order item */
  async updateItem2(body: PlusOrderItemForm): Promise<PlusApiResultPlusOrderItemVO> {
    return this.client.put<PlusApiResultPlusOrderItemVO>(backendApiPath(`/trade/order/item`), body);
  }

/** Create a new order item */
  async createItem2(body: PlusOrderItemForm): Promise<PlusApiResultPlusOrderItemVO> {
    return this.client.post<PlusApiResultPlusOrderItemVO>(backendApiPath(`/trade/order/item`), body);
  }

/** Update dispatch rule */
  async updateDispatchRule(body: PlusOrderDispatchRuleForm): Promise<PlusApiResultPlusOrderDispatchRuleVO> {
    return this.client.put<PlusApiResultPlusOrderDispatchRuleVO>(backendApiPath(`/trade/order/dispatch-rule`), body);
  }

/** Create dispatch rule */
  async createDispatchRule(body: PlusOrderDispatchRuleForm): Promise<PlusApiResultPlusOrderDispatchRuleVO> {
    return this.client.post<PlusApiResultPlusOrderDispatchRuleVO>(backendApiPath(`/trade/order/dispatch-rule`), body);
  }

/** Get shopping carts by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShoppingCartVO> {
    return this.client.post<PlusApiResultPagePlusShoppingCartVO>(backendApiPath(`/trade/shopping/cart/list`), body, params);
  }

/** Get all shopping carts */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShoppingCartVO> {
    return this.client.post<PlusApiResultListPlusShoppingCartVO>(backendApiPath(`/trade/shopping/cart/list/all`), body);
  }

/** Get shopping cart items by page */
  async createListByPageItem(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShoppingCartItemVO> {
    return this.client.post<PlusApiResultPagePlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item/list`), body, params);
  }

/** Get all shopping cart items */
  async createListAllEntitiesItem(body?: QueryListForm): Promise<PlusApiResultListPlusShoppingCartItemVO> {
    return this.client.post<PlusApiResultListPlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item/list/all`), body);
  }

/** Get refund records by page */
  async createListByPageRefund(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusRefundVO> {
    return this.client.post<PlusApiResultPagePlusRefundVO>(backendApiPath(`/trade/refund/list`), body, params);
  }

/** Get all refund records */
  async createListAllEntitiesRefund(body?: QueryListForm): Promise<PlusApiResultListPlusRefundVO> {
    return this.client.post<PlusApiResultListPlusRefundVO>(backendApiPath(`/trade/refund/list/all`), body);
  }

/** Check payment status */
  async checkPaymentStatus(body: PlusPaymentStatusQueryForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/trade/payment/status`), body);
  }

/** Refund payment */
  async refundPayment(body: PlusRefundForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/trade/payment/refund`), body);
  }

/** Get payment records by page */
  async createListByPagePayment(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPaymentVO> {
    return this.client.post<PlusApiResultPagePlusPaymentVO>(backendApiPath(`/trade/payment/list`), body, params);
  }

/** Get all payment records */
  async createListAllEntitiesPayment(body?: QueryListForm): Promise<PlusApiResultListPlusPaymentVO> {
    return this.client.post<PlusApiResultListPlusPaymentVO>(backendApiPath(`/trade/payment/list/all`), body);
  }

/** Cancel payment */
  async cancelPayment(body: PlusPaymentCancelForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/trade/payment/cancel`), body);
  }

/** Ship an order */
  async shipOrder(id: string | number, body?: string): Promise<PlusApiResultOrderShipVO> {
    return this.client.post<PlusApiResultOrderShipVO>(backendApiPath(`/trade/order/${id}/ship`), body);
  }

/** Start service order */
  async startServiceOrder(id: string | number, body?: OrderDispatchActionForm): Promise<PlusApiResultServiceOrderVO> {
    return this.client.post<PlusApiResultServiceOrderVO>(backendApiPath(`/trade/order/${id}/dispatch/start`), body);
  }

/** Release service order */
  async releaseServiceOrder(id: string | number, body?: OrderDispatchActionForm): Promise<PlusApiResultServiceOrderVO> {
    return this.client.post<PlusApiResultServiceOrderVO>(backendApiPath(`/trade/order/${id}/dispatch/release`), body);
  }

/** Complete service order */
  async completeServiceOrder(id: string | number, body?: OrderDispatchActionForm): Promise<PlusApiResultServiceOrderVO> {
    return this.client.post<PlusApiResultServiceOrderVO>(backendApiPath(`/trade/order/${id}/dispatch/complete`), body);
  }

/** Claim service order */
  async claimServiceOrder(id: string | number, body?: OrderDispatchActionForm): Promise<PlusApiResultServiceOrderVO> {
    return this.client.post<PlusApiResultServiceOrderVO>(backendApiPath(`/trade/order/${id}/dispatch/claim`), body);
  }

/** Assign service order */
  async assignServiceOrder(id: string | number, body: OrderDispatchAssignForm): Promise<PlusApiResultServiceOrderVO> {
    return this.client.post<PlusApiResultServiceOrderVO>(backendApiPath(`/trade/order/${id}/dispatch/assign`), body);
  }

/** Confirm an order */
  async confirmOrder(id: string | number): Promise<PlusApiResultOrderConfirmVO> {
    return this.client.post<PlusApiResultOrderConfirmVO>(backendApiPath(`/trade/order/${id}/confirm`));
  }

/** Complete an order */
  async completeOrder(id: string | number): Promise<PlusApiResultOrderCompleteVO> {
    return this.client.post<PlusApiResultOrderCompleteVO>(backendApiPath(`/trade/order/${id}/complete`));
  }

/** Close an order */
  async closeOrder(id: string | number): Promise<PlusApiResultOrderCloseVO> {
    return this.client.post<PlusApiResultOrderCloseVO>(backendApiPath(`/trade/order/${id}/close`));
  }

/** Cancel an order */
  async cancelOrder(id: string | number): Promise<PlusApiResultOrderCancelVO> {
    return this.client.post<PlusApiResultOrderCancelVO>(backendApiPath(`/trade/order/${id}/cancel`));
  }

/** List worker dispatch profiles by page */
  async createListByPageWorkerDispatchProfile(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrderWorkerDispatchProfileVO> {
    return this.client.post<PlusApiResultPagePlusOrderWorkerDispatchProfileVO>(backendApiPath(`/trade/order/worker-dispatch-profile/list`), body, params);
  }

/** List all worker dispatch profiles */
  async createListAllEntitiesWorkerDispatchProfile(body?: QueryListForm): Promise<PlusApiResultListPlusOrderWorkerDispatchProfileVO> {
    return this.client.post<PlusApiResultListPlusOrderWorkerDispatchProfileVO>(backendApiPath(`/trade/order/worker-dispatch-profile/list/all`), body);
  }

/** Create virtual order */
  async createVirtualOrder(body: CreateVirtualOrderForm): Promise<PlusApiResultVirtualOrderVO> {
    return this.client.post<PlusApiResultVirtualOrderVO>(backendApiPath(`/trade/order/virtual`), body);
  }

/** Create VIP order */
  async createVipOrder(body: CreateVipOrderForm): Promise<PlusApiResultVipOrderVO> {
    return this.client.post<PlusApiResultVipOrderVO>(backendApiPath(`/trade/order/vip`), body);
  }

/** Create service order */
  async createServiceOrder(body: CreateServiceOrderForm): Promise<PlusApiResultServiceOrderVO> {
    return this.client.post<PlusApiResultServiceOrderVO>(backendApiPath(`/trade/order/service`), body);
  }

/** Create points order */
  async createPointsOrder(body: CreatePointsOrderForm): Promise<PlusApiResultPointsOrderVO> {
    return this.client.post<PlusApiResultPointsOrderVO>(backendApiPath(`/trade/order/points`), body);
  }

/** Get orders by page */
  async createListByPageOrder(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrderVO> {
    return this.client.post<PlusApiResultPagePlusOrderVO>(backendApiPath(`/trade/order/list`), body, params);
  }

/** Get all orders */
  async createListAllEntitiesOrder(body?: QueryListForm): Promise<PlusApiResultListPlusOrderVO> {
    return this.client.post<PlusApiResultListPlusOrderVO>(backendApiPath(`/trade/order/list/all`), body);
  }

/** Get order items by page */
  async createListByPageItem2(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrderItemVO> {
    return this.client.post<PlusApiResultPagePlusOrderItemVO>(backendApiPath(`/trade/order/item/list`), body, params);
  }

/** Get all order items */
  async createListAllEntitiesItem2(body?: QueryListForm): Promise<PlusApiResultListPlusOrderItemVO> {
    return this.client.post<PlusApiResultListPlusOrderItemVO>(backendApiPath(`/trade/order/item/list/all`), body);
  }

/** Create IM group order */
  async createImGroupOrder(body: CreateImGroupOrderForm): Promise<PlusApiResultImGroupOrderVO> {
    return this.client.post<PlusApiResultImGroupOrderVO>(backendApiPath(`/trade/order/im_group`), body);
  }

/** Create goods order */
  async createGoodsOrder(body: CreateGoodsOrderForm): Promise<PlusApiResultGoodsOrderVO> {
    return this.client.post<PlusApiResultGoodsOrderVO>(backendApiPath(`/trade/order/goods`), body);
  }

/** List dispatch rules by page */
  async createListByPageDispatchRule(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrderDispatchRuleVO> {
    return this.client.post<PlusApiResultPagePlusOrderDispatchRuleVO>(backendApiPath(`/trade/order/dispatch-rule/list`), body, params);
  }

/** List all dispatch rules */
  async createListAllEntitiesDispatchRule(body?: QueryListForm): Promise<PlusApiResultListPlusOrderDispatchRuleVO> {
    return this.client.post<PlusApiResultListPlusOrderDispatchRuleVO>(backendApiPath(`/trade/order/dispatch-rule/list/all`), body);
  }

/** Create booking order */
  async createBookingOrder(body: CreateBookingOrderForm): Promise<PlusApiResultBookingOrderVO> {
    return this.client.post<PlusApiResultBookingOrderVO>(backendApiPath(`/trade/order/booking`), body);
  }

/** Get shopping cart by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusShoppingCartVO> {
    return this.client.get<PlusApiResultPlusShoppingCartVO>(backendApiPath(`/trade/shopping/cart/${id}`));
  }

/** Delete shopping cart */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/shopping/cart/${id}`));
  }

/** Get a shopping cart item by ID */
  async getByIdItem(id: string | number): Promise<PlusApiResultPlusShoppingCartItemVO> {
    return this.client.get<PlusApiResultPlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item/${id}`));
  }

/** Delete a shopping cart item */
  async deleteItem(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/shopping/cart/item/${id}`));
  }

/** Get a refund record by ID */
  async getByIdRefund(id: string | number): Promise<PlusApiResultPlusRefundVO> {
    return this.client.get<PlusApiResultPlusRefundVO>(backendApiPath(`/trade/refund/${id}`));
  }

/** Delete a refund record */
  async deleteRefund(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/refund/${id}`));
  }

/** Get a payment record by ID */
  async getByIdPayment(id: string | number): Promise<PlusApiResultPlusPaymentVO> {
    return this.client.get<PlusApiResultPlusPaymentVO>(backendApiPath(`/trade/payment/${id}`));
  }

/** Delete a payment record */
  async deletePayment(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/payment/${id}`));
  }

/** Get an order by ID */
  async getByIdOrder(id: string | number): Promise<PlusApiResultPlusOrderVO> {
    return this.client.get<PlusApiResultPlusOrderVO>(backendApiPath(`/trade/order/${id}`));
  }

/** Delete an order */
  async deleteOrder(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/order/${id}`));
  }

/** Get worker dispatch profile by id */
  async getByIdWorkerDispatchProfile(id: string | number): Promise<PlusApiResultPlusOrderWorkerDispatchProfileVO> {
    return this.client.get<PlusApiResultPlusOrderWorkerDispatchProfileVO>(backendApiPath(`/trade/order/worker-dispatch-profile/${id}`));
  }

/** Delete worker dispatch profile */
  async deleteWorkerDispatchProfile(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/order/worker-dispatch-profile/${id}`));
  }

/** Get an order item by ID */
  async getByIdItem2(id: string | number): Promise<PlusApiResultPlusOrderItemVO> {
    return this.client.get<PlusApiResultPlusOrderItemVO>(backendApiPath(`/trade/order/item/${id}`));
  }

/** Delete an order item */
  async deleteItem2(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/order/item/${id}`));
  }

/** Get dispatch rule by id */
  async getByIdDispatchRule(id: string | number): Promise<PlusApiResultPlusOrderDispatchRuleVO> {
    return this.client.get<PlusApiResultPlusOrderDispatchRuleVO>(backendApiPath(`/trade/order/dispatch-rule/${id}`));
  }

/** Delete dispatch rule */
  async deleteDispatchRule(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/order/dispatch-rule/${id}`));
  }
}

export function createTradeApi(client: HttpClient): TradeApi {
  return new TradeApi(client);
}
