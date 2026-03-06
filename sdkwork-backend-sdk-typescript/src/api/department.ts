import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusDepartmentVO, PlusApiResultListPlusOrganizationMemberVO, PlusApiResultPagePlusDepartmentVO, PlusApiResultPlusDepartmentVO, PlusDepartmentForm, QueryListForm } from '../types';


export class DepartmentApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing department */
  async update(body: PlusDepartmentForm): Promise<PlusApiResultPlusDepartmentVO> {
    return this.client.put<PlusApiResultPlusDepartmentVO>(backendApiPath(`/department`), body);
  }

/** Create a new department */
  async create(body: PlusDepartmentForm): Promise<PlusApiResultPlusDepartmentVO> {
    return this.client.post<PlusApiResultPlusDepartmentVO>(backendApiPath(`/department`), body);
  }

/** Move department */
  async move(id: string | number, params?: QueryParams): Promise<PlusApiResultPlusDepartmentVO> {
    return this.client.put<PlusApiResultPlusDepartmentVO>(backendApiPath(`/department/${id}/move`), undefined, params);
  }

/** Set primary department */
  async setPrimary(id: string | number, memberId: string | number): Promise<PlusApiResultBoolean> {
    return this.client.put<PlusApiResultBoolean>(backendApiPath(`/department/${id}/members/${memberId}/primary`));
  }

/** Add member to department */
  async addMemberTo(id: string | number, memberId: string | number, params?: QueryParams): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/department/${id}/members/${memberId}`), undefined, params);
  }

/** Remove member from department */
  async removeMemberFrom(id: string | number, memberId: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/department/${id}/members/${memberId}`));
  }

/** Get departments by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDepartmentVO> {
    return this.client.post<PlusApiResultPagePlusDepartmentVO>(backendApiPath(`/department/list`), body, params);
  }

/** Get all departments */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusDepartmentVO> {
    return this.client.post<PlusApiResultListPlusDepartmentVO>(backendApiPath(`/department/list/all`), body);
  }

/** Get a department by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusDepartmentVO> {
    return this.client.get<PlusApiResultPlusDepartmentVO>(backendApiPath(`/department/${id}`));
  }

/** Delete a department */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/department/${id}`));
  }

/** Get department members */
  async getDepartmentMembers(id: string | number, params?: QueryParams): Promise<PlusApiResultListPlusOrganizationMemberVO> {
    return this.client.get<PlusApiResultListPlusOrganizationMemberVO>(backendApiPath(`/department/${id}/members`), params);
  }
}

export function createDepartmentApi(client: HttpClient): DepartmentApi {
  return new DepartmentApi(client);
}
