import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusMemberRelationsVO, PlusApiResultPagePlusMemberRelationsVO, PlusApiResultPlusMemberRelationsVO, PlusMemberRelationsForm, QueryListForm } from '../types';


export class MemberRelationsApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update member relation */
  async update(body: PlusMemberRelationsForm): Promise<PlusApiResultPlusMemberRelationsVO> {
    return this.client.put<PlusApiResultPlusMemberRelationsVO>(backendApiPath(`/organization/member-relations`), body);
  }

/** Create member relation */
  async create(body: PlusMemberRelationsForm): Promise<PlusApiResultPlusMemberRelationsVO> {
    return this.client.post<PlusApiResultPlusMemberRelationsVO>(backendApiPath(`/organization/member-relations`), body);
  }

/** Get member relations by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusMemberRelationsVO> {
    return this.client.post<PlusApiResultPagePlusMemberRelationsVO>(backendApiPath(`/organization/member-relations/list`), body, params);
  }

/** Get all member relations */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusMemberRelationsVO> {
    return this.client.post<PlusApiResultListPlusMemberRelationsVO>(backendApiPath(`/organization/member-relations/list/all`), body);
  }

/** Get member relation by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusMemberRelationsVO> {
    return this.client.get<PlusApiResultPlusMemberRelationsVO>(backendApiPath(`/organization/member-relations/${id}`));
  }

/** Delete member relation */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/organization/member-relations/${id}`));
  }
}

export function createMemberRelationsApi(client: HttpClient): MemberRelationsApi {
  return new MemberRelationsApi(client);
}
