import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCouponTemplateVO, PlusApiResultPagePlusCouponTemplateVO, PlusApiResultPlusCouponTemplateVO, PlusCouponTemplateForm, QueryListForm } from '../types';


export class CouponTemplateApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing coupon template */
  async update(body: PlusCouponTemplateForm): Promise<PlusApiResultPlusCouponTemplateVO> {
    return this.client.put<PlusApiResultPlusCouponTemplateVO>(backendApiPath(`/coupon/template`), body);
  }

/** Create a new coupon template */
  async create(body: PlusCouponTemplateForm): Promise<PlusApiResultPlusCouponTemplateVO> {
    return this.client.post<PlusApiResultPlusCouponTemplateVO>(backendApiPath(`/coupon/template`), body);
  }

/** Get coupon templates by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCouponTemplateVO> {
    return this.client.post<PlusApiResultPagePlusCouponTemplateVO>(backendApiPath(`/coupon/template/list`), body, params);
  }

/** Get all coupon templates */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCouponTemplateVO> {
    return this.client.post<PlusApiResultListPlusCouponTemplateVO>(backendApiPath(`/coupon/template/list/all`), body);
  }

/** Get a coupon template by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCouponTemplateVO> {
    return this.client.get<PlusApiResultPlusCouponTemplateVO>(backendApiPath(`/coupon/template/${id}`));
  }

/** Delete a coupon template */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/coupon/template/${id}`));
  }
}

export function createCouponTemplateApi(client: HttpClient): CouponTemplateApi {
  return new CouponTemplateApi(client);
}
