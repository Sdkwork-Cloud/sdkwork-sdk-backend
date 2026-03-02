import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipRechargeVO, PlusApiResultPagePlusVipRechargeVO, PlusApiResultPlusVipRechargeVO, PlusVipRechargeForm, QueryListForm } from '../types';


export class VipRechargeApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP recharge record */
  async update(body: PlusVipRechargeForm): Promise<PlusApiResultPlusVipRechargeVO> {
    return this.client.put<PlusApiResultPlusVipRechargeVO>(backendApiPath(`/vip/recharge`), body);
  }

/** Create a new VIP recharge record */
  async create(body: PlusVipRechargeForm): Promise<PlusApiResultPlusVipRechargeVO> {
    return this.client.post<PlusApiResultPlusVipRechargeVO>(backendApiPath(`/vip/recharge`), body);
  }

/** Get VIP recharge records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipRechargeVO> {
    return this.client.post<PlusApiResultPagePlusVipRechargeVO>(backendApiPath(`/vip/recharge/list`), body, params);
  }

/** Get all VIP recharge records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipRechargeVO> {
    return this.client.post<PlusApiResultListPlusVipRechargeVO>(backendApiPath(`/vip/recharge/list/all`), body);
  }

/** Get a VIP recharge record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipRechargeVO> {
    return this.client.get<PlusApiResultPlusVipRechargeVO>(backendApiPath(`/vip/recharge/${id}`));
  }

/** Delete a VIP recharge record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/recharge/${id}`));
  }
}

export function createVipRechargeApi(client: HttpClient): VipRechargeApi {
  return new VipRechargeApi(client);
}
