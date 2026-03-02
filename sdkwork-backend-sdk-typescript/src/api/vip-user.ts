import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipUserVO, PlusApiResultPagePlusVipUserVO, PlusApiResultPlusVipUserVO, PlusVipUserForm, QueryListForm } from '../types';


export class VipUserApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP user */
  async update(body: PlusVipUserForm): Promise<PlusApiResultPlusVipUserVO> {
    return this.client.put<PlusApiResultPlusVipUserVO>(backendApiPath(`/vip/user`), body);
  }

/** Create a new VIP user */
  async create(body: PlusVipUserForm): Promise<PlusApiResultPlusVipUserVO> {
    return this.client.post<PlusApiResultPlusVipUserVO>(backendApiPath(`/vip/user`), body);
  }

/** Get VIP users by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipUserVO> {
    return this.client.post<PlusApiResultPagePlusVipUserVO>(backendApiPath(`/vip/user/list`), body, params);
  }

/** Get all VIP users */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipUserVO> {
    return this.client.post<PlusApiResultListPlusVipUserVO>(backendApiPath(`/vip/user/list/all`), body);
  }

/** Get a VIP user by ID */
  async getCurrentUser(): Promise<PlusApiResultPlusVipUserVO> {
    return this.client.post<PlusApiResultPlusVipUserVO>(backendApiPath(`/vip/user/get_current_user`));
  }

/** Get a VIP user by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipUserVO> {
    return this.client.get<PlusApiResultPlusVipUserVO>(backendApiPath(`/vip/user/${id}`));
  }

/** Delete a VIP user */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/user/${id}`));
  }
}

export function createVipUserApi(client: HttpClient): VipUserApi {
  return new VipUserApi(client);
}
