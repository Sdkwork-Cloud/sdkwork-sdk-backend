import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusArticleVO, PlusApiResultPagePlusArticleVO, PlusApiResultPlusArticleVO, PlusArticleForm, QueryListForm } from '../types';


export class AiArticleApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing AI article */
  async update(body: PlusArticleForm): Promise<PlusApiResultPlusArticleVO> {
    return this.client.put<PlusApiResultPlusArticleVO>(backendApiPath(`/article`), body);
  }

/** Create a new AI article */
  async create(body: PlusArticleForm): Promise<PlusApiResultPlusArticleVO> {
    return this.client.post<PlusApiResultPlusArticleVO>(backendApiPath(`/article`), body);
  }

/** Get AI articles by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusArticleVO> {
    return this.client.post<PlusApiResultPagePlusArticleVO>(backendApiPath(`/article/list`), body, params);
  }

/** Get all AI articles */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusArticleVO> {
    return this.client.post<PlusApiResultListPlusArticleVO>(backendApiPath(`/article/list/all`), body);
  }

/** Get an AI article by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusArticleVO> {
    return this.client.get<PlusApiResultPlusArticleVO>(backendApiPath(`/article/${id}`));
  }

/** Delete an AI article */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/article/${id}`));
  }
}

export function createAiArticleApi(client: HttpClient): AiArticleApi {
  return new AiArticleApi(client);
}
