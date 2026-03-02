import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCardVO, PlusApiResultPagePlusCardVO, PlusApiResultPlusCardVO, PlusCardForm, QueryListForm } from '../types';


export class MembershipCardApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing membership card */
  async update(body: PlusCardForm): Promise<PlusApiResultPlusCardVO> {
    return this.client.put<PlusApiResultPlusCardVO>(backendApiPath(`/card`), body);
  }

/** Create a new membership card */
  async create(body: PlusCardForm): Promise<PlusApiResultPlusCardVO> {
    return this.client.post<PlusApiResultPlusCardVO>(backendApiPath(`/card`), body);
  }

/** Get membership cards by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCardVO> {
    return this.client.post<PlusApiResultPagePlusCardVO>(backendApiPath(`/card/list`), body, params);
  }

/** Get all membership cards */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCardVO> {
    return this.client.post<PlusApiResultListPlusCardVO>(backendApiPath(`/card/list/all`), body);
  }

/** Get a membership card by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCardVO> {
    return this.client.get<PlusApiResultPlusCardVO>(backendApiPath(`/card/${id}`));
  }

/** Delete a membership card */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/card/${id}`));
  }
}

export function createMembershipCardApi(client: HttpClient): MembershipCardApi {
  return new MembershipCardApi(client);
}
