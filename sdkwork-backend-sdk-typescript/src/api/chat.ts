import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, ChatMessageQueryListForm, PlusApiResult, PlusApiResultBoolean, PlusApiResultListPlusChatMessageVO, PlusApiResultPagePlusChatMessageVO, PlusApiResultPlusChatMessageVO, PlusChatMessageForm } from '../types';


export class ChatApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing chat message */
  async updateMessage(body: PlusChatMessageForm): Promise<PlusApiResultPlusChatMessageVO> {
    return this.client.put<PlusApiResultPlusChatMessageVO>(backendApiPath(`/chat/message`), body);
  }

/** Create a new chat message */
  async createMessage(body: PlusChatMessageForm): Promise<PlusApiResultPlusChatMessageVO> {
    return this.client.post<PlusApiResultPlusChatMessageVO>(backendApiPath(`/chat/message`), body);
  }

/** Stop a chat completion stream */
  async stop(params?: QueryParams, headers?: Record<string, string>): Promise<PlusApiResult> {
    return this.client.post<PlusApiResult>(backendApiPath(`/chat/stop`), undefined, params, headers);
  }

/** Get chat messages by page */
  async loadMore(body?: ChatMessageQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChatMessageVO> {
    return this.client.post<PlusApiResultPagePlusChatMessageVO>(backendApiPath(`/chat/message/load_more`), body, params);
  }

/** Get chat messages by page */
  async createListByPage(body?: ChatMessageQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChatMessageVO> {
    return this.client.post<PlusApiResultPagePlusChatMessageVO>(backendApiPath(`/chat/message/list`), body, params);
  }

/** Get all chat messages */
  async createListAllEntities(body?: ChatMessageQueryListForm): Promise<PlusApiResultListPlusChatMessageVO> {
    return this.client.post<PlusApiResultListPlusChatMessageVO>(backendApiPath(`/chat/message/list/all`), body);
  }

/** Create a chat completion */
  async create(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/chat/completions`), body, params, headers);
  }

/** Get a chat message by ID */
  async getByIdMessage(id: string | number): Promise<PlusApiResultPlusChatMessageVO> {
    return this.client.get<PlusApiResultPlusChatMessageVO>(backendApiPath(`/chat/message/${id}`));
  }

/** Delete a chat message */
  async deleteMessage(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/chat/message/${id}`));
  }
}

export function createChatApi(client: HttpClient): ChatApi {
  return new ChatApi(client);
}
