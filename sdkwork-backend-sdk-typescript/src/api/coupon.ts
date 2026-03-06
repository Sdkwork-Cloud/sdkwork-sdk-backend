import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CouponPointsExchangeForm, CouponRedeemForm, CouponRollbackForm, PlusApiResultBoolean, PlusApiResultListPlusCouponVO, PlusApiResultPagePlusCouponVO, PlusApiResultPlusCouponVO, PlusApiResultPlusUserCouponVO, PlusCouponForm, QueryListForm } from '../types';


export class CouponApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing coupon template */
  async update(body: PlusCouponForm): Promise<PlusApiResultPlusCouponVO> {
    return this.client.put<PlusApiResultPlusCouponVO>(backendApiPath(`/coupon`), body);
  }

/** Create a new coupon template */
  async create(body: PlusCouponForm): Promise<PlusApiResultPlusCouponVO> {
    return this.client.post<PlusApiResultPlusCouponVO>(backendApiPath(`/coupon`), body);
  }

/** Exchange coupon by points */
  async exchangeByPoints(couponId: string | number, body: CouponPointsExchangeForm): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.post<PlusApiResultPlusUserCouponVO>(backendApiPath(`/coupon/${couponId}/exchange/points`), body);
  }

/** Redeem coupon */
  async redeem(body: CouponRedeemForm): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.post<PlusApiResultPlusUserCouponVO>(backendApiPath(`/coupon/redeem`), body);
  }

/** Rollback points exchange coupon */
  async rollbackPointsExchange(userCouponId: string | number, body?: CouponRollbackForm): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.post<PlusApiResultPlusUserCouponVO>(backendApiPath(`/coupon/my/${userCouponId}/rollback`), body);
  }

/** Get coupon templates by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCouponVO> {
    return this.client.post<PlusApiResultPagePlusCouponVO>(backendApiPath(`/coupon/list`), body, params);
  }

/** Get all coupon templates */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCouponVO> {
    return this.client.post<PlusApiResultListPlusCouponVO>(backendApiPath(`/coupon/list/all`), body);
  }

/** Get a coupon template by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCouponVO> {
    return this.client.get<PlusApiResultPlusCouponVO>(backendApiPath(`/coupon/${id}`));
  }

/** Delete a coupon template */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/coupon/${id}`));
  }
}

export function createCouponApi(client: HttpClient): CouponApi {
  return new CouponApi(client);
}
