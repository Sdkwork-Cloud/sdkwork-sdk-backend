import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult } from '../types';


export class ChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Stop a chat completion stream */
  async stop(params?: QueryParams, headers?: Record<string, string>): Promise<PlusApiResult> {
    return this.client.post<PlusApiResult>(backendApiPath(`/chat/stop`), undefined, params, headers);
  }

/** Create a chat completion */
  async create(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/chat/completions`), body, params, headers);
  }
}

export function createChatApi(client: HttpClient): ChatApi {
  return new ChatApi(client);
}
