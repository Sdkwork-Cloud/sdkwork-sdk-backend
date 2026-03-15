import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCardTemplateVO, PlusApiResultListPlusCardVO, PlusApiResultPagePlusCardTemplateVO, PlusApiResultPagePlusCardVO, PlusApiResultPlusCardTemplateVO, PlusApiResultPlusCardVO, PlusCardForm, PlusCardTemplateForm, QueryListForm } from '../types';


export class CardApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing membership card */
  async update(body: PlusCardForm): Promise<PlusApiResultPlusCardVO> {
    return this.client.put<PlusApiResultPlusCardVO>(backendApiPath(`/card`), body);
  }

/** Create a new membership card */
  async create(body: PlusCardForm): Promise<PlusApiResultPlusCardVO> {
    return this.client.post<PlusApiResultPlusCardVO>(backendApiPath(`/card`), body);
  }

/** Update an existing card template */
  async updateTemplate(body: PlusCardTemplateForm): Promise<PlusApiResultPlusCardTemplateVO> {
    return this.client.put<PlusApiResultPlusCardTemplateVO>(backendApiPath(`/card/template`), body);
  }

/** Create a new card template */
  async createTemplate(body: PlusCardTemplateForm): Promise<PlusApiResultPlusCardTemplateVO> {
    return this.client.post<PlusApiResultPlusCardTemplateVO>(backendApiPath(`/card/template`), body);
  }

/** Get card templates by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCardTemplateVO> {
    return this.client.post<PlusApiResultPagePlusCardTemplateVO>(backendApiPath(`/card/template/list`), body, params);
  }

/** Get all card templates */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCardTemplateVO> {
    return this.client.post<PlusApiResultListPlusCardTemplateVO>(backendApiPath(`/card/template/list/all`), body);
  }

/** Get membership cards by page */
  async createListByPageCard(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCardVO> {
    return this.client.post<PlusApiResultPagePlusCardVO>(backendApiPath(`/card/list`), body, params);
  }

/** Get all membership cards */
  async createListAllEntitiesCard(body?: QueryListForm): Promise<PlusApiResultListPlusCardVO> {
    return this.client.post<PlusApiResultListPlusCardVO>(backendApiPath(`/card/list/all`), body);
  }

/** Get a membership card by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCardVO> {
    return this.client.get<PlusApiResultPlusCardVO>(backendApiPath(`/card/${id}`));
  }

/** Delete a membership card */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/card/${id}`));
  }

/** Get a card template by ID */
  async getByIdTemplate(id: string | number): Promise<PlusApiResultPlusCardTemplateVO> {
    return this.client.get<PlusApiResultPlusCardTemplateVO>(backendApiPath(`/card/template/${id}`));
  }

/** Delete a card template */
  async deleteTemplate(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/card/template/${id}`));
  }
}

export function createCardApi(client: HttpClient): CardApi {
  return new CardApi(client);
}
