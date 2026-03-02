import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusPartnerVO, PlusApiResultPagePlusPartnerVO, PlusApiResultPlusPartnerVO, PlusPartnerForm, QueryListForm } from '../types';


export class PartnerApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update a partner */
  async update(body: PlusPartnerForm): Promise<PlusApiResultPlusPartnerVO> {
    return this.client.put<PlusApiResultPlusPartnerVO>(backendApiPath(`/partner`), body);
  }

/** Create a new partner */
  async create(body: PlusPartnerForm): Promise<PlusApiResultPlusPartnerVO> {
    return this.client.post<PlusApiResultPlusPartnerVO>(backendApiPath(`/partner`), body);
  }

/** Get partners by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPartnerVO> {
    return this.client.post<PlusApiResultPagePlusPartnerVO>(backendApiPath(`/partner/list`), body, params);
  }

/** Get all partners */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusPartnerVO> {
    return this.client.post<PlusApiResultListPlusPartnerVO>(backendApiPath(`/partner/list/all`), body);
  }

/** Get a partner by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusPartnerVO> {
    return this.client.get<PlusApiResultPlusPartnerVO>(backendApiPath(`/partner/${id}`));
  }

/** Delete a partner */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/partner/${id}`));
  }
}

export function createPartnerApi(client: HttpClient): PartnerApi {
  return new PartnerApi(client);
}
