import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CreateJsapiSignatureForm, PlusApiResultAppInfoVO, PlusApiResultAppSdkConfigVO, PlusApiResultBoolean, PlusApiResultListPlusAppVO, PlusApiResultPagePlusAppVO, PlusApiResultPlusAppVO, PlusAppForm, QueryListForm } from '../types';


export class AppApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update application */
  async update(body: PlusAppForm): Promise<PlusApiResultPlusAppVO> {
    return this.client.put<PlusApiResultPlusAppVO>(backendApiPath(`/app`), body);
  }

/** Create application */
  async create(body: PlusAppForm): Promise<PlusApiResultPlusAppVO> {
    return this.client.post<PlusApiResultPlusAppVO>(backendApiPath(`/app`), body);
  }

/** Get applications by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAppVO> {
    return this.client.post<PlusApiResultPagePlusAppVO>(backendApiPath(`/app/list`), body, params);
  }

/** Get all applications */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusAppVO> {
    return this.client.post<PlusApiResultListPlusAppVO>(backendApiPath(`/app/list/all`), body);
  }

/** Get app SDK config */
  async getSdkConfig(body: CreateJsapiSignatureForm): Promise<PlusApiResultAppSdkConfigVO> {
    return this.client.post<PlusApiResultAppSdkConfigVO>(backendApiPath(`/app/get_sdk_config`), body);
  }

/** Get application by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusAppVO> {
    return this.client.get<PlusApiResultPlusAppVO>(backendApiPath(`/app/${id}`));
  }

/** Delete application */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/app/${id}`));
  }

/** Get app info */
  async getAppInfo(): Promise<PlusApiResultAppInfoVO> {
    return this.client.get<PlusApiResultAppInfoVO>(backendApiPath(`/app/info`));
  }
}

export function createAppApi(client: HttpClient): AppApi {
  return new AppApi(client);
}
