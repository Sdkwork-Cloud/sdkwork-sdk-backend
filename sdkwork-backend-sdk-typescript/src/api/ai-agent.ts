import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiAgentForm, PlusAiAgentQueryListForm, PlusApiResultBoolean, PlusApiResultListPlusAiAgentVO, PlusApiResultPagePlusAiAgentVO, PlusApiResultPlusAiAgentVO } from '../types';


export class AiAgentApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing AI agent */
  async update(body: PlusAiAgentForm): Promise<PlusApiResultPlusAiAgentVO> {
    return this.client.put<PlusApiResultPlusAiAgentVO>(backendApiPath(`/agent`), body);
  }

/** Create a new AI agent */
  async create(body: PlusAiAgentForm): Promise<PlusApiResultPlusAiAgentVO> {
    return this.client.post<PlusApiResultPlusAiAgentVO>(backendApiPath(`/agent`), body);
  }

/** Get public AI agents by page */
  async listPublic(body?: PlusAiAgentQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiAgentVO> {
    return this.client.post<PlusApiResultPagePlusAiAgentVO>(backendApiPath(`/agent/list_public`), body, params);
  }

/** Get AI agents by page */
  async listByPage(body?: PlusAiAgentQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiAgentVO> {
    return this.client.post<PlusApiResultPagePlusAiAgentVO>(backendApiPath(`/agent/list`), body, params);
  }

/** Get all AI agents */
  async listAllEntities(body?: PlusAiAgentQueryListForm): Promise<PlusApiResultListPlusAiAgentVO> {
    return this.client.post<PlusApiResultListPlusAiAgentVO>(backendApiPath(`/agent/list/all`), body);
  }

/** Get an AI agent by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiAgentVO> {
    return this.client.get<PlusApiResultPlusAiAgentVO>(backendApiPath(`/agent/${id}`));
  }

/** Delete an AI agent */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/agent/${id}`));
  }
}

export function createAiAgentApi(client: HttpClient): AiAgentApi {
  return new AiAgentApi(client);
}
