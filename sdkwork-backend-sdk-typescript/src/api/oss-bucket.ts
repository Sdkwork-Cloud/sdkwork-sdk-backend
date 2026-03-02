import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusOssBucketVO, PlusApiResultPagePlusOssBucketVO, PlusApiResultPlusOssBucketVO, PlusOssBucketForm, QueryListForm } from '../types';


export class OssBucketApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing OSS bucket */
  async update(body: PlusOssBucketForm): Promise<PlusApiResultPlusOssBucketVO> {
    return this.client.put<PlusApiResultPlusOssBucketVO>(backendApiPath(`/oss/bucket`), body);
  }

/** Create a new OSS bucket */
  async create(body: PlusOssBucketForm): Promise<PlusApiResultPlusOssBucketVO> {
    return this.client.post<PlusApiResultPlusOssBucketVO>(backendApiPath(`/oss/bucket`), body);
  }

/** Get OSS buckets by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOssBucketVO> {
    return this.client.post<PlusApiResultPagePlusOssBucketVO>(backendApiPath(`/oss/bucket/list`), body, params);
  }

/** Get all OSS buckets */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusOssBucketVO> {
    return this.client.post<PlusApiResultListPlusOssBucketVO>(backendApiPath(`/oss/bucket/list/all`), body);
  }

/** Get an OSS bucket by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusOssBucketVO> {
    return this.client.get<PlusApiResultPlusOssBucketVO>(backendApiPath(`/oss/bucket/${id}`));
  }

/** Delete an OSS bucket */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/oss/bucket/${id}`));
  }
}

export function createOssBucketApi(client: HttpClient): OssBucketApi {
  return new OssBucketApi(client);
}
