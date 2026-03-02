import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipLevelBenefitVO, PlusApiResultPagePlusVipLevelBenefitVO, PlusApiResultPlusVipLevelBenefitVO, PlusVipLevelBenefitForm, QueryListForm } from '../types';


export class VipLevelBenefitApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP level benefit */
  async update(body: PlusVipLevelBenefitForm): Promise<PlusApiResultPlusVipLevelBenefitVO> {
    return this.client.put<PlusApiResultPlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit`), body);
  }

/** Create a new VIP level benefit */
  async create(body: PlusVipLevelBenefitForm): Promise<PlusApiResultPlusVipLevelBenefitVO> {
    return this.client.post<PlusApiResultPlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit`), body);
  }

/** Get VIP level benefits by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipLevelBenefitVO> {
    return this.client.post<PlusApiResultPagePlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit/list`), body, params);
  }

/** Get all VIP level benefits */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipLevelBenefitVO> {
    return this.client.post<PlusApiResultListPlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit/list/all`), body);
  }

/** Get a VIP level benefit by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipLevelBenefitVO> {
    return this.client.get<PlusApiResultPlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit/${id}`));
  }

/** Delete a VIP level benefit */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/level/benefit/${id}`));
  }
}

export function createVipLevelBenefitApi(client: HttpClient): VipLevelBenefitApi {
  return new VipLevelBenefitApi(client);
}
