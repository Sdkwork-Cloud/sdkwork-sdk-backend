import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusPptTemplateVO, PlusApiResultPagePlusPptTemplateVO, PlusApiResultPlusPptTemplateVO, PlusPptTemplateForm, QueryListForm } from '../types';


export class PptTemplateApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing PPT template */
  async update(body: PlusPptTemplateForm): Promise<PlusApiResultPlusPptTemplateVO> {
    return this.client.put<PlusApiResultPlusPptTemplateVO>(backendApiPath(`/ppt/template`), body);
  }

/** Create a new PPT template */
  async create(body: PlusPptTemplateForm): Promise<PlusApiResultPlusPptTemplateVO> {
    return this.client.post<PlusApiResultPlusPptTemplateVO>(backendApiPath(`/ppt/template`), body);
  }

/** Get PPT templates by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPptTemplateVO> {
    return this.client.post<PlusApiResultPagePlusPptTemplateVO>(backendApiPath(`/ppt/template/list`), body, params);
  }

/** Get all PPT templates */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusPptTemplateVO> {
    return this.client.post<PlusApiResultListPlusPptTemplateVO>(backendApiPath(`/ppt/template/list/all`), body);
  }

/** Get a PPT template by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusPptTemplateVO> {
    return this.client.get<PlusApiResultPlusPptTemplateVO>(backendApiPath(`/ppt/template/${id}`));
  }

/** Delete a PPT template */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/ppt/template/${id}`));
  }
}

export function createPptTemplateApi(client: HttpClient): PptTemplateApi {
  return new PptTemplateApi(client);
}
