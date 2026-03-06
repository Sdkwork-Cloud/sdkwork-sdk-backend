import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiKeyForm, PlusApiKeySelfCreateForm, PlusApiKeySelfUpdateForm, PlusApiResultBoolean, PlusApiResultListPlusApiKeyVO, PlusApiResultPagePlusApiKeyVO, PlusApiResultPlusApiKeyVO, QueryListForm } from '../types';


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

/** Get API key detail for current user */
  async getMy(id: string | number): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.get<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey/my/${id}`));
  }

/** Update API key for current user */
  async updateMy(id: string | number, body: PlusApiKeySelfUpdateForm): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.put<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey/my/${id}`), body);
  }

/** Delete API key for current user */
  async deleteMy(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/apikey/my/${id}`));
  }

/** Create API key for current user */
  async createMy(body: PlusApiKeySelfCreateForm): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.post<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey/my`), body);
  }

/** Rotate API key for current user */
  async rotateMy(id: string | number): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.post<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey/my/${id}/rotate`));
  }

/** Enable API key for current user */
  async enableMy(id: string | number): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.post<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey/my/${id}/enable`));
  }

/** Disable API key for current user */
  async disableMy(id: string | number): Promise<PlusApiResultPlusApiKeyVO> {
    return this.client.post<PlusApiResultPlusApiKeyVO>(backendApiPath(`/apikey/my/${id}/disable`));
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

/** List API keys for current user */
  async listMyApiKeys(): Promise<PlusApiResultListPlusApiKeyVO> {
    return this.client.get<PlusApiResultListPlusApiKeyVO>(backendApiPath(`/apikey/my/list`));
  }
}

export function createApiKeyApi(client: HttpClient): ApiKeyApi {
  return new ApiKeyApi(client);
}
