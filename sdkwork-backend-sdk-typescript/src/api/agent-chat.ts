import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult } from '../types';


export class AgentChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
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
  async create(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/agent/chat/completions`), body, params, headers);
  }
}

export function createAgentChatApi(client: HttpClient): AgentChatApi {
  return new AgentChatApi(client);
}
