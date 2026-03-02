import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusUserCardVO, PlusApiResultPagePlusUserCardVO, PlusApiResultPlusUserCardVO, PlusUserCardForm, QueryListForm } from '../types';


export class UserCardApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update user-card binding */
  async update(body: PlusUserCardForm): Promise<PlusApiResultPlusUserCardVO> {
    return this.client.put<PlusApiResultPlusUserCardVO>(backendApiPath(`/user/card`), body);
  }

/** Create user-card binding */
  async create(body: PlusUserCardForm): Promise<PlusApiResultPlusUserCardVO> {
    return this.client.post<PlusApiResultPlusUserCardVO>(backendApiPath(`/user/card`), body);
  }

/** Get user-card bindings by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserCardVO> {
    return this.client.post<PlusApiResultPagePlusUserCardVO>(backendApiPath(`/user/card/list`), body, params);
  }

/** Get all user-card bindings */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusUserCardVO> {
    return this.client.post<PlusApiResultListPlusUserCardVO>(backendApiPath(`/user/card/list/all`), body);
  }

/** Get user-card binding by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusUserCardVO> {
    return this.client.get<PlusApiResultPlusUserCardVO>(backendApiPath(`/user/card/${id}`));
  }

/** Delete user-card binding */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/card/${id}`));
  }
}

export function createUserCardApi(client: HttpClient): UserCardApi {
  return new UserCardApi(client);
}
