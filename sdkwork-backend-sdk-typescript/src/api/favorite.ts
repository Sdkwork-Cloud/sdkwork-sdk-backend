import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusFavoriteVO, PlusApiResultPagePlusFavoriteVO, PlusApiResultPlusFavoriteVO, PlusFavoriteForm, QueryListForm } from '../types';


export class FavoriteApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing favorite */
  async update(body: PlusFavoriteForm): Promise<PlusApiResultPlusFavoriteVO> {
    return this.client.put<PlusApiResultPlusFavoriteVO>(backendApiPath(`/favorite`), body);
  }

/** Create a new favorite */
  async create(body: PlusFavoriteForm): Promise<PlusApiResultPlusFavoriteVO> {
    return this.client.post<PlusApiResultPlusFavoriteVO>(backendApiPath(`/favorite`), body);
  }

/** Get favorites by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFavoriteVO> {
    return this.client.post<PlusApiResultPagePlusFavoriteVO>(backendApiPath(`/favorite/list`), body, params);
  }

/** Get all favorites */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusFavoriteVO> {
    return this.client.post<PlusApiResultListPlusFavoriteVO>(backendApiPath(`/favorite/list/all`), body);
  }

/** Get a favorite by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusFavoriteVO> {
    return this.client.get<PlusApiResultPlusFavoriteVO>(backendApiPath(`/favorite/${id}`));
  }

/** Delete a favorite */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/favorite/${id}`));
  }
}

export function createFavoriteApi(client: HttpClient): FavoriteApi {
  return new FavoriteApi(client);
}
