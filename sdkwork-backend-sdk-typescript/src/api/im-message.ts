import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultPagePlusMessage, PlusImMessageMarkReadForm, PlusImMessageQueryForm } from '../types';


export class ImMessageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Mark conversation messages as read */
  async markRead(body: PlusImMessageMarkReadForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/im/message/mark_read`), body);
  }

/** Get messages by page */
  async listByPage(body?: PlusImMessageQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusMessage> {
    return this.client.post<PlusApiResultPagePlusMessage>(backendApiPath(`/im/message/list`), body, params);
  }
}

export function createImMessageApi(client: HttpClient): ImMessageApi {
  return new ImMessageApi(client);
}
