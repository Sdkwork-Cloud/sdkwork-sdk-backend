import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GetAccessTokenForm, PlusApiResultBoolean, PlusApiResultListPlusMemberRelationsVO, PlusApiResultListPlusOrganizationVO, PlusApiResultListPlusPositionVO, PlusApiResultListTokenResult, PlusApiResultPagePlusMemberRelationsVO, PlusApiResultPagePlusOrganizationVO, PlusApiResultPagePlusPositionVO, PlusApiResultPlusMemberRelationsVO, PlusApiResultPlusOrganizationVO, PlusApiResultPlusPositionVO, PlusMemberRelationsForm, PlusOrganizationForm, PlusPositionForm, QueryListForm } from '../types';


export class OrganizationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing organization */
  async update(body: PlusOrganizationForm): Promise<PlusApiResultPlusOrganizationVO> {
    return this.client.put<PlusApiResultPlusOrganizationVO>(backendApiPath(`/organization`), body);
  }

/** Create a new organization */
  async create(body: PlusOrganizationForm): Promise<PlusApiResultPlusOrganizationVO> {
    return this.client.post<PlusApiResultPlusOrganizationVO>(backendApiPath(`/organization`), body);
  }

/** Update an existing position */
  async updatePosition(body: PlusPositionForm): Promise<PlusApiResultPlusPositionVO> {
    return this.client.put<PlusApiResultPlusPositionVO>(backendApiPath(`/organization/position`), body);
  }

/** Create a new position */
  async createPosition(body: PlusPositionForm): Promise<PlusApiResultPlusPositionVO> {
    return this.client.post<PlusApiResultPlusPositionVO>(backendApiPath(`/organization/position`), body);
  }

/** Update member relation */
  async updateMemberRelations(body: PlusMemberRelationsForm): Promise<PlusApiResultPlusMemberRelationsVO> {
    return this.client.put<PlusApiResultPlusMemberRelationsVO>(backendApiPath(`/organization/member-relations`), body);
  }

/** Create member relation */
  async createMemberRelations(body: PlusMemberRelationsForm): Promise<PlusApiResultPlusMemberRelationsVO> {
    return this.client.post<PlusApiResultPlusMemberRelationsVO>(backendApiPath(`/organization/member-relations`), body);
  }

/** Uninstall app from organization */
  async uninstall(id: string | number, body: PlusOrganizationForm): Promise<PlusApiResultPlusOrganizationVO> {
    return this.client.post<PlusApiResultPlusOrganizationVO>(backendApiPath(`/organization/${id}/uninstall`), body);
  }

/** Install app for organization */
  async install(id: string | number, body: PlusOrganizationForm): Promise<PlusApiResultPlusOrganizationVO> {
    return this.client.post<PlusApiResultPlusOrganizationVO>(backendApiPath(`/organization/${id}/install`), body);
  }

/** Get positions by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusPositionVO> {
    return this.client.post<PlusApiResultPagePlusPositionVO>(backendApiPath(`/organization/position/list`), body, params);
  }

/** Get all positions */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusPositionVO> {
    return this.client.post<PlusApiResultListPlusPositionVO>(backendApiPath(`/organization/position/list/all`), body);
  }

/** Get member relations by page */
  async createListByPageMemberRelations(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusMemberRelationsVO> {
    return this.client.post<PlusApiResultPagePlusMemberRelationsVO>(backendApiPath(`/organization/member-relations/list`), body, params);
  }

/** Get all member relations */
  async createListAllEntitiesMemberRelations(body?: QueryListForm): Promise<PlusApiResultListPlusMemberRelationsVO> {
    return this.client.post<PlusApiResultListPlusMemberRelationsVO>(backendApiPath(`/organization/member-relations/list/all`), body);
  }

/** Get organizations by page */
  async createListByPageOrganization(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrganizationVO> {
    return this.client.post<PlusApiResultPagePlusOrganizationVO>(backendApiPath(`/organization/list`), body, params);
  }

/** Get all organizations */
  async createListAllEntitiesOrganization(body?: QueryListForm): Promise<PlusApiResultListPlusOrganizationVO> {
    return this.client.post<PlusApiResultListPlusOrganizationVO>(backendApiPath(`/organization/list/all`), body);
  }

/** Get access tokens */
  async getAccessTokens(body: GetAccessTokenForm): Promise<PlusApiResultListTokenResult> {
    return this.client.post<PlusApiResultListTokenResult>(backendApiPath(`/organization/get_access_tokens`), body);
  }

/** Get an organization by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusOrganizationVO> {
    return this.client.get<PlusApiResultPlusOrganizationVO>(backendApiPath(`/organization/${id}`));
  }

/** Delete an organization */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/organization/${id}`));
  }

/** Get child organizations */
  async getChildren(id: string | number): Promise<PlusApiResultListPlusOrganizationVO> {
    return this.client.get<PlusApiResultListPlusOrganizationVO>(backendApiPath(`/organization/${id}/children`));
  }

/** Get a position by ID */
  async getByIdPosition(id: string | number): Promise<PlusApiResultPlusPositionVO> {
    return this.client.get<PlusApiResultPlusPositionVO>(backendApiPath(`/organization/position/${id}`));
  }

/** Delete a position */
  async deletePosition(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/organization/position/${id}`));
  }

/** Get member relation by ID */
  async getByIdMemberRelations(id: string | number): Promise<PlusApiResultPlusMemberRelationsVO> {
    return this.client.get<PlusApiResultPlusMemberRelationsVO>(backendApiPath(`/organization/member-relations/${id}`));
  }

/** Delete member relation */
  async deleteMemberRelations(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/organization/member-relations/${id}`));
  }
}

export function createOrganizationApi(client: HttpClient): OrganizationApi {
  return new OrganizationApi(client);
}
