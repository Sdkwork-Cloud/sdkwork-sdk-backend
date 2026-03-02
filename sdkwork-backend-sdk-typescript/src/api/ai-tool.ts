import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiToolForm, PlusApiResultBoolean, PlusApiResultListPlusAiToolVO, PlusApiResultPagePlusAiToolVO, PlusApiResultPlusAiToolVO, QueryListForm } from '../types';


export class AiToolApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing AI tool */
  async update(body: PlusAiToolForm): Promise<PlusApiResultPlusAiToolVO> {
    return this.client.put<PlusApiResultPlusAiToolVO>(backendApiPath(`/tool`), body);
  }

/** Create a new AI tool */
  async create(body: PlusAiToolForm): Promise<PlusApiResultPlusAiToolVO> {
    return this.client.post<PlusApiResultPlusAiToolVO>(backendApiPath(`/tool`), body);
  }

/** Get AI tools by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiToolVO> {
    return this.client.post<PlusApiResultPagePlusAiToolVO>(backendApiPath(`/tool/list`), body, params);
  }

/** Get all AI tools */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiToolVO> {
    return this.client.post<PlusApiResultListPlusAiToolVO>(backendApiPath(`/tool/list/all`), body);
  }

/** Get an AI tool by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiToolVO> {
    return this.client.get<PlusApiResultPlusAiToolVO>(backendApiPath(`/tool/${id}`));
  }

/** Delete an AI tool */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/tool/${id}`));
  }
}

export function createAiToolApi(client: HttpClient): AiToolApi {
  return new AiToolApi(client);
}
