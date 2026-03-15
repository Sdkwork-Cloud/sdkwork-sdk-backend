import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusImGroupVO, PlusApiResultPagePlusImGroupVO, PlusApiResultPagePlusMessage, PlusApiResultPlusImGroupVO, PlusImGroupForm, PlusImMessageMarkReadForm, PlusImMessageQueryForm, QueryListForm } from '../types';


export class ImApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing chat group */
  async update(body: PlusImGroupForm): Promise<PlusApiResultPlusImGroupVO> {
    return this.client.put<PlusApiResultPlusImGroupVO>(backendApiPath(`/im/group`), body);
  }

/** Create a new chat group */
  async create(body: PlusImGroupForm): Promise<PlusApiResultPlusImGroupVO> {
    return this.client.post<PlusApiResultPlusImGroupVO>(backendApiPath(`/im/group`), body);
  }

/** Mark conversation messages as read */
  async markRead(body: PlusImMessageMarkReadForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/im/message/mark_read`), body);
  }

/** Get messages by page */
  async createListByPage(body?: PlusImMessageQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusMessage> {
    return this.client.post<PlusApiResultPagePlusMessage>(backendApiPath(`/im/message/list`), body, params);
  }

/** Get chat groups by page */
  async createListByPageGroup(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusImGroupVO> {
    return this.client.post<PlusApiResultPagePlusImGroupVO>(backendApiPath(`/im/group/list`), body, params);
  }

/** Get all chat groups */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusImGroupVO> {
    return this.client.post<PlusApiResultListPlusImGroupVO>(backendApiPath(`/im/group/list/all`), body);
  }

/** Get a chat group by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusImGroupVO> {
    return this.client.get<PlusApiResultPlusImGroupVO>(backendApiPath(`/im/group/${id}`));
  }

/** Delete a chat group */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/im/group/${id}`));
  }
}

export function createImApi(client: HttpClient): ImApi {
  return new ImApi(client);
}
