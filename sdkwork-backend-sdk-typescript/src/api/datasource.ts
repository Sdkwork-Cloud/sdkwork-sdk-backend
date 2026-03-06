import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChatCompletionChunk, ChatCompletionCreateForm, PlusApiResultBoolean, PlusApiResultListPlusDatasourceVO, PlusApiResultPagePlusDatasourceVO, PlusApiResultPlusDatasourceVO, PlusDatasourceForm, QueryListForm } from '../types';


export class DatasourceApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing data source */
  async update(body: PlusDatasourceForm): Promise<PlusApiResultPlusDatasourceVO> {
    return this.client.put<PlusApiResultPlusDatasourceVO>(backendApiPath(`/datasource`), body);
  }

/** Create a new data source */
  async create(body: PlusDatasourceForm): Promise<PlusApiResultPlusDatasourceVO> {
    return this.client.post<PlusApiResultPlusDatasourceVO>(backendApiPath(`/datasource`), body);
  }

async stop(params?: QueryParams, headers?: Record<string, string>): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/datasource/stop`), undefined, params, headers);
  }

/** Get data sources by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDatasourceVO> {
    return this.client.post<PlusApiResultPagePlusDatasourceVO>(backendApiPath(`/datasource/list`), body, params);
  }

/** Get all data sources */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusDatasourceVO> {
    return this.client.post<PlusApiResultListPlusDatasourceVO>(backendApiPath(`/datasource/list/all`), body);
  }

/** Create a chat completion with Datasource */
  async createCompletions(body: ChatCompletionCreateForm, params?: QueryParams, headers?: Record<string, string>): Promise<ChatCompletionChunk> {
    return this.client.post<ChatCompletionChunk>(backendApiPath(`/datasource/chat/completions`), body, params, headers);
  }

/** Get a data source by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusDatasourceVO> {
    return this.client.get<PlusApiResultPlusDatasourceVO>(backendApiPath(`/datasource/${id}`));
  }

/** Delete a data source */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/datasource/${id}`));
  }
}

export function createDatasourceApi(client: HttpClient): DatasourceApi {
  return new DatasourceApi(client);
}
