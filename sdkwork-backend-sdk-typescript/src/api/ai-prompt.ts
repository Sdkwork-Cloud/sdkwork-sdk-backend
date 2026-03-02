import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiPromptForm, PlusApiResultBoolean, PlusApiResultListPlusAiPromptVO, PlusApiResultPagePlusAiPromptVO, PlusApiResultPlusAiPromptVO, QueryListForm } from '../types';


export class AiPromptApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing AI prompt */
  async update(body: PlusAiPromptForm): Promise<PlusApiResultPlusAiPromptVO> {
    return this.client.put<PlusApiResultPlusAiPromptVO>(backendApiPath(`/prompt`), body);
  }

/** Create a new AI prompt */
  async create(body: PlusAiPromptForm): Promise<PlusApiResultPlusAiPromptVO> {
    return this.client.post<PlusApiResultPlusAiPromptVO>(backendApiPath(`/prompt`), body);
  }

/** Get AI prompts by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiPromptVO> {
    return this.client.post<PlusApiResultPagePlusAiPromptVO>(backendApiPath(`/prompt/list`), body, params);
  }

/** Get all AI prompts */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiPromptVO> {
    return this.client.post<PlusApiResultListPlusAiPromptVO>(backendApiPath(`/prompt/list/all`), body);
  }

/** Get an AI prompt by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiPromptVO> {
    return this.client.get<PlusApiResultPlusAiPromptVO>(backendApiPath(`/prompt/${id}`));
  }

/** Delete an AI prompt */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/prompt/${id}`));
  }
}

export function createAiPromptApi(client: HttpClient): AiPromptApi {
  return new AiPromptApi(client);
}
