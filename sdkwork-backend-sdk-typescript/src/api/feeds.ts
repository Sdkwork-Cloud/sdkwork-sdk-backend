import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusFeedsVO, PlusApiResultPagePlusFeedsVO, PlusApiResultPlusFeedsVO, PlusFeedsForm, QueryListForm } from '../types';


export class FeedsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing feeds entry */
  async update(body: PlusFeedsForm): Promise<PlusApiResultPlusFeedsVO> {
    return this.client.put<PlusApiResultPlusFeedsVO>(backendApiPath(`/feeds`), body);
  }

/** Create a new feeds entry */
  async create(body: PlusFeedsForm): Promise<PlusApiResultPlusFeedsVO> {
    return this.client.post<PlusApiResultPlusFeedsVO>(backendApiPath(`/feeds`), body);
  }

/** Get feeds entries by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFeedsVO> {
    return this.client.post<PlusApiResultPagePlusFeedsVO>(backendApiPath(`/feeds/list`), body, params);
  }

/** Get all feeds entries */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusFeedsVO> {
    return this.client.post<PlusApiResultListPlusFeedsVO>(backendApiPath(`/feeds/list/all`), body);
  }

/** Get a feeds entry by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusFeedsVO> {
    return this.client.get<PlusApiResultPlusFeedsVO>(backendApiPath(`/feeds/${id}`));
  }

/** Delete a feeds entry */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/feeds/${id}`));
  }
}

export function createFeedsApi(client: HttpClient): FeedsApi {
  return new FeedsApi(client);
}
