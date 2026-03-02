import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipPackGroupVO, PlusApiResultPagePlusVipPackGroupVO, PlusApiResultPlusVipPackGroupVO, PlusVipPackGroupForm, PlusVipPackGroupQueryForm, QueryListForm } from '../types';


export class VipPackageGroupApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP package group */
  async update(body: PlusVipPackGroupForm): Promise<PlusApiResultPlusVipPackGroupVO> {
    return this.client.put<PlusApiResultPlusVipPackGroupVO>(backendApiPath(`/vip/pack_group`), body);
  }

/** Create a new VIP package group */
  async create(body: PlusVipPackGroupForm): Promise<PlusApiResultPlusVipPackGroupVO> {
    return this.client.post<PlusApiResultPlusVipPackGroupVO>(backendApiPath(`/vip/pack_group`), body);
  }

/** List public */
  async listPublic(body?: PlusVipPackGroupQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipPackGroupVO> {
    return this.client.post<PlusApiResultPagePlusVipPackGroupVO>(backendApiPath(`/vip/pack_group/list_public`), body, params);
  }

/** Get VIP package groups by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipPackGroupVO> {
    return this.client.post<PlusApiResultPagePlusVipPackGroupVO>(backendApiPath(`/vip/pack_group/list`), body, params);
  }

/** Get all VIP package groups */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipPackGroupVO> {
    return this.client.post<PlusApiResultListPlusVipPackGroupVO>(backendApiPath(`/vip/pack_group/list/all`), body);
  }

/** Get a VIP package group by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipPackGroupVO> {
    return this.client.get<PlusApiResultPlusVipPackGroupVO>(backendApiPath(`/vip/pack_group/${id}`));
  }

/** Delete a VIP package group */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/pack_group/${id}`));
  }
}

export function createVipPackageGroupApi(client: HttpClient): VipPackageGroupApi {
  return new VipPackageGroupApi(client);
}
