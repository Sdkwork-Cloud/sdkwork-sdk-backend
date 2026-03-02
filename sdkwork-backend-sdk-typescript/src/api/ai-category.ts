import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCategoryVO, PlusApiResultPagePlusCategoryVO, PlusApiResultPlusCategoryVO, PlusApiResultSetPlusTreeNodePlusCategoryVO, PlusCategoryForm, QueryListForm } from '../types';


export class AiCategoryApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing category */
  async update(body: PlusCategoryForm): Promise<PlusApiResultPlusCategoryVO> {
    return this.client.put<PlusApiResultPlusCategoryVO>(backendApiPath(`/category`), body);
  }

/** Create a new category */
  async create(body: PlusCategoryForm): Promise<PlusApiResultPlusCategoryVO> {
    return this.client.post<PlusApiResultPlusCategoryVO>(backendApiPath(`/category`), body);
  }

/** Get categories by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCategoryVO> {
    return this.client.post<PlusApiResultPagePlusCategoryVO>(backendApiPath(`/category/list`), body, params);
  }

/** Get all categories */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCategoryVO> {
    return this.client.post<PlusApiResultListPlusCategoryVO>(backendApiPath(`/category/list/all`), body);
  }

/** Get Tree */
  async getTree(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultSetPlusTreeNodePlusCategoryVO> {
    return this.client.post<PlusApiResultSetPlusTreeNodePlusCategoryVO>(backendApiPath(`/category/get_tree`), body, params);
  }

/** Get a category by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCategoryVO> {
    return this.client.get<PlusApiResultPlusCategoryVO>(backendApiPath(`/category/${id}`));
  }

/** Delete a category */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/category/${id}`));
  }
}

export function createAiCategoryApi(client: HttpClient): AiCategoryApi {
  return new AiCategoryApi(client);
}
