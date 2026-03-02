import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusHostDomainVO, PlusApiResultPagePlusHostDomainVO, PlusApiResultPlusHostDomainVO, PlusHostDomainForm, QueryListForm } from '../types';


export class HostApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 更新域名 */
  async update(body: PlusHostDomainForm): Promise<PlusApiResultPlusHostDomainVO> {
    return this.client.put<PlusApiResultPlusHostDomainVO>(backendApiPath(`/net/host/domain`), body);
  }

/** 创建域名 */
  async create(body: PlusHostDomainForm): Promise<PlusApiResultPlusHostDomainVO> {
    return this.client.post<PlusApiResultPlusHostDomainVO>(backendApiPath(`/net/host/domain`), body);
  }

/** 分页获取域名 */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusHostDomainVO> {
    return this.client.post<PlusApiResultPagePlusHostDomainVO>(backendApiPath(`/net/host/domain/list`), body, params);
  }

/** 获取所有域名 */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusHostDomainVO> {
    return this.client.post<PlusApiResultListPlusHostDomainVO>(backendApiPath(`/net/host/domain/list/all`), body);
  }

/** 获取域名详情 */
  async getById(id: string | number): Promise<PlusApiResultPlusHostDomainVO> {
    return this.client.get<PlusApiResultPlusHostDomainVO>(backendApiPath(`/net/host/domain/${id}`));
  }

/** 删除域名 */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/net/host/domain/${id}`));
  }
}

export function createHostApi(client: HttpClient): HostApi {
  return new HostApi(client);
}
