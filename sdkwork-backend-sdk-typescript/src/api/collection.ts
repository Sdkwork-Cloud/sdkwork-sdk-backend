import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCollectionVO, PlusApiResultPagePlusCollectionVO, PlusApiResultPlusCollectionVO, PlusCollectionForm, QueryListForm } from '../types';


export class CollectionApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing collection */
  async update(body: PlusCollectionForm): Promise<PlusApiResultPlusCollectionVO> {
    return this.client.put<PlusApiResultPlusCollectionVO>(backendApiPath(`/collection`), body);
  }

/** Create a new collection */
  async create(body: PlusCollectionForm): Promise<PlusApiResultPlusCollectionVO> {
    return this.client.post<PlusApiResultPlusCollectionVO>(backendApiPath(`/collection`), body);
  }

/** Get collections by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCollectionVO> {
    return this.client.post<PlusApiResultPagePlusCollectionVO>(backendApiPath(`/collection/list`), body, params);
  }

/** Get all collections */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCollectionVO> {
    return this.client.post<PlusApiResultListPlusCollectionVO>(backendApiPath(`/collection/list/all`), body);
  }

/** Get a collection by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCollectionVO> {
    return this.client.get<PlusApiResultPlusCollectionVO>(backendApiPath(`/collection/${id}`));
  }

/** Delete a collection */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/collection/${id}`));
  }
}

export function createCollectionApi(client: HttpClient): CollectionApi {
  return new CollectionApi(client);
}
