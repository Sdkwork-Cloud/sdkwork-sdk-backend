import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusMemberCardVO, PlusApiResultListPlusMemberLevelVO, PlusApiResultPagePlusMemberCardVO, PlusApiResultPagePlusMemberLevelVO, PlusApiResultPlusMemberCardVO, PlusApiResultPlusMemberLevelVO, PlusMemberCardForm, PlusMemberLevelForm, QueryListForm } from '../types';


export class MemberApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing member level */
  async update(body: PlusMemberLevelForm): Promise<PlusApiResultPlusMemberLevelVO> {
    return this.client.put<PlusApiResultPlusMemberLevelVO>(backendApiPath(`/member/level`), body);
  }

/** Create a new member level */
  async create(body: PlusMemberLevelForm): Promise<PlusApiResultPlusMemberLevelVO> {
    return this.client.post<PlusApiResultPlusMemberLevelVO>(backendApiPath(`/member/level`), body);
  }

/** Update an existing member card */
  async updateCard(body: PlusMemberCardForm): Promise<PlusApiResultPlusMemberCardVO> {
    return this.client.put<PlusApiResultPlusMemberCardVO>(backendApiPath(`/member/card`), body);
  }

/** Create a new member card */
  async createCard(body: PlusMemberCardForm): Promise<PlusApiResultPlusMemberCardVO> {
    return this.client.post<PlusApiResultPlusMemberCardVO>(backendApiPath(`/member/card`), body);
  }

/** Get member levels by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusMemberLevelVO> {
    return this.client.post<PlusApiResultPagePlusMemberLevelVO>(backendApiPath(`/member/level/list`), body, params);
  }

/** Get all member levels */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusMemberLevelVO> {
    return this.client.post<PlusApiResultListPlusMemberLevelVO>(backendApiPath(`/member/level/list/all`), body);
  }

/** Get member cards by page */
  async createListByPageCard(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusMemberCardVO> {
    return this.client.post<PlusApiResultPagePlusMemberCardVO>(backendApiPath(`/member/card/list`), body, params);
  }

/** Get all member cards */
  async createListAllEntitiesCard(body?: QueryListForm): Promise<PlusApiResultListPlusMemberCardVO> {
    return this.client.post<PlusApiResultListPlusMemberCardVO>(backendApiPath(`/member/card/list/all`), body);
  }

/** Get a member level by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusMemberLevelVO> {
    return this.client.get<PlusApiResultPlusMemberLevelVO>(backendApiPath(`/member/level/${id}`));
  }

/** Delete a member level */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/member/level/${id}`));
  }

/** Get a member card by ID */
  async getByIdCard(id: string | number): Promise<PlusApiResultPlusMemberCardVO> {
    return this.client.get<PlusApiResultPlusMemberCardVO>(backendApiPath(`/member/card/${id}`));
  }

/** Delete a member card */
  async deleteCard(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/member/card/${id}`));
  }
}

export function createMemberApi(client: HttpClient): MemberApi {
  return new MemberApi(client);
}
