import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OAuthLoginConfigPreviewForm, OAuthLoginRequestForm, OAuthProviderAccountForm, OAuthProviderAccountQueryForm, OAuthProviderAccountSecretRotateForm, OAuthProviderAccountStatusChangeForm, PlusApiResultBoolean, PlusApiResultListOAuthProviderAccountVO, PlusApiResultListPlusOAuthAppBindingVO, PlusApiResultOAuthLoginConfigPreviewVO, PlusApiResultOAuthLoginResponseVO, PlusApiResultOAuthProviderAccountImpactVO, PlusApiResultOAuthProviderAccountVO, PlusApiResultPageOAuthProviderAccountVO, PlusApiResultPagePlusOAuthAppBindingVO, PlusApiResultPlusOAuthAppBindingVO, PlusOAuthAppBindingForm, PlusOAuthAppBindingQueryForm } from '../types';


export class OauthApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

async update(body: OAuthProviderAccountForm): Promise<PlusApiResultOAuthProviderAccountVO> {
    return this.client.put<PlusApiResultOAuthProviderAccountVO>(backendApiPath(`/oauth/provider-account`), body);
  }

async create(body: OAuthProviderAccountForm): Promise<PlusApiResultOAuthProviderAccountVO> {
    return this.client.post<PlusApiResultOAuthProviderAccountVO>(backendApiPath(`/oauth/provider-account`), body);
  }

async updateAppBinding(body: PlusOAuthAppBindingForm): Promise<PlusApiResultPlusOAuthAppBindingVO> {
    return this.client.put<PlusApiResultPlusOAuthAppBindingVO>(backendApiPath(`/oauth/app-binding`), body);
  }

async createAppBinding(body: PlusOAuthAppBindingForm): Promise<PlusApiResultPlusOAuthAppBindingVO> {
    return this.client.post<PlusApiResultPlusOAuthAppBindingVO>(backendApiPath(`/oauth/app-binding`), body);
  }

async testAuthUrl(id: string | number, body?: OAuthLoginRequestForm): Promise<PlusApiResultOAuthLoginResponseVO> {
    return this.client.post<PlusApiResultOAuthLoginResponseVO>(backendApiPath(`/oauth/provider-account/${id}/test`), body);
  }

async rotateSecret(id: string | number, body: OAuthProviderAccountSecretRotateForm): Promise<PlusApiResultOAuthProviderAccountVO> {
    return this.client.post<PlusApiResultOAuthProviderAccountVO>(backendApiPath(`/oauth/provider-account/${id}/rotate-secret`), body);
  }

async changeStatus(id: string | number, body: OAuthProviderAccountStatusChangeForm): Promise<PlusApiResultOAuthProviderAccountVO> {
    return this.client.post<PlusApiResultOAuthProviderAccountVO>(backendApiPath(`/oauth/provider-account/${id}/change-status`), body);
  }

async listByPage(body?: OAuthProviderAccountQueryForm, params?: QueryParams): Promise<PlusApiResultPageOAuthProviderAccountVO> {
    return this.client.post<PlusApiResultPageOAuthProviderAccountVO>(backendApiPath(`/oauth/provider-account/list`), body, params);
  }

async listAllEntities(body?: OAuthProviderAccountQueryForm): Promise<PlusApiResultListOAuthProviderAccountVO> {
    return this.client.post<PlusApiResultListOAuthProviderAccountVO>(backendApiPath(`/oauth/provider-account/list/all`), body);
  }

async resolvePreview(body: OAuthLoginConfigPreviewForm): Promise<PlusApiResultOAuthLoginConfigPreviewVO> {
    return this.client.post<PlusApiResultOAuthLoginConfigPreviewVO>(backendApiPath(`/oauth/app-binding/resolve-preview`), body);
  }

async createListByPage(body?: PlusOAuthAppBindingQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusOAuthAppBindingVO> {
    return this.client.post<PlusApiResultPagePlusOAuthAppBindingVO>(backendApiPath(`/oauth/app-binding/list`), body, params);
  }

async createListAllEntities(body?: PlusOAuthAppBindingQueryForm): Promise<PlusApiResultListPlusOAuthAppBindingVO> {
    return this.client.post<PlusApiResultListPlusOAuthAppBindingVO>(backendApiPath(`/oauth/app-binding/list/all`), body);
  }

async getById(id: string | number): Promise<PlusApiResultOAuthProviderAccountVO> {
    return this.client.get<PlusApiResultOAuthProviderAccountVO>(backendApiPath(`/oauth/provider-account/${id}`));
  }

async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/oauth/provider-account/${id}`));
  }

async getImpact(id: string | number): Promise<PlusApiResultOAuthProviderAccountImpactVO> {
    return this.client.get<PlusApiResultOAuthProviderAccountImpactVO>(backendApiPath(`/oauth/provider-account/${id}/impact`));
  }

async getByIdAppBinding(id: string | number): Promise<PlusApiResultPlusOAuthAppBindingVO> {
    return this.client.get<PlusApiResultPlusOAuthAppBindingVO>(backendApiPath(`/oauth/app-binding/${id}`));
  }

async deleteAppBinding(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/oauth/app-binding/${id}`));
  }
}

export function createOauthApi(client: HttpClient): OauthApi {
  return new OauthApi(client);
}
