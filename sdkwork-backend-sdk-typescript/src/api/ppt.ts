import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult, PlusApiResultBoolean, PlusApiResultListPlusPptTemplateSlideVO, PlusApiResultListPlusPptTemplateVO, PlusApiResultPagePlusPptTemplateSlideVO, PlusApiResultPagePlusPptTemplateVO, PlusApiResultPlusPptTemplateSlideVO, PlusApiResultPlusPptTemplateVO, PlusPptTemplateForm, PlusPptTemplateRenderForm, PlusPptTemplateSlideForm, QueryListForm } from '../types';


export class PptApi {
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

/** Update an existing PPT template slide */
  async updateSlide(body: PlusPptTemplateSlideForm): Promise<PlusApiResultPlusPptTemplateSlideVO> {
    return this.client.put<PlusApiResultPlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide`), body);
  }

/** Create a new PPT template slide */
  async createSlide(body: PlusPptTemplateSlideForm): Promise<PlusApiResultPlusPptTemplateSlideVO> {
    return this.client.post<PlusApiResultPlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide`), body);
  }

/** Get PPT template slides by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPptTemplateSlideVO> {
    return this.client.post<PlusApiResultPagePlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide/list`), body, params);
  }

/** Get all PPT template slides */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusPptTemplateSlideVO> {
    return this.client.post<PlusApiResultListPlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide/list/all`), body);
  }

/** Render PPT template */
  async render(body: PlusPptTemplateRenderForm): Promise<PlusApiResult> {
    return this.client.post<PlusApiResult>(backendApiPath(`/ppt/template/render`), body);
  }

/** Get PPT templates by page */
  async createListByPageTemplate(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPptTemplateVO> {
    return this.client.post<PlusApiResultPagePlusPptTemplateVO>(backendApiPath(`/ppt/template/list`), body, params);
  }

/** Get all PPT templates */
  async createListAllEntitiesTemplate(body?: QueryListForm): Promise<PlusApiResultListPlusPptTemplateVO> {
    return this.client.post<PlusApiResultListPlusPptTemplateVO>(backendApiPath(`/ppt/template/list/all`), body);
  }

async stop(params?: QueryParams, headers?: Record<string, string>): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/ppt/template/chat/stop`), undefined, params, headers);
  }

/** Create a chat completion with PPT template */
  async createCompletions(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/ppt/template/chat/completions`), body, params, headers);
  }

/** Get a PPT template by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusPptTemplateVO> {
    return this.client.get<PlusApiResultPlusPptTemplateVO>(backendApiPath(`/ppt/template/${id}`));
  }

/** Delete a PPT template */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/ppt/template/${id}`));
  }

/** Get a PPT template slide by ID */
  async getByIdSlide(id: string | number): Promise<PlusApiResultPlusPptTemplateSlideVO> {
    return this.client.get<PlusApiResultPlusPptTemplateSlideVO>(backendApiPath(`/ppt/template/slide/${id}`));
  }

/** Delete a PPT template slide */
  async deleteSlide(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/ppt/template/slide/${id}`));
  }
}

export function createPptApi(client: HttpClient): PptApi {
  return new PptApi(client);
}
