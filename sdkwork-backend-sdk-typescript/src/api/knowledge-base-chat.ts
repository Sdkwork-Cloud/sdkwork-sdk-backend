import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean } from '../types';


export class KnowledgeBaseChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

async stop(params?: QueryParams, headers?: Record<string, string>): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/knowledge_base/chat/stop`), undefined, params, headers);
  }

/** Create a chat completion with Knowledge base */
  async create(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/knowledge_base/chat/completions`), body, params, headers);
  }
}

export function createKnowledgeBaseChatApi(client: HttpClient): KnowledgeBaseChatApi {
  return new KnowledgeBaseChatApi(client);
}
