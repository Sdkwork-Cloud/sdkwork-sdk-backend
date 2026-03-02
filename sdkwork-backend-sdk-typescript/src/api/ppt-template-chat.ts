import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean } from '../types';


export class PptTemplateChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

async stop(headers?: Record<string, string>): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/ppt/template/chat/stop`), undefined, undefined, headers);
  }

/** Create a chat completion with PPT template */
  async create(body: ChatCompletionCreateForm, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/ppt/template/chat/completions`), body, undefined, headers);
  }
}

export function createPptTemplateChatApi(client: HttpClient): PptTemplateChatApi {
  return new PptTemplateChatApi(client);
}
