import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAiModelInfoForm, PlusAiModelInfoQueryListForm, PlusAiModelPriceForm, PlusApiResultBoolean, PlusApiResultListPlusAiModelInfoVO, PlusApiResultListPlusAiModelPriceVO, PlusApiResultPagePlusAiModelInfoVO, PlusApiResultPagePlusAiModelPriceVO, PlusApiResultPlusAiModelInfoVO, PlusApiResultPlusAiModelPriceVO, QueryListForm } from '../types';


export class ModelApi {
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

/** Update an existing AI model price */
  async updatePrice(body: PlusAiModelPriceForm): Promise<PlusApiResultPlusAiModelPriceVO> {
    return this.client.put<PlusApiResultPlusAiModelPriceVO>(backendApiPath(`/model/price`), body);
  }

/** Create a new AI model price */
  async createPrice(body: PlusAiModelPriceForm): Promise<PlusApiResultPlusAiModelPriceVO> {
    return this.client.post<PlusApiResultPlusAiModelPriceVO>(backendApiPath(`/model/price`), body);
  }

/** Get AI model prices by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiModelPriceVO> {
    return this.client.post<PlusApiResultPagePlusAiModelPriceVO>(backendApiPath(`/model/price/list`), body, params);
  }

/** Get all AI model prices */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAiModelPriceVO> {
    return this.client.post<PlusApiResultListPlusAiModelPriceVO>(backendApiPath(`/model/price/list/all`), body);
  }

/** Get AI model information by page */
  async createListByPageModel(body?: PlusAiModelInfoQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAiModelInfoVO> {
    return this.client.post<PlusApiResultPagePlusAiModelInfoVO>(backendApiPath(`/model/list`), body, params);
  }

/** Get all AI model information */
  async createListAllEntitiesModel(body?: PlusAiModelInfoQueryListForm): Promise<PlusApiResultListPlusAiModelInfoVO> {
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

/** Get an AI model price by ID */
  async getByIdPrice(id: string | number): Promise<PlusApiResultPlusAiModelPriceVO> {
    return this.client.get<PlusApiResultPlusAiModelPriceVO>(backendApiPath(`/model/price/${id}`));
  }

/** Delete an AI model price */
  async deletePrice(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/model/price/${id}`));
  }
}

export function createModelApi(client: HttpClient): ModelApi {
  return new ModelApi(client);
}
