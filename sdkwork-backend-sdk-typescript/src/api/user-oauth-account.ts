import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusUserOAuthAccountVO, PlusApiResultPagePlusUserOAuthAccountVO, PlusApiResultPlusUserOAuthAccountVO, PlusUserOAuthAccountForm, QueryListForm } from '../types';


export class UserOauthAccountApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update user OAuth account */
  async update(body: PlusUserOAuthAccountForm): Promise<PlusApiResultPlusUserOAuthAccountVO> {
    return this.client.put<PlusApiResultPlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account`), body);
  }

/** Create user OAuth account */
  async create(body: PlusUserOAuthAccountForm): Promise<PlusApiResultPlusUserOAuthAccountVO> {
    return this.client.post<PlusApiResultPlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account`), body);
  }

/** Get user OAuth accounts by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserOAuthAccountVO> {
    return this.client.post<PlusApiResultPagePlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account/list`), body, params);
  }

/** Get all user OAuth accounts */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusUserOAuthAccountVO> {
    return this.client.post<PlusApiResultListPlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account/list/all`), body);
  }

/** Get user OAuth account by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusUserOAuthAccountVO> {
    return this.client.get<PlusApiResultPlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account/${id}`));
  }

/** Delete user OAuth account */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/oauth/account/${id}`));
  }
}

export function createUserOauthAccountApi(client: HttpClient): UserOauthAccountApi {
  return new UserOauthAccountApi(client);
}
