import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiGenerationForm, PlusApiResultBoolean, PlusApiResultListPlusAiGenerationVO, PlusApiResultPagePlusAiGenerationVO, PlusApiResultPlusAiGenerationVO, QueryListForm } from '../types';


export class AiGenerationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing AI generation record */
  async update(body: PlusAiGenerationForm): Promise<PlusApiResultPlusAiGenerationVO> {
    return this.client.put<PlusApiResultPlusAiGenerationVO>(backendApiPath(`/generation`), body);
  }

/** Create a new AI generation record */
  async create(body: PlusAiGenerationForm): Promise<PlusApiResultPlusAiGenerationVO> {
    return this.client.post<PlusApiResultPlusAiGenerationVO>(backendApiPath(`/generation`), body);
  }

/** Get AI generation records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiGenerationVO> {
    return this.client.post<PlusApiResultPagePlusAiGenerationVO>(backendApiPath(`/generation/list`), body, params);
  }

/** Get all AI generation records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiGenerationVO> {
    return this.client.post<PlusApiResultListPlusAiGenerationVO>(backendApiPath(`/generation/list/all`), body);
  }

/** Get an AI generation record by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiGenerationVO> {
    return this.client.get<PlusApiResultPlusAiGenerationVO>(backendApiPath(`/generation/${id}`));
  }

/** Delete an AI generation record */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/generation/${id}`));
  }
}

export function createAiGenerationApi(client: HttpClient): AiGenerationApi {
  return new AiGenerationApi(client);
}
