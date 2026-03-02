import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatMessageQueryListForm, PlusApiResultBoolean, PlusApiResultListPlusChatMessageContentVO, PlusApiResultListPlusChatMessageVO, PlusApiResultPagePlusChatMessageContentVO, PlusApiResultPagePlusChatMessageVO, PlusApiResultPlusChatMessageContentVO, PlusApiResultPlusChatMessageVO, PlusChatMessageContentForm, PlusChatMessageForm, QueryListForm } from '../types';


export class ChatMessageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing chat message */
  async update(body: PlusChatMessageContentForm): Promise<PlusApiResultPlusChatMessageContentVO> {
    return this.client.put<PlusApiResultPlusChatMessageContentVO>(backendApiPath(`/message`), body);
  }

/** Create a new chat message */
  async create(body: PlusChatMessageContentForm): Promise<PlusApiResultPlusChatMessageContentVO> {
    return this.client.post<PlusApiResultPlusChatMessageContentVO>(backendApiPath(`/message`), body);
  }

/** Update an existing chat message */
  async updateMessage(body: PlusChatMessageForm): Promise<PlusApiResultPlusChatMessageVO> {
    return this.client.put<PlusApiResultPlusChatMessageVO>(backendApiPath(`/chat/message`), body);
  }

/** Create a new chat message */
  async createMessage(body: PlusChatMessageForm): Promise<PlusApiResultPlusChatMessageVO> {
    return this.client.post<PlusApiResultPlusChatMessageVO>(backendApiPath(`/chat/message`), body);
  }

/** Get chat messages by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChatMessageContentVO> {
    return this.client.post<PlusApiResultPagePlusChatMessageContentVO>(backendApiPath(`/message/list`), body, params);
  }

/** Get all chat messages */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusChatMessageContentVO> {
    return this.client.post<PlusApiResultListPlusChatMessageContentVO>(backendApiPath(`/message/list/all`), body);
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

/** Get chat message by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusChatMessageContentVO> {
    return this.client.get<PlusApiResultPlusChatMessageContentVO>(backendApiPath(`/message/${id}`));
  }

/** Delete a chat message */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/message/${id}`));
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

export function createChatMessageApi(client: HttpClient): ChatMessageApi {
  return new ChatMessageApi(client);
}
