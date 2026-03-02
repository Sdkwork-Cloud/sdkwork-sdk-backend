import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCardTemplateVO, PlusApiResultPagePlusCardTemplateVO, PlusApiResultPlusCardTemplateVO, PlusCardTemplateForm, QueryListForm } from '../types';


export class CardTemplateApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing card template */
  async update(body: PlusCardTemplateForm): Promise<PlusApiResultPlusCardTemplateVO> {
    return this.client.put<PlusApiResultPlusCardTemplateVO>(backendApiPath(`/card/template`), body);
  }

/** Create a new card template */
  async create(body: PlusCardTemplateForm): Promise<PlusApiResultPlusCardTemplateVO> {
    return this.client.post<PlusApiResultPlusCardTemplateVO>(backendApiPath(`/card/template`), body);
  }

/** Get card templates by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCardTemplateVO> {
    return this.client.post<PlusApiResultPagePlusCardTemplateVO>(backendApiPath(`/card/template/list`), body, params);
  }

/** Get all card templates */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCardTemplateVO> {
    return this.client.post<PlusApiResultListPlusCardTemplateVO>(backendApiPath(`/card/template/list/all`), body);
  }

/** Get a card template by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCardTemplateVO> {
    return this.client.get<PlusApiResultPlusCardTemplateVO>(backendApiPath(`/card/template/${id}`));
  }

/** Delete a card template */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/card/template/${id}`));
  }
}

export function createCardTemplateApi(client: HttpClient): CardTemplateApi {
  return new CardTemplateApi(client);
}
