import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusShoppingCartItemVO, PlusApiResultPagePlusShoppingCartItemVO, PlusApiResultPlusShoppingCartItemVO, PlusShoppingCartItemForm, QueryListForm } from '../types';


export class ShoppingCartItemApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing shopping cart item */
  async update(body: PlusShoppingCartItemForm): Promise<PlusApiResultPlusShoppingCartItemVO> {
    return this.client.put<PlusApiResultPlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item`), body);
  }

/** Create a new shopping cart item */
  async create(body: PlusShoppingCartItemForm): Promise<PlusApiResultPlusShoppingCartItemVO> {
    return this.client.post<PlusApiResultPlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item`), body);
  }

/** Get shopping cart items by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShoppingCartItemVO> {
    return this.client.post<PlusApiResultPagePlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item/list`), body, params);
  }

/** Get all shopping cart items */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShoppingCartItemVO> {
    return this.client.post<PlusApiResultListPlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item/list/all`), body);
  }

/** Get a shopping cart item by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusShoppingCartItemVO> {
    return this.client.get<PlusApiResultPlusShoppingCartItemVO>(backendApiPath(`/trade/shopping/cart/item/${id}`));
  }

/** Delete a shopping cart item */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/trade/shopping/cart/item/${id}`));
  }
}

export function createShoppingCartItemApi(client: HttpClient): ShoppingCartItemApi {
  return new ShoppingCartItemApi(client);
}
