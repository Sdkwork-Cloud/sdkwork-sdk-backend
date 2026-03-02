import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCollectionItemVO, PlusApiResultPagePlusCollectionItemVO, PlusApiResultPlusCollectionItemVO, PlusCollectionItemForm, QueryListForm } from '../types';


export class CollectionItemApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing collection item */
  async update(body: PlusCollectionItemForm): Promise<PlusApiResultPlusCollectionItemVO> {
    return this.client.put<PlusApiResultPlusCollectionItemVO>(backendApiPath(`/collection-item`), body);
  }

/** Create a new collection item */
  async create(body: PlusCollectionItemForm): Promise<PlusApiResultPlusCollectionItemVO> {
    return this.client.post<PlusApiResultPlusCollectionItemVO>(backendApiPath(`/collection-item`), body);
  }

/** Get collection items by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCollectionItemVO> {
    return this.client.post<PlusApiResultPagePlusCollectionItemVO>(backendApiPath(`/collection-item/list`), body, params);
  }

/** Get all collection items */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCollectionItemVO> {
    return this.client.post<PlusApiResultListPlusCollectionItemVO>(backendApiPath(`/collection-item/list/all`), body);
  }

/** Get a collection item by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCollectionItemVO> {
    return this.client.get<PlusApiResultPlusCollectionItemVO>(backendApiPath(`/collection-item/${id}`));
  }

/** Delete a collection item */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/collection-item/${id}`));
  }
}

export function createCollectionItemApi(client: HttpClient): CollectionItemApi {
  return new CollectionItemApi(client);
}
