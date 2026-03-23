import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusShopVO, PlusApiResultPagePlusShopVO, PlusApiResultPageResultShopBrandVO, PlusApiResultPageResultShopCsVO, PlusApiResultPageResultShopStaffVO, PlusApiResultPlusShopVO, PlusApiResultShopBrandVO, PlusApiResultShopCsVO, PlusApiResultShopDecorationVO, PlusApiResultShopStaffVO, PlusShopForm, QueryListForm, ShopBrandRequest, ShopCsRequest, ShopDecorationRequest, ShopListRequest, ShopStaffRequest } from '../types';


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

/** Update shop staff */
  async updateStaff(body: ShopStaffRequest): Promise<PlusApiResultShopStaffVO> {
    return this.client.put<PlusApiResultShopStaffVO>(backendApiPath(`/shop/admin/staff`), body);
  }

/** Create shop staff */
  async createStaff(body: ShopStaffRequest): Promise<PlusApiResultShopStaffVO> {
    return this.client.post<PlusApiResultShopStaffVO>(backendApiPath(`/shop/admin/staff`), body);
  }

/** Update shop customer service */
  async updateCustomerService(body: ShopCsRequest): Promise<PlusApiResultShopCsVO> {
    return this.client.put<PlusApiResultShopCsVO>(backendApiPath(`/shop/admin/cs`), body);
  }

/** Create shop customer service */
  async createCustomerService(body: ShopCsRequest): Promise<PlusApiResultShopCsVO> {
    return this.client.post<PlusApiResultShopCsVO>(backendApiPath(`/shop/admin/cs`), body);
  }

/** Update shop brand */
  async updateBrand(body: ShopBrandRequest): Promise<PlusApiResultShopBrandVO> {
    return this.client.put<PlusApiResultShopBrandVO>(backendApiPath(`/shop/admin/brand`), body);
  }

/** Create shop brand */
  async createBrand(body: ShopBrandRequest): Promise<PlusApiResultShopBrandVO> {
    return this.client.post<PlusApiResultShopBrandVO>(backendApiPath(`/shop/admin/brand`), body);
  }

/** Get shops by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShopVO> {
    return this.client.post<PlusApiResultPagePlusShopVO>(backendApiPath(`/shop/list`), body, params);
  }

/** Get all shops */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShopVO> {
    return this.client.post<PlusApiResultListPlusShopVO>(backendApiPath(`/shop/list/all`), body);
  }

/** Shop staff page */
  async listStaff(body?: ShopListRequest): Promise<PlusApiResultPageResultShopStaffVO> {
    return this.client.post<PlusApiResultPageResultShopStaffVO>(backendApiPath(`/shop/admin/staff/list`), body);
  }

/** Get shop decoration */
  async getDecoration(): Promise<PlusApiResultShopDecorationVO> {
    return this.client.get<PlusApiResultShopDecorationVO>(backendApiPath(`/shop/admin/decoration`));
  }

/** Save shop decoration */
  async saveDecoration(body: ShopDecorationRequest): Promise<PlusApiResultShopDecorationVO> {
    return this.client.post<PlusApiResultShopDecorationVO>(backendApiPath(`/shop/admin/decoration`), body);
  }

/** Shop customer service page */
  async listCustomerService(body?: ShopListRequest): Promise<PlusApiResultPageResultShopCsVO> {
    return this.client.post<PlusApiResultPageResultShopCsVO>(backendApiPath(`/shop/admin/cs/list`), body);
  }

/** Shop brand page */
  async listBrands(body?: ShopListRequest): Promise<PlusApiResultPageResultShopBrandVO> {
    return this.client.post<PlusApiResultPageResultShopBrandVO>(backendApiPath(`/shop/admin/brand/list`), body);
  }

/** Get a shop by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusShopVO> {
    return this.client.get<PlusApiResultPlusShopVO>(backendApiPath(`/shop/${id}`));
  }

/** Delete a shop */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/shop/${id}`));
  }

/** Delete shop staff */
  async deleteStaff(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/shop/admin/staff/${id}`));
  }

/** Delete shop customer service */
  async deleteCustomerService(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/shop/admin/cs/${id}`));
  }

/** Delete shop brand */
  async deleteBrand(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/shop/admin/brand/${id}`));
  }
}

export function createShopApi(client: HttpClient): ShopApi {
  return new ShopApi(client);
}
