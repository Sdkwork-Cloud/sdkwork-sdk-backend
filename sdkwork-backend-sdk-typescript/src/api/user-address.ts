import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusUserAddressVO, PlusApiResultPagePlusUserAddressVO, PlusApiResultPlusUserAddressVO, PlusUserAddressForm, QueryListForm } from '../types';


export class UserAddressApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing user address */
  async update(body: PlusUserAddressForm): Promise<PlusApiResultPlusUserAddressVO> {
    return this.client.put<PlusApiResultPlusUserAddressVO>(backendApiPath(`/user/address`), body);
  }

/** Create a new user address */
  async create(body: PlusUserAddressForm): Promise<PlusApiResultPlusUserAddressVO> {
    return this.client.post<PlusApiResultPlusUserAddressVO>(backendApiPath(`/user/address`), body);
  }

/** Get addresses by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserAddressVO> {
    return this.client.post<PlusApiResultPagePlusUserAddressVO>(backendApiPath(`/user/address/list`), body, params);
  }

/** Get all user addresses */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusUserAddressVO> {
    return this.client.post<PlusApiResultListPlusUserAddressVO>(backendApiPath(`/user/address/list/all`), body);
  }

/** Get address by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusUserAddressVO> {
    return this.client.get<PlusApiResultPlusUserAddressVO>(backendApiPath(`/user/address/${id}`));
  }

/** Delete a user address */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/address/${id}`));
  }
}

export function createUserAddressApi(client: HttpClient): UserAddressApi {
  return new UserAddressApi(client);
}
