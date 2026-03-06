import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusChannelProxyVO, PlusApiResultPagePlusChannelProxyVO, PlusApiResultPlusChannelProxyVO, PlusChannelProxyForm, QueryListForm } from '../types';


export class ChannelProxyApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update channel proxy */
  async update(body: PlusChannelProxyForm): Promise<PlusApiResultPlusChannelProxyVO> {
    return this.client.put<PlusApiResultPlusChannelProxyVO>(backendApiPath(`/channel/proxy`), body);
  }

/** Create channel proxy */
  async create(body: PlusChannelProxyForm): Promise<PlusApiResultPlusChannelProxyVO> {
    return this.client.post<PlusApiResultPlusChannelProxyVO>(backendApiPath(`/channel/proxy`), body);
  }

/** List channel proxies by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChannelProxyVO> {
    return this.client.post<PlusApiResultPagePlusChannelProxyVO>(backendApiPath(`/channel/proxy/list`), body, params);
  }

/** List all channel proxies */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusChannelProxyVO> {
    return this.client.post<PlusApiResultListPlusChannelProxyVO>(backendApiPath(`/channel/proxy/list/all`), body);
  }

/** Get channel proxy by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusChannelProxyVO> {
    return this.client.get<PlusApiResultPlusChannelProxyVO>(backendApiPath(`/channel/proxy/${id}`));
  }

/** Delete channel proxy */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/channel/proxy/${id}`));
  }
}

export function createChannelProxyApi(client: HttpClient): ChannelProxyApi {
  return new ChannelProxyApi(client);
}
