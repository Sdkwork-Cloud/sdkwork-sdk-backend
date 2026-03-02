import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusMemberCardVO, PlusApiResultPagePlusMemberCardVO, PlusApiResultPlusMemberCardVO, PlusMemberCardForm, QueryListForm } from '../types';


export class MemberCardApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing member card */
  async update(body: PlusMemberCardForm): Promise<PlusApiResultPlusMemberCardVO> {
    return this.client.put<PlusApiResultPlusMemberCardVO>(backendApiPath(`/member/card`), body);
  }

/** Create a new member card */
  async create(body: PlusMemberCardForm): Promise<PlusApiResultPlusMemberCardVO> {
    return this.client.post<PlusApiResultPlusMemberCardVO>(backendApiPath(`/member/card`), body);
  }

/** Get member cards by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusMemberCardVO> {
    return this.client.post<PlusApiResultPagePlusMemberCardVO>(backendApiPath(`/member/card/list`), body, params);
  }

/** Get all member cards */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusMemberCardVO> {
    return this.client.post<PlusApiResultListPlusMemberCardVO>(backendApiPath(`/member/card/list/all`), body);
  }

/** Get a member card by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusMemberCardVO> {
    return this.client.get<PlusApiResultPlusMemberCardVO>(backendApiPath(`/member/card/${id}`));
  }

/** Delete a member card */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/member/card/${id}`));
  }
}

export function createMemberCardApi(client: HttpClient): MemberCardApi {
  return new MemberCardApi(client);
}
