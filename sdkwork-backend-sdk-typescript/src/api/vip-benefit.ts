import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipBenefitVO, PlusApiResultPagePlusVipBenefitVO, PlusApiResultPlusVipBenefitVO, PlusVipBenefitForm, QueryListForm } from '../types';


export class VipBenefitApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP benefit */
  async update(body: PlusVipBenefitForm): Promise<PlusApiResultPlusVipBenefitVO> {
    return this.client.put<PlusApiResultPlusVipBenefitVO>(backendApiPath(`/vip/benefit`), body);
  }

/** Create a new VIP benefit */
  async create(body: PlusVipBenefitForm): Promise<PlusApiResultPlusVipBenefitVO> {
    return this.client.post<PlusApiResultPlusVipBenefitVO>(backendApiPath(`/vip/benefit`), body);
  }

/** Get VIP benefits by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipBenefitVO> {
    return this.client.post<PlusApiResultPagePlusVipBenefitVO>(backendApiPath(`/vip/benefit/list`), body, params);
  }

/** Get all VIP benefits */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipBenefitVO> {
    return this.client.post<PlusApiResultListPlusVipBenefitVO>(backendApiPath(`/vip/benefit/list/all`), body);
  }

/** Get a VIP benefit by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipBenefitVO> {
    return this.client.get<PlusApiResultPlusVipBenefitVO>(backendApiPath(`/vip/benefit/${id}`));
  }

/** Delete a VIP benefit */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/benefit/${id}`));
  }
}

export function createVipBenefitApi(client: HttpClient): VipBenefitApi {
  return new VipBenefitApi(client);
}
