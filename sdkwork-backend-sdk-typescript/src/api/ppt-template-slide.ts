import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusPptTemplateSlideVO, PlusApiResultPagePlusPptTemplateSlideVO, PlusApiResultPlusPptTemplateSlideVO, PlusPptTemplateSlideForm, QueryListForm } from '../types';


export class PptTemplateSlideApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing PPT template slide */
  async update(body: PlusPptTemplateSlideForm): Promise<PlusApiResultPlusPptTemplateSlideVO> {
    return this.client.put<PlusApiResultPlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide`), body);
  }

/** Create a new PPT template slide */
  async create(body: PlusPptTemplateSlideForm): Promise<PlusApiResultPlusPptTemplateSlideVO> {
    return this.client.post<PlusApiResultPlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide`), body);
  }

/** Get PPT template slides by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPptTemplateSlideVO> {
    return this.client.post<PlusApiResultPagePlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide/list`), body, params);
  }

/** Get all PPT template slides */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusPptTemplateSlideVO> {
    return this.client.post<PlusApiResultListPlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide/list/all`), body);
  }

/** Get a PPT template slide by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusPptTemplateSlideVO> {
    return this.client.get<PlusApiResultPlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide/${id}`));
  }

/** Delete a PPT template slide */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/ppt/template/slide/${id}`));
  }
}

export function createPptTemplateSlideApi(client: HttpClient): PptTemplateSlideApi {
  return new PptTemplateSlideApi(client);
}
