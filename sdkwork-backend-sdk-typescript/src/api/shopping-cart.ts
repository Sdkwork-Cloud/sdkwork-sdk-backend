import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusShoppingCartVO, PlusApiResultPagePlusShoppingCartVO, PlusApiResultPlusShoppingCartVO, PlusShoppingCartForm, QueryListForm } from '../types';


export class ShoppingCartApi {
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

/** Get shopping carts by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShoppingCartVO> {
    return this.client.post<PlusApiResultPagePlusShoppingCartVO>(backendApiPath(`/trade/shopping/cart/list`), body, params);
  }

/** Get all shopping carts */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShoppingCartVO> {
    return this.client.post<PlusApiResultListPlusShoppingCartVO>(backendApiPath(`/trade/shopping/cart/list/all`), body);
  }

/** Get shopping cart by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusShoppingCartVO> {
    return this.client.get<PlusApiResultPlusShoppingCartVO>(backendApiPath(`/trade/shopping/cart/${id}`));
  }

/** Delete shopping cart */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/shopping/cart/${id}`));
  }
}

export function createShoppingCartApi(client: HttpClient): ShoppingCartApi {
  return new ShoppingCartApi(client);
}
