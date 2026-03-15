import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusAiAgentForm, PlusAiAgentQueryListForm, PlusAiAgentToolForm, PlusApiResult, PlusApiResultBoolean, PlusApiResultListPlusAiAgentToolVO, PlusApiResultListPlusAiAgentVO, PlusApiResultPagePlusAiAgentToolVO, PlusApiResultPagePlusAiAgentVO, PlusApiResultPlusAiAgentToolVO, PlusApiResultPlusAiAgentVO, QueryListForm } from '../types';


export class AgentApi {
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

/** Update an existing agent-tool relationship */
  async updateTool(body: PlusAiAgentToolForm): Promise<PlusApiResultPlusAiAgentToolVO> {
    return this.client.put<PlusApiResultPlusAiAgentToolVO>(backendApiPath(`/agent/tool`), body);
  }

/** Create a new agent-tool relationship */
  async createTool(body: PlusAiAgentToolForm): Promise<PlusApiResultPlusAiAgentToolVO> {
    return this.client.post<PlusApiResultPlusAiAgentToolVO>(backendApiPath(`/agent/tool`), body);
  }

/** Get agent-tool relationships by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiAgentToolVO> {
    return this.client.post<PlusApiResultPagePlusAiAgentToolVO>(backendApiPath(`/agent/tool/list`), body, params);
  }

/** Get all agent-tool relationships */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiAgentToolVO> {
    return this.client.post<PlusApiResultListPlusAiAgentToolVO>(backendApiPath(`/agent/tool/list/all`), body);
  }

/** Get public AI agents by page */
  async listPublic(body?: PlusAiAgentQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiAgentVO> {
    return this.client.post<PlusApiResultPagePlusAiAgentVO>(backendApiPath(`/agent/list_public`), body, params);
  }

/** Get AI agents by page */
  async createListByPageAgent(body?: PlusAiAgentQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiAgentVO> {
    return this.client.post<PlusApiResultPagePlusAiAgentVO>(backendApiPath(`/agent/list`), body, params);
  }

/** Get all AI agents */
  async createListAllEntitiesAgent(body?: PlusAiAgentQueryListForm): Promise<PlusApiResultListPlusAiAgentVO> {
    return this.client.post<PlusApiResultListPlusAiAgentVO>(backendApiPath(`/agent/list/all`), body);
  }

/** Create a chat completion with agent */
  async withContext(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/agent/chat/with_context`), body, params, headers);
  }

/** Stop a chat completion stream */
  async stop(params?: QueryParams, headers?: Record<string, string>): Promise<PlusApiResult> {
    return this.client.post<PlusApiResult>(backendApiPath(`/agent/chat/stop`), undefined, params, headers);
  }

/** Create a chat completion with agent */
  async resumeStream(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/agent/chat/resume_stream`), body, params, headers);
  }

/** Create a chat completion with agent */
  async createCompletions(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/agent/chat/completions`), body, params, headers);
  }

/** Get an AI agent by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiAgentVO> {
    return this.client.get<PlusApiResultPlusAiAgentVO>(backendApiPath(`/agent/${id}`));
  }

/** Delete an AI agent */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/agent/${id}`));
  }

/** Get an agent-tool relationship by ID */
  async getByIdTool(id: string | number): Promise<PlusApiResultPlusAiAgentToolVO> {
    return this.client.get<PlusApiResultPlusAiAgentToolVO>(backendApiPath(`/agent/tool/${id}`));
  }

/** Delete an agent-tool relationship */
  async deleteTool(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/agent/tool/${id}`));
  }
}

export function createAgentApi(client: HttpClient): AgentApi {
  return new AgentApi(client);
}
