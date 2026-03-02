import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipBenefitUsageVO, PlusApiResultPagePlusVipBenefitUsageVO, PlusApiResultPlusVipBenefitUsageVO, PlusVipBenefitUsageForm, QueryListForm } from '../types';


export class VipBenefitUsageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP benefit usage record */
  async update(body: PlusVipBenefitUsageForm): Promise<PlusApiResultPlusVipBenefitUsageVO> {
    return this.client.put<PlusApiResultPlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage`), body);
  }

/** Create a new VIP benefit usage record */
  async create(body: PlusVipBenefitUsageForm): Promise<PlusApiResultPlusVipBenefitUsageVO> {
    return this.client.post<PlusApiResultPlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage`), body);
  }

/** Get VIP benefit usage records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipBenefitUsageVO> {
    return this.client.post<PlusApiResultPagePlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage/list`), body, params);
  }

/** Get all VIP benefit usage records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipBenefitUsageVO> {
    return this.client.post<PlusApiResultListPlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage/list/all`), body);
  }

/** Get a VIP benefit usage record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipBenefitUsageVO> {
    return this.client.get<PlusApiResultPlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage/${id}`));
  }

/** Delete a VIP benefit usage record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/benefit/usage/${id}`));
  }
}

export function createVipBenefitUsageApi(client: HttpClient): VipBenefitUsageApi {
  return new VipBenefitUsageApi(client);
}
