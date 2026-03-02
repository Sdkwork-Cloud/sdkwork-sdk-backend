import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipRechargePackVO, PlusApiResultPagePlusVipRechargePackVO, PlusApiResultPlusVipRechargePackVO, PlusVipRechargePackForm, QueryListForm } from '../types';


export class VipRechargePackageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP recharge package */
  async update(body: PlusVipRechargePackForm): Promise<PlusApiResultPlusVipRechargePackVO> {
    return this.client.put<PlusApiResultPlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack`), body);
  }

/** Create a new VIP recharge package */
  async create(body: PlusVipRechargePackForm): Promise<PlusApiResultPlusVipRechargePackVO> {
    return this.client.post<PlusApiResultPlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack`), body);
  }

/** Get VIP recharge packages by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipRechargePackVO> {
    return this.client.post<PlusApiResultPagePlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack/list`), body, params);
  }

/** Get all VIP recharge packages */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipRechargePackVO> {
    return this.client.post<PlusApiResultListPlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack/list/all`), body);
  }

/** Get a VIP recharge package by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipRechargePackVO> {
    return this.client.get<PlusApiResultPlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack/${id}`));
  }

/** Delete a VIP recharge package */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/recharge/pack/${id}`));
  }
}

export function createVipRechargePackageApi(client: HttpClient): VipRechargePackageApi {
  return new VipRechargePackageApi(client);
}
