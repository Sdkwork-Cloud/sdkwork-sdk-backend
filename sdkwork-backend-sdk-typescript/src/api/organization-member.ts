import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListLong, PlusApiResultListPlusDepartmentVO, PlusApiResultListPlusOrganizationMemberVO, PlusApiResultListPlusPositionVO, PlusApiResultPagePlusOrganizationMemberVO, PlusApiResultPlusOrganizationMemberVO, PlusOrganizationMemberForm, QueryListForm } from '../types';


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

/** Transfer member position */
  async transferPosition(id: string | number, params?: QueryParams): Promise<PlusApiResultBoolean> {
    return this.client.put<PlusApiResultBoolean>(backendApiPath(`/organization-member/${id}/positions/transfer`), undefined, params);
  }

/** Set member primary department */
  async setPrimaryDepartment(id: string | number, departmentId: string | number): Promise<PlusApiResultBoolean> {
    return this.client.put<PlusApiResultBoolean>(backendApiPath(`/organization-member/${id}/departments/${departmentId}/primary`));
  }

/** Transfer member department */
  async transferDepartment(id: string | number, params?: QueryParams): Promise<PlusApiResultBoolean> {
    return this.client.put<PlusApiResultBoolean>(backendApiPath(`/organization-member/${id}/departments/transfer`), undefined, params);
  }

/** Deactivate member */
  async deactivateMember(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.put<PlusApiResultBoolean>(backendApiPath(`/organization-member/${id}/deactivate`));
  }

/** Activate member */
  async activateMember(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.put<PlusApiResultBoolean>(backendApiPath(`/organization-member/${id}/activate`));
  }

/** Bind member to department */
  async addToDepartment(id: string | number, departmentId: string | number, params?: QueryParams): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/organization-member/${id}/departments/${departmentId}`), undefined, params);
  }

/** Unbind member from department */
  async removeFromDepartment(id: string | number, departmentId: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/organization-member/${id}/departments/${departmentId}`));
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

/** Get member role ids */
  async getMemberRoleIds(id: string | number): Promise<PlusApiResultListLong> {
    return this.client.get<PlusApiResultListLong>(backendApiPath(`/organization-member/${id}/roles`));
  }

/** Get member positions */
  async getMemberPositions(id: string | number): Promise<PlusApiResultListPlusPositionVO> {
    return this.client.get<PlusApiResultListPlusPositionVO>(backendApiPath(`/organization-member/${id}/positions`));
  }

/** Get member departments */
  async getMemberDepartments(id: string | number): Promise<PlusApiResultListPlusDepartmentVO> {
    return this.client.get<PlusApiResultListPlusDepartmentVO>(backendApiPath(`/organization-member/${id}/departments`));
  }
}

export function createOrganizationMemberApi(client: HttpClient): OrganizationMemberApi {
  return new OrganizationMemberApi(client);
}
