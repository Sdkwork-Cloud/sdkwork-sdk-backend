import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiModelPriceForm, PlusApiResultBoolean, PlusApiResultListPlusAiModelPriceVO, PlusApiResultPagePlusAiModelPriceVO, PlusApiResultPlusAiModelPriceVO, QueryListForm } from '../types';


export class ModelPriceApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing AI model price */
  async update(body: PlusAiModelPriceForm): Promise<PlusApiResultPlusAiModelPriceVO> {
    return this.client.put<PlusApiResultPlusAiModelPriceVO>(backendApiPath(`/model/price`), body);
  }

/** Create a new AI model price */
  async create(body: PlusAiModelPriceForm): Promise<PlusApiResultPlusAiModelPriceVO> {
    return this.client.post<PlusApiResultPlusAiModelPriceVO>(backendApiPath(`/model/price`), body);
  }

/** Get AI model prices by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiModelPriceVO> {
    return this.client.post<PlusApiResultPagePlusAiModelPriceVO>(backendApiPath(`/model/price/list`), body, params);
  }

/** Get all AI model prices */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiModelPriceVO> {
    return this.client.post<PlusApiResultListPlusAiModelPriceVO>(backendApiPath(`/model/price/list/all`), body);
  }

/** Get an AI model price by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAiModelPriceVO> {
    return this.client.get<PlusApiResultPlusAiModelPriceVO>(backendApiPath(`/model/price/${id}`));
  }

/** Delete an AI model price */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/model/price/${id}`));
  }
}

export function createModelPriceApi(client: HttpClient): ModelPriceApi {
  return new ModelPriceApi(client);
}
