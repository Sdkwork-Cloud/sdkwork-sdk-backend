import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { OAuthCallbackForm, OAuthLoginRequestForm, OAuthLoginResponse, TokenDTO } from '../types';


export class OauthAuthenticationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get OAuth authorization URL */
  async getAuthUrl(body: OAuthLoginRequestForm): Promise<OAuthLoginResponse> {
    return this.client.post<OAuthLoginResponse>(backendApiPath(`/auth/oauth/get_auth_url`), body);
  }

/** Get OAuth authorization URL */
  async createGetAuthUrl(body: OAuthLoginRequestForm): Promise<OAuthLoginResponse> {
    return this.client.post<OAuthLoginResponse>(backendApiPath(`/auth/oauth/authorize`), body);
  }

/** Handle OAuth callback */
  async handleCallback(body: OAuthCallbackForm): Promise<TokenDTO> {
    return this.client.post<TokenDTO>(backendApiPath(`/auth/oauth/callback`), body);
  }
}

export function createOauthAuthenticationApi(client: HttpClient): OauthAuthenticationApi {
  return new OauthAuthenticationApi(client);
}
