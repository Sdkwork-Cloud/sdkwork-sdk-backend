import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusChannelVO, PlusApiResultPagePlusChannelVO, PlusApiResultPlusChannelVO, PlusChannelForm, QueryListForm } from '../types';


export class ChannelApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update channel */
  async update(body: PlusChannelForm): Promise<PlusApiResultPlusChannelVO> {
    return this.client.put<PlusApiResultPlusChannelVO>(backendApiPath(`/channel`), body);
  }

/** Create channel */
  async create(body: PlusChannelForm): Promise<PlusApiResultPlusChannelVO> {
    return this.client.post<PlusApiResultPlusChannelVO>(backendApiPath(`/channel`), body);
  }

/** List channels by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChannelVO> {
    return this.client.post<PlusApiResultPagePlusChannelVO>(backendApiPath(`/channel/list`), body, params);
  }

/** List all channels */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusChannelVO> {
    return this.client.post<PlusApiResultListPlusChannelVO>(backendApiPath(`/channel/list/all`), body);
  }

/** Get channel by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusChannelVO> {
    return this.client.get<PlusApiResultPlusChannelVO>(backendApiPath(`/channel/${id}`));
  }

/** Delete channel */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/channel/${id}`));
  }
}

export function createChannelApi(client: HttpClient): ChannelApi {
  return new ChannelApi(client);
}
