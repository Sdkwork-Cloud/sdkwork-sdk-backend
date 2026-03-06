import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiAgentToolForm, PlusApiResultBoolean, PlusApiResultListPlusAiAgentToolVO, PlusApiResultPagePlusAiAgentToolVO, PlusApiResultPlusAiAgentToolVO, QueryListForm } from '../types';


export class AgentToolRelationshipApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing agent-tool relationship */
  async update(body: PlusAiAgentToolForm): Promise<PlusApiResultPlusAiAgentToolVO> {
    return this.client.put<PlusApiResultPlusAiAgentToolVO>(backendApiPath(`/agent/tool`), body);
  }

/** Create a new agent-tool relationship */
  async create(body: PlusAiAgentToolForm): Promise<PlusApiResultPlusAiAgentToolVO> {
    return this.client.post<PlusApiResultPlusAiAgentToolVO>(backendApiPath(`/agent/tool`), body);
  }

/** Get agent-tool relationships by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiAgentToolVO> {
    return this.client.post<PlusApiResultPagePlusAiAgentToolVO>(backendApiPath(`/agent/tool/list`), body, params);
  }

/** Get all agent-tool relationships */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiAgentToolVO> {
    return this.client.post<PlusApiResultListPlusAiAgentToolVO>(backendApiPath(`/agent/tool/list/all`), body);
  }

/** Get an agent-tool relationship by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiAgentToolVO> {
    return this.client.get<PlusApiResultPlusAiAgentToolVO>(backendApiPath(`/agent/tool/${id}`));
  }

/** Delete an agent-tool relationship */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/agent/tool/${id}`));
  }
}

export function createAgentToolRelationshipApi(client: HttpClient): AgentToolRelationshipApi {
  return new AgentToolRelationshipApi(client);
}
