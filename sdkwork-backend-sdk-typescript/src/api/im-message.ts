import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultPagePlusMessage, QueryListForm } from '../types';


export class ImMessageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get messages by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusMessage> {
    return this.client.post<PlusApiResultPagePlusMessage>(backendApiPath(`/im/message/list`), body, params);
  }
}

export function createImMessageApi(client: HttpClient): ImMessageApi {
  return new ImMessageApi(client);
}
