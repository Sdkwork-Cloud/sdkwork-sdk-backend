import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusOrganizationMemberVO, PlusApiResultPagePlusOrganizationMemberVO, PlusApiResultPlusOrganizationMemberVO, PlusOrganizationMemberForm, QueryListForm } from '../types';


export class OrganizationMemberApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update organization member */
  async update(body: PlusOrganizationMemberForm): Promise<PlusApiResultPlusOrganizationMemberVO> {
    return this.client.put<PlusApiResultPlusOrganizationMemberVO>(backendApiPath(`/organization-member`), body);
  }

/** Create organization member */
  async create(body: PlusOrganizationMemberForm): Promise<PlusApiResultPlusOrganizationMemberVO> {
    return this.client.post<PlusApiResultPlusOrganizationMemberVO>(backendApiPath(`/organization-member`), body);
  }

/** Get organization members by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrganizationMemberVO> {
    return this.client.post<PlusApiResultPagePlusOrganizationMemberVO>(backendApiPath(`/organization-member/list`), body, params);
  }

/** Get all organization members */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusOrganizationMemberVO> {
    return this.client.post<PlusApiResultListPlusOrganizationMemberVO>(backendApiPath(`/organization-member/list/all`), body);
  }

/** Get organization member by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusOrganizationMemberVO> {
    return this.client.get<PlusApiResultPlusOrganizationMemberVO>(backendApiPath(`/organization-member/${id}`));
  }

/** Delete organization member */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/organization-member/${id}`));
  }
}

export function createOrganizationMemberApi(client: HttpClient): OrganizationMemberApi {
  return new OrganizationMemberApi(client);
}
