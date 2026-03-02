import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusShardingKeyVO, PlusApiResultPagePlusShardingKeyVO, PlusApiResultPlusShardingKeyVO, PlusShardingKeyForm, QueryListForm } from '../types';


export class ShardingKeyApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update Sharding Key */
  async update(body: PlusShardingKeyForm): Promise<PlusApiResultPlusShardingKeyVO> {
    return this.client.put<PlusApiResultPlusShardingKeyVO>(backendApiPath(`/sharding/key`), body);
  }

/** Create Sharding Key */
  async create(body: PlusShardingKeyForm): Promise<PlusApiResultPlusShardingKeyVO> {
    return this.client.post<PlusApiResultPlusShardingKeyVO>(backendApiPath(`/sharding/key`), body);
  }

/** List Sharding Keys by Page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShardingKeyVO> {
    return this.client.post<PlusApiResultPagePlusShardingKeyVO>(backendApiPath(`/sharding/key/list`), body, params);
  }

/** List All Sharding Keys */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShardingKeyVO> {
    return this.client.post<PlusApiResultListPlusShardingKeyVO>(backendApiPath(`/sharding/key/list/all`), body);
  }

/** Get Sharding Key by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusShardingKeyVO> {
    return this.client.get<PlusApiResultPlusShardingKeyVO>(backendApiPath(`/sharding/key/${id}`));
  }

/** Delete Sharding Key */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/sharding/key/${id}`));
  }
}

export function createShardingKeyApi(client: HttpClient): ShardingKeyApi {
  return new ShardingKeyApi(client);
}
