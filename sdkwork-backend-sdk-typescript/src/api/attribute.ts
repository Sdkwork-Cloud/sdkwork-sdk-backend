import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusAttributeVO, PlusApiResultPagePlusAttributeVO, PlusApiResultPlusAttributeVO, PlusAttributeForm, QueryListForm } from '../types';


export class AttributeApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update attribute */
  async update(body: PlusAttributeForm): Promise<PlusApiResultPlusAttributeVO> {
    return this.client.put<PlusApiResultPlusAttributeVO>(backendApiPath(`/attribute`), body);
  }

/** Create attribute */
  async create(body: PlusAttributeForm): Promise<PlusApiResultPlusAttributeVO> {
    return this.client.post<PlusApiResultPlusAttributeVO>(backendApiPath(`/attribute`), body);
  }

/** Get attributes by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAttributeVO> {
    return this.client.post<PlusApiResultPagePlusAttributeVO>(backendApiPath(`/attribute/list`), body, params);
  }

/** Get all attributes */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAttributeVO> {
    return this.client.post<PlusApiResultListPlusAttributeVO>(backendApiPath(`/attribute/list/all`), body);
  }

/** Get attribute by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAttributeVO> {
    return this.client.get<PlusApiResultPlusAttributeVO>(backendApiPath(`/attribute/${id}`));
  }

/** Delete attribute */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/attribute/${id}`));
  }
}

export function createAttributeApi(client: HttpClient): AttributeApi {
  return new AttributeApi(client);
}
