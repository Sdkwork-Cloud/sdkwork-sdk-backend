import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiKeyForm, PlusApiResultBoolean, PlusApiResultListPlusApiKeyVO, PlusApiResultPagePlusApiKeyVO, PlusApiResultPlusApiKeyVO, QueryListForm } from '../types';


export class ApiKeyApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing API key */
  async update(body: PlusApiKeyForm): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.put<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey`), body);
  }

/** Create a new API key */
  async create(body: PlusApiKeyForm): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.post<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey`), body);
  }

/** Get API keys by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusApiKeyVO> {
    return this.client.post<PlusApiResultPagePlusApiKeyVO>(backendApiPath(`/apikey/list`), body, params);
  }

/** Get all API keys */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusApiKeyVO> {
    return this.client.post<PlusApiResultListPlusApiKeyVO>(backendApiPath(`/apikey/list/all`), body);
  }

/** Get an API key by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.get<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey/${id}`));
  }

/** Delete an API key */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/apikey/${id}`));
  }
}

export function createApiKeyApi(client: HttpClient): ApiKeyApi {
  return new ApiKeyApi(client);
}
