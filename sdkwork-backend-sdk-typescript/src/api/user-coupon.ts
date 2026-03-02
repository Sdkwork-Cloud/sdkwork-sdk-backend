import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusUserCouponVO, PlusApiResultPagePlusUserCouponVO, PlusApiResultPlusUserCouponVO, PlusUserCouponForm, QueryListForm } from '../types';


export class UserCouponApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing user coupon */
  async update(body: PlusUserCouponForm): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.put<PlusApiResultPlusUserCouponVO>(backendApiPath(`/user/coupon`), body);
  }

/** Create a new user coupon */
  async create(body: PlusUserCouponForm): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.post<PlusApiResultPlusUserCouponVO>(backendApiPath(`/user/coupon`), body);
  }

/** Get user coupons by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserCouponVO> {
    return this.client.post<PlusApiResultPagePlusUserCouponVO>(backendApiPath(`/user/coupon/list`), body, params);
  }

/** Get all user coupons */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusUserCouponVO> {
    return this.client.post<PlusApiResultListPlusUserCouponVO>(backendApiPath(`/user/coupon/list/all`), body);
  }

/** Get a user coupon by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.get<PlusApiResultPlusUserCouponVO>(backendApiPath(`/user/coupon/${id}`));
  }

/** Delete a user coupon */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/coupon/${id}`));
  }
}

export function createUserCouponApi(client: HttpClient): UserCouponApi {
  return new UserCouponApi(client);
}
