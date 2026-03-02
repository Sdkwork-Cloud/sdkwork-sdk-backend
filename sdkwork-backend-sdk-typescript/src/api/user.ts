import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusUserVO, PlusApiResultPagePlusUserVO, PlusApiResultPlusUserProfileVO, PlusApiResultPlusUserVO, PlusUserForm, QueryListForm } from '../types';


export class UserApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing user */
  async update(body: PlusUserForm): Promise<PlusApiResultPlusUserVO> {
    return this.client.put<PlusApiResultPlusUserVO>(backendApiPath(`/user`), body);
  }

/** Create a new user */
  async create(body: PlusUserForm): Promise<PlusApiResultPlusUserVO> {
    return this.client.post<PlusApiResultPlusUserVO>(backendApiPath(`/user`), body);
  }

/** Get users by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserVO> {
    return this.client.post<PlusApiResultPagePlusUserVO>(backendApiPath(`/user/list`), body, params);
  }

/** Get all users */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusUserVO> {
    return this.client.post<PlusApiResultListPlusUserVO>(backendApiPath(`/user/list/all`), body);
  }

/** Get a user by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusUserVO> {
    return this.client.get<PlusApiResultPlusUserVO>(backendApiPath(`/user/${id}`));
  }

/** Delete a user */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/${id}`));
  }

/** Get current user profile */
  async getProfile(): Promise<PlusApiResultPlusUserProfileVO> {
    return this.client.get<PlusApiResultPlusUserProfileVO>(backendApiPath(`/user/profile`));
  }
}

export function createUserApi(client: HttpClient): UserApi {
  return new UserApi(client);
}
