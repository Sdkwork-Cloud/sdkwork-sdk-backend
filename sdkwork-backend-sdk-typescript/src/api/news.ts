import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusNewsVO, PlusApiResultPagePlusNewsVO, PlusApiResultPlusNewsVO, PlusNewsForm, QueryListForm } from '../types';


export class NewsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing news */
  async update(body: PlusNewsForm): Promise<PlusApiResultPlusNewsVO> {
    return this.client.put<PlusApiResultPlusNewsVO>(backendApiPath(`/news`), body);
  }

/** Create a new news */
  async create(body: PlusNewsForm): Promise<PlusApiResultPlusNewsVO> {
    return this.client.post<PlusApiResultPlusNewsVO>(backendApiPath(`/news`), body);
  }

/** Get news by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusNewsVO> {
    return this.client.post<PlusApiResultPagePlusNewsVO>(backendApiPath(`/news/list`), body, params);
  }

/** Get all news */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusNewsVO> {
    return this.client.post<PlusApiResultListPlusNewsVO>(backendApiPath(`/news/list/all`), body);
  }

/** Get a news by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusNewsVO> {
    return this.client.get<PlusApiResultPlusNewsVO>(backendApiPath(`/news/${id}`));
  }

/** Delete a news */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/news/${id}`));
  }
}

export function createNewsApi(client: HttpClient): NewsApi {
  return new NewsApi(client);
}
