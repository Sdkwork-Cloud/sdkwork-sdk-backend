import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListShortUrlVO, PlusApiResultPageShortUrlVO, PlusApiResultShortUrlVO, QueryListForm, ShortUrlForm } from '../types';


export class ShortUrlApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update short URL */
  async update(body: ShortUrlForm): Promise<PlusApiResultShortUrlVO> {
    return this.client.put<PlusApiResultShortUrlVO>(backendApiPath(`/short_url`), body);
  }

/** Create short URL */
  async create(body: ShortUrlForm): Promise<PlusApiResultShortUrlVO> {
    return this.client.post<PlusApiResultShortUrlVO>(backendApiPath(`/short_url`), body);
  }

/** Get short URLs by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPageShortUrlVO> {
    return this.client.post<PlusApiResultPageShortUrlVO>(backendApiPath(`/short_url/list`), body, params);
  }

/** Get all short URLs */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListShortUrlVO> {
    return this.client.post<PlusApiResultListShortUrlVO>(backendApiPath(`/short_url/list/all`), body);
  }

/** Get short URL details */
  async getById(id: string | number): Promise<PlusApiResultShortUrlVO> {
    return this.client.get<PlusApiResultShortUrlVO>(backendApiPath(`/short_url/${id}`));
  }

/** Delete short URL */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/short_url/${id}`));
  }
}

export function createShortUrlApi(client: HttpClient): ShortUrlApi {
  return new ShortUrlApi(client);
}
