import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusShareVO, PlusApiResultPagePlusShareVO, PlusApiResultPlusShareVO, PlusShareForm, QueryListForm } from '../types';


export class ShareApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 更新分享 */
  async update(body: PlusShareForm): Promise<PlusApiResultPlusShareVO> {
    return this.client.put<PlusApiResultPlusShareVO>(backendApiPath(`/share`), body);
  }

/** 创建分享 */
  async create(body: PlusShareForm): Promise<PlusApiResultPlusShareVO> {
    return this.client.post<PlusApiResultPlusShareVO>(backendApiPath(`/share`), body);
  }

/** 分页获取分享 */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShareVO> {
    return this.client.post<PlusApiResultPagePlusShareVO>(backendApiPath(`/share/list`), body, params);
  }

/** 获取所有分享 */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShareVO> {
    return this.client.post<PlusApiResultListPlusShareVO>(backendApiPath(`/share/list/all`), body);
  }

/** 获取分享详情 */
  async getById(id: string | number): Promise<PlusApiResultPlusShareVO> {
    return this.client.get<PlusApiResultPlusShareVO>(backendApiPath(`/share/${id}`));
  }

/** 删除分享 */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/share/${id}`));
  }
}

export function createShareApi(client: HttpClient): ShareApi {
  return new ShareApi(client);
}
