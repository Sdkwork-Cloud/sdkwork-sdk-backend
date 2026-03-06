import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusConversationVO, PlusApiResultPagePlusConversationVO, PlusApiResultPlusConversationVO, PlusConversationForm, PlusConversationOpenForm, PlusConversationQueryListForm, PlusMessageFeedbackForm } from '../types';


export class ConversationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing conversation */
  async update(body: PlusConversationForm): Promise<PlusApiResultPlusConversationVO> {
    return this.client.put<PlusApiResultPlusConversationVO>(backendApiPath(`/conversation`), body);
  }

/** Create a new conversation */
  async create(body: PlusConversationForm): Promise<PlusApiResultPlusConversationVO> {
    return this.client.post<PlusApiResultPlusConversationVO>(backendApiPath(`/conversation`), body);
  }

/** Pin/Unpin a conversation */
  async pin(id: string | number, params?: QueryParams): Promise<PlusApiResultPlusConversationVO> {
    return this.client.post<PlusApiResultPlusConversationVO>(backendApiPath(`/conversation/${id}/pin`), undefined, params);
  }

/** Get all open conversations */
  async open(body?: PlusConversationOpenForm): Promise<PlusApiResultPlusConversationVO> {
    return this.client.post<PlusApiResultPlusConversationVO>(backendApiPath(`/conversation/open`), body);
  }

/** Update an existing conversation */
  async messageFeedback(body: PlusMessageFeedbackForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/conversation/message_feedback`), body);
  }

/** Get conversations by page */
  async listByPage(body?: PlusConversationQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusConversationVO> {
    return this.client.post<PlusApiResultPagePlusConversationVO>(backendApiPath(`/conversation/list`), body, params);
  }

/** Get all conversations */
  async listAllEntities(body?: PlusConversationQueryListForm): Promise<PlusApiResultListPlusConversationVO> {
    return this.client.post<PlusApiResultListPlusConversationVO>(backendApiPath(`/conversation/list/all`), body);
  }

/** Get a conversation by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusConversationVO> {
    return this.client.get<PlusApiResultPlusConversationVO>(backendApiPath(`/conversation/${id}`));
  }

/** Delete a conversation */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/conversation/${id}`));
  }
}

export function createConversationApi(client: HttpClient): ConversationApi {
  return new ConversationApi(client);
}
