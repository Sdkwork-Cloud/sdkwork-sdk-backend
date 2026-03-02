import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusChannelResourceVO, PlusApiResultPagePlusChannelResourceVO, PlusApiResultPlusChannelResourceVO, PlusChannelResourceForm, QueryListForm } from '../types';


export class ChannelResourceApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing channel resource */
  async update(body: PlusChannelResourceForm): Promise<PlusApiResultPlusChannelResourceVO> {
    return this.client.put<PlusApiResultPlusChannelResourceVO>(backendApiPath(`/channel/resource`), body);
  }

/** Create a new channel resource */
  async create(body: PlusChannelResourceForm): Promise<PlusApiResultPlusChannelResourceVO> {
    return this.client.post<PlusApiResultPlusChannelResourceVO>(backendApiPath(`/channel/resource`), body);
  }

/** Get channel resources by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChannelResourceVO> {
    return this.client.post<PlusApiResultPagePlusChannelResourceVO>(backendApiPath(`/channel/resource/list`), body, params);
  }

/** Get all channel resources */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusChannelResourceVO> {
    return this.client.post<PlusApiResultListPlusChannelResourceVO>(backendApiPath(`/channel/resource/list/all`), body);
  }

/** Get a channel resource by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusChannelResourceVO> {
    return this.client.get<PlusApiResultPlusChannelResourceVO>(backendApiPath(`/channel/resource/${id}`));
  }

/** Delete a channel resource */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/channel/resource/${id}`));
  }
}

export function createChannelResourceApi(client: HttpClient): ChannelResourceApi {
  return new ChannelResourceApi(client);
}
