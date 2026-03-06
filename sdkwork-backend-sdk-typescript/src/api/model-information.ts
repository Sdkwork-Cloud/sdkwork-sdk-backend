import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiModelInfoForm, PlusAiModelInfoQueryListForm, PlusApiResultBoolean, PlusApiResultListPlusAiModelInfoVO, PlusApiResultPagePlusAiModelInfoVO, PlusApiResultPlusAiModelInfoVO } from '../types';


export class ModelInformationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update existing AI model information */
  async update(body: PlusAiModelInfoForm): Promise<PlusApiResultPlusAiModelInfoVO> {
    return this.client.put<PlusApiResultPlusAiModelInfoVO>(backendApiPath(`/model`), body);
  }

/** Create a new AI model information */
  async create(body: PlusAiModelInfoForm): Promise<PlusApiResultPlusAiModelInfoVO> {
    return this.client.post<PlusApiResultPlusAiModelInfoVO>(backendApiPath(`/model`), body);
  }

/** Get AI model information by page */
  async listByPage(body?: PlusAiModelInfoQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiModelInfoVO> {
    return this.client.post<PlusApiResultPagePlusAiModelInfoVO>(backendApiPath(`/model/list`), body, params);
  }

/** Get all AI model information */
  async listAllEntities(body?: PlusAiModelInfoQueryListForm): Promise<PlusApiResultListPlusAiModelInfoVO> {
    return this.client.post<PlusApiResultListPlusAiModelInfoVO>(backendApiPath(`/model/list/all`), body);
  }

/** Get AI model information by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiModelInfoVO> {
    return this.client.get<PlusApiResultPlusAiModelInfoVO>(backendApiPath(`/model/${id}`));
  }

/** Delete AI model information */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/model/${id}`));
  }
}

export function createModelInformationApi(client: HttpClient): ModelInformationApi {
  return new ModelInformationApi(client);
}
