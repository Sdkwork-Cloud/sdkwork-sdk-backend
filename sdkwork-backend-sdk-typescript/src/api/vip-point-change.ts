import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipPointChangeVO, PlusApiResultPagePlusVipPointChangeVO, PlusApiResultPlusVipPointChangeVO, PlusVipPointChangeForm, QueryListForm } from '../types';


export class VipPointChangeApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP point change record */
  async update(body: PlusVipPointChangeForm): Promise<PlusApiResultPlusVipPointChangeVO> {
    return this.client.put<PlusApiResultPlusVipPointChangeVO>(backendApiPath(`/vip/point/change`), body);
  }

/** Create a new VIP point change record */
  async create(body: PlusVipPointChangeForm): Promise<PlusApiResultPlusVipPointChangeVO> {
    return this.client.post<PlusApiResultPlusVipPointChangeVO>(backendApiPath(`/vip/point/change`), body);
  }

/** Get VIP point change records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipPointChangeVO> {
    return this.client.post<PlusApiResultPagePlusVipPointChangeVO>(backendApiPath(`/vip/point/change/list`), body, params);
  }

/** Get all VIP point change records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipPointChangeVO> {
    return this.client.post<PlusApiResultListPlusVipPointChangeVO>(backendApiPath(`/vip/point/change/list/all`), body);
  }

/** Get a VIP point change record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipPointChangeVO> {
    return this.client.get<PlusApiResultPlusVipPointChangeVO>(backendApiPath(`/vip/point/change/${id}`));
  }

/** Delete a VIP point change record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/point/change/${id}`));
  }
}

export function createVipPointChangeApi(client: HttpClient): VipPointChangeApi {
  return new VipPointChangeApi(client);
}
