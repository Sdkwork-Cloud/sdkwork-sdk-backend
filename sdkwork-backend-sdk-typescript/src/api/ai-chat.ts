import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResult } from '../types';


export class AiChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Stop a chat completion stream */
  async stop(headers?: Record<string, string>): Promise<PlusApiResult> {
    return this.client.post<PlusApiResult>(backendApiPath(`/chat/stop`), undefined, undefined, headers);
  }

/** Create a chat completion */
  async create(body: ChatCompletionCreateForm, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/chat/completions`), body, undefined, headers);
  }
}

export function createAiChatApi(client: HttpClient): AiChatApi {
  return new AiChatApi(client);
}
