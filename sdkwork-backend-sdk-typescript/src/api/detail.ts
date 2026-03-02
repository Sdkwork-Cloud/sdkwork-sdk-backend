import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusDetailVO, PlusApiResultPagePlusDetailVO, PlusApiResultPlusDetailVO, PlusDetailForm, QueryListForm } from '../types';


export class DetailApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update existing detail content */
  async update(body: PlusDetailForm): Promise<PlusApiResultPlusDetailVO> {
    return this.client.put<PlusApiResultPlusDetailVO>(backendApiPath(`/detail`), body);
  }

/** Create new detail content */
  async create(body: PlusDetailForm): Promise<PlusApiResultPlusDetailVO> {
    return this.client.post<PlusApiResultPlusDetailVO>(backendApiPath(`/detail`), body);
  }

/** Get detail contents by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDetailVO> {
    return this.client.post<PlusApiResultPagePlusDetailVO>(backendApiPath(`/detail/list`), body, params);
  }

/** Get all detail contents */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusDetailVO> {
    return this.client.post<PlusApiResultListPlusDetailVO>(backendApiPath(`/detail/list/all`), body);
  }

/** Get detail content by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusDetailVO> {
    return this.client.get<PlusApiResultPlusDetailVO>(backendApiPath(`/detail/${id}`));
  }

/** Delete detail content */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/detail/${id}`));
  }
}

export function createDetailApi(client: HttpClient): DetailApi {
  return new DetailApi(client);
}
