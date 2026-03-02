import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult } from '../types';


export class AiAgentChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Create a chat completion with agent */
  async withContext(body: ChatCompletionCreateForm, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/agent/chat/with_context`), body, undefined, headers);
  }

/** Stop a chat completion stream */
  async stop(headers?: Record<string, string>): Promise<PlusApiResult> {
    return this.client.post<PlusApiResult>(backendApiPath(`/agent/chat/stop`), undefined, undefined, headers);
  }

/** Create a chat completion with agent */
  async resumeStream(body: ChatCompletionCreateForm, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/agent/chat/resume_stream`), body, undefined, headers);
  }

/** Create a chat completion with agent */
  async create(body: ChatCompletionCreateForm, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/agent/chat/completions`), body, undefined, headers);
  }
}

export function createAiAgentChatApi(client: HttpClient): AiAgentChatApi {
  return new AiAgentChatApi(client);
}
