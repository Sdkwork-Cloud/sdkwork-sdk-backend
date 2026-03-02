import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusKnowledgeBaseVO, PlusApiResultPagePlusKnowledgeBaseVO, PlusApiResultPlusKnowledgeBaseVO, PlusKnowledgeBaseForm, QueryListForm } from '../types';


export class KnowledgeBaseApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing knowledge base */
  async update(body: PlusKnowledgeBaseForm): Promise<PlusApiResultPlusKnowledgeBaseVO> {
    return this.client.put<PlusApiResultPlusKnowledgeBaseVO>(backendApiPath(`/knowledge_base`), body);
  }

/** Create a new knowledge base */
  async create(body: PlusKnowledgeBaseForm): Promise<PlusApiResultPlusKnowledgeBaseVO> {
    return this.client.post<PlusApiResultPlusKnowledgeBaseVO>(backendApiPath(`/knowledge_base`), body);
  }

/** Get knowledge bases by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusKnowledgeBaseVO> {
    return this.client.post<PlusApiResultPagePlusKnowledgeBaseVO>(backendApiPath(`/knowledge_base/list`), body, params);
  }

/** Get all knowledge bases */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusKnowledgeBaseVO> {
    return this.client.post<PlusApiResultListPlusKnowledgeBaseVO>(backendApiPath(`/knowledge_base/list/all`), body);
  }

/** Get a knowledge base detail by ID */
  async getDetail(params?: QueryParams): Promise<PlusApiResultPlusKnowledgeBaseVO> {
    return this.client.post<PlusApiResultPlusKnowledgeBaseVO>(backendApiPath(`/knowledge_base/get_detail`), undefined, params);
  }

/** Get a knowledge base by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusKnowledgeBaseVO> {
    return this.client.get<PlusApiResultPlusKnowledgeBaseVO>(backendApiPath(`/knowledge_base/${id}`));
  }

/** Delete a knowledge base */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/knowledge_base/${id}`));
  }
}

export function createKnowledgeBaseApi(client: HttpClient): KnowledgeBaseApi {
  return new KnowledgeBaseApi(client);
}
