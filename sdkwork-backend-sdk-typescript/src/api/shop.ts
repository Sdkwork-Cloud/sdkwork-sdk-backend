import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusShopVO, PlusApiResultPagePlusShopVO, PlusApiResultPlusShopVO, PlusShopForm, QueryListForm } from '../types';


export class ShopApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing shop */
  async update(body: PlusShopForm): Promise<PlusApiResultPlusShopVO> {
    return this.client.put<PlusApiResultPlusShopVO>(backendApiPath(`/shop`), body);
  }

/** Create a new shop */
  async create(body: PlusShopForm): Promise<PlusApiResultPlusShopVO> {
    return this.client.post<PlusApiResultPlusShopVO>(backendApiPath(`/shop`), body);
  }

/** Get shops by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShopVO> {
    return this.client.post<PlusApiResultPagePlusShopVO>(backendApiPath(`/shop/list`), body, params);
  }

/** Get all shops */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShopVO> {
    return this.client.post<PlusApiResultListPlusShopVO>(backendApiPath(`/shop/list/all`), body);
  }

/** Get a shop by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusShopVO> {
    return this.client.get<PlusApiResultPlusShopVO>(backendApiPath(`/shop/${id}`));
  }

/** Delete a shop */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/shop/${id}`));
  }
}

export function createShopApi(client: HttpClient): ShopApi {
  return new ShopApi(client);
}
