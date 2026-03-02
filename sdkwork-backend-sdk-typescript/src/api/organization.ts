import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GetAccessTokenForm, PlusApiResultBoolean, PlusApiResultListPlusOrganizationVO, PlusApiResultListTokenResult, PlusApiResultPagePlusOrganizationVO, PlusApiResultPlusOrganizationVO, PlusOrganizationForm, QueryListForm } from '../types';


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

/** Uninstall app from organization */
  async uninstall(id: string | number, body: PlusOrganizationForm): Promise<PlusApiResultPlusOrganizationVO> {
    return this.client.post<PlusApiResultPlusOrganizationVO>(backendApiPath(`/organization/${id}/uninstall`), body);
  }

/** Install app for organization */
  async install(id: string | number, body: PlusOrganizationForm): Promise<PlusApiResultPlusOrganizationVO> {
    return this.client.post<PlusApiResultPlusOrganizationVO>(backendApiPath(`/organization/${id}/install`), body);
  }

/** Get organizations by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOrganizationVO> {
    return this.client.post<PlusApiResultPagePlusOrganizationVO>(backendApiPath(`/organization/list`), body, params);
  }

/** Get all organizations */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusOrganizationVO> {
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
}

export function createOrganizationApi(client: HttpClient): OrganizationApi {
  return new OrganizationApi(client);
}
