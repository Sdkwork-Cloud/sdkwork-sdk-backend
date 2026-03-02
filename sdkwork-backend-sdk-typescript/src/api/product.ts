import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusProductVO, PlusApiResultPagePlusProductVO, PlusApiResultPlusMallHomeVO, PlusApiResultPlusProductVO, PlusProductForm, QueryListForm } from '../types';


export class ProductApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing product */
  async update(body: PlusProductForm): Promise<PlusApiResultPlusProductVO> {
    return this.client.put<PlusApiResultPlusProductVO>(backendApiPath(`/product`), body);
  }

/** Create a new product */
  async create(body: PlusProductForm): Promise<PlusApiResultPlusProductVO> {
    return this.client.post<PlusApiResultPlusProductVO>(backendApiPath(`/product`), body);
  }

/** Get all products */
  async mallHome(body?: QueryListForm): Promise<PlusApiResultPlusMallHomeVO> {
    return this.client.post<PlusApiResultPlusMallHomeVO>(backendApiPath(`/product/mall_home`), body);
  }

/** Get products by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusProductVO> {
    return this.client.post<PlusApiResultPagePlusProductVO>(backendApiPath(`/product/list`), body, params);
  }

/** Get all products */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusProductVO> {
    return this.client.post<PlusApiResultListPlusProductVO>(backendApiPath(`/product/list/all`), body);
  }

/** Get a product by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusProductVO> {
    return this.client.get<PlusApiResultPlusProductVO>(backendApiPath(`/product/${id}`));
  }

/** Delete a product */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/product/${id}`));
  }

/** Get a product by ID */
  async getDetail(params?: QueryParams): Promise<PlusApiResultPlusProductVO> {
    return this.client.get<PlusApiResultPlusProductVO>(backendApiPath(`/product/detail`), params);
  }
}

export function createProductApi(client: HttpClient): ProductApi {
  return new ProductApi(client);
}
