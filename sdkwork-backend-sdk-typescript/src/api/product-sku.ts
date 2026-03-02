import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusSkuVO, PlusApiResultPagePlusSkuVO, PlusApiResultPlusSkuVO, PlusSkuForm, QueryListForm } from '../types';


export class ProductSkuApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing SKU */
  async update(body: PlusSkuForm): Promise<PlusApiResultPlusSkuVO> {
    return this.client.put<PlusApiResultPlusSkuVO>(backendApiPath(`/sku`), body);
  }

/** Create a new SKU */
  async create(body: PlusSkuForm): Promise<PlusApiResultPlusSkuVO> {
    return this.client.post<PlusApiResultPlusSkuVO>(backendApiPath(`/sku`), body);
  }

/** Get SKUs by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusSkuVO> {
    return this.client.post<PlusApiResultPagePlusSkuVO>(backendApiPath(`/sku/list`), body, params);
  }

/** Get all SKUs */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusSkuVO> {
    return this.client.post<PlusApiResultListPlusSkuVO>(backendApiPath(`/sku/list/all`), body);
  }

/** Get an SKU by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusSkuVO> {
    return this.client.get<PlusApiResultPlusSkuVO>(backendApiPath(`/sku/${id}`));
  }

/** Delete an SKU */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/sku/${id}`));
  }
}

export function createProductSkuApi(client: HttpClient): ProductSkuApi {
  return new ProductSkuApi(client);
}
