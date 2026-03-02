import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipLevelVO, PlusApiResultPagePlusVipLevelVO, PlusApiResultPlusVipLevelVO, PlusVipLevelForm, QueryListForm } from '../types';


export class VipLevelApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP level */
  async update(body: PlusVipLevelForm): Promise<PlusApiResultPlusVipLevelVO> {
    return this.client.put<PlusApiResultPlusVipLevelVO>(backendApiPath(`/vip/level`), body);
  }

/** Create a new VIP level */
  async create(body: PlusVipLevelForm): Promise<PlusApiResultPlusVipLevelVO> {
    return this.client.post<PlusApiResultPlusVipLevelVO>(backendApiPath(`/vip/level`), body);
  }

/** Get VIP levels by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipLevelVO> {
    return this.client.post<PlusApiResultPagePlusVipLevelVO>(backendApiPath(`/vip/level/list`), body, params);
  }

/** Get all VIP levels */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipLevelVO> {
    return this.client.post<PlusApiResultListPlusVipLevelVO>(backendApiPath(`/vip/level/list/all`), body);
  }

/** Get a VIP level by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipLevelVO> {
    return this.client.get<PlusApiResultPlusVipLevelVO>(backendApiPath(`/vip/level/${id}`));
  }

/** Delete a VIP level */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/level/${id}`));
  }
}

export function createVipLevelApi(client: HttpClient): VipLevelApi {
  return new VipLevelApi(client);
}
