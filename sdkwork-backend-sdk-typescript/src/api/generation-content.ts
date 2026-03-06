import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiGenerationContentForm, PlusApiResultBoolean, PlusApiResultListPlusAiGenerationContentVO, PlusApiResultPagePlusAiGenerationContentVO, PlusApiResultPlusAiGenerationContentVO, QueryListForm } from '../types';


export class GenerationContentApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update AI generated content */
  async update(body: PlusAiGenerationContentForm): Promise<PlusApiResultPlusAiGenerationContentVO> {
    return this.client.put<PlusApiResultPlusAiGenerationContentVO>(backendApiPath(`/generation/content`), body);
  }

/** Create new AI generated content */
  async create(body: PlusAiGenerationContentForm): Promise<PlusApiResultPlusAiGenerationContentVO> {
    return this.client.post<PlusApiResultPlusAiGenerationContentVO>(backendApiPath(`/generation/content`), body);
  }

/** Get AI generated content by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiGenerationContentVO> {
    return this.client.post<PlusApiResultPagePlusAiGenerationContentVO>(backendApiPath(`/generation/content/list`), body, params);
  }

/** Get all AI generated content */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiGenerationContentVO> {
    return this.client.post<PlusApiResultListPlusAiGenerationContentVO>(backendApiPath(`/generation/content/list/all`), body);
  }

/** Get AI generated content by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiGenerationContentVO> {
    return this.client.get<PlusApiResultPlusAiGenerationContentVO>(backendApiPath(`/generation/content/${id}`));
  }

/** Delete AI generated content */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/generation/content/${id}`));
  }
}

export function createGenerationContentApi(client: HttpClient): GenerationContentApi {
  return new GenerationContentApi(client);
}
