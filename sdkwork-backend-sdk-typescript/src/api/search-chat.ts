import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean } from '../types';


export class SearchChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

async stop(params?: QueryParams, headers?: Record<string, string>): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/search/chat/stop`), undefined, params, headers);
  }

/** Create a chat completion with Search */
  async create(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/search/chat/completions`), body, params, headers);
  }
}

export function createSearchChatApi(client: HttpClient): SearchChatApi {
  return new SearchChatApi(client);
}
