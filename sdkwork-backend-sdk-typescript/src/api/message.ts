import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusChatMessageContentVO, PlusApiResultPagePlusChatMessageContentVO, PlusApiResultPlusChatMessageContentVO, PlusChatMessageContentForm, QueryListForm } from '../types';


export class MessageApi {
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

/** Get chat messages by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChatMessageContentVO> {
    return this.client.post<PlusApiResultPagePlusChatMessageContentVO>(backendApiPath(`/message/list`), body, params);
  }

/** Get all chat messages */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusChatMessageContentVO> {
    return this.client.post<PlusApiResultListPlusChatMessageContentVO>(backendApiPath(`/message/list/all`), body);
  }

/** Get chat message by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusChatMessageContentVO> {
    return this.client.get<PlusApiResultPlusChatMessageContentVO>(backendApiPath(`/message/${id}`));
  }

/** Delete a chat message */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/message/${id}`));
  }
}

export function createMessageApi(client: HttpClient): MessageApi {
  return new MessageApi(client);
}
