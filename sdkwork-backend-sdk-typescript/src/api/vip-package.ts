import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipPackVO, PlusApiResultPagePlusVipPackVO, PlusApiResultPlusVipPackVO, PlusVipPackForm, QueryListForm } from '../types';


export class VipPackageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update VIP Package */
  async update(body: PlusVipPackForm): Promise<PlusApiResultPlusVipPackVO> {
    return this.client.put<PlusApiResultPlusVipPackVO>(backendApiPath(`/vip/pack`), body);
  }

/** Create VIP Package */
  async create(body: PlusVipPackForm): Promise<PlusApiResultPlusVipPackVO> {
    return this.client.post<PlusApiResultPlusVipPackVO>(backendApiPath(`/vip/pack`), body);
  }

/** Get VIP Packages by Page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipPackVO> {
    return this.client.post<PlusApiResultPagePlusVipPackVO>(backendApiPath(`/vip/pack/list`), body, params);
  }

/** Get All VIP Packages */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipPackVO> {
    return this.client.post<PlusApiResultListPlusVipPackVO>(backendApiPath(`/vip/pack/list/all`), body);
  }

/** Get VIP Package by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipPackVO> {
    return this.client.get<PlusApiResultPlusVipPackVO>(backendApiPath(`/vip/pack/${id}`));
  }

/** Delete VIP Package */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/pack/${id}`));
  }
}

export function createVipPackageApi(client: HttpClient): VipPackageApi {
  return new VipPackageApi(client);
}
