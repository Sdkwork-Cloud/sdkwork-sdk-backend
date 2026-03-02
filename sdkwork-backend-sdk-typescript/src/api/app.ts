import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { CreateJsapiSignatureForm, PlusApiResultAppInfoVO, PlusApiResultAppSdkConfigVO } from '../types';


export class AppApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get app SDK config */
  async getSdkConfig(body: CreateJsapiSignatureForm): Promise<PlusApiResultAppSdkConfigVO> {
    return this.client.post<PlusApiResultAppSdkConfigVO>(backendApiPath(`/app/get_sdk_config`), body);
  }

/** Get app info */
  async getAppInfo(): Promise<PlusApiResultAppInfoVO> {
    return this.client.get<PlusApiResultAppInfoVO>(backendApiPath(`/app/info`));
  }
}

export function createAppApi(client: HttpClient): AppApi {
  return new AppApi(client);
}
