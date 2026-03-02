import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusMemberLevelVO, PlusApiResultPagePlusMemberLevelVO, PlusApiResultPlusMemberLevelVO, PlusMemberLevelForm, QueryListForm } from '../types';


export class MemberLevelApi {
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

/** Get member levels by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusMemberLevelVO> {
    return this.client.post<PlusApiResultPagePlusMemberLevelVO>(backendApiPath(`/member/level/list`), body, params);
  }

/** Get all member levels */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusMemberLevelVO> {
    return this.client.post<PlusApiResultListPlusMemberLevelVO>(backendApiPath(`/member/level/list/all`), body);
  }

/** Get a member level by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusMemberLevelVO> {
    return this.client.get<PlusApiResultPlusMemberLevelVO>(backendApiPath(`/member/level/${id}`));
  }

/** Delete a member level */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/member/level/${id}`));
  }
}

export function createMemberLevelApi(client: HttpClient): MemberLevelApi {
  return new MemberLevelApi(client);
}
