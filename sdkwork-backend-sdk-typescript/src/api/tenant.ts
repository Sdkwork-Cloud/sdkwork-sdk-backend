import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { GetAccessTokenForm, GetCloudAccessTokenForm, PlusApiResultBoolean, PlusApiResultListPlusTenantVO, PlusApiResultListTokenResult, PlusApiResultPagePlusTenantAuditLogVO, PlusApiResultPagePlusTenantVO, PlusApiResultPlusTenantVO, PlusTenantForm, PlusTenantQueryListForm } from '../types';


export class TenantApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing tenant */
  async update(body: PlusTenantForm): Promise<PlusApiResultPlusTenantVO> {
    return this.client.put<PlusApiResultPlusTenantVO>(backendApiPath(`/tenant`), body);
  }

/** Create a new tenant */
  async create(body: PlusTenantForm): Promise<PlusApiResultPlusTenantVO> {
    return this.client.post<PlusApiResultPlusTenantVO>(backendApiPath(`/tenant`), body);
  }

/** Uninstall app from tenant */
  async uninstall(id: string | number, body: PlusTenantForm): Promise<PlusApiResultPlusTenantVO> {
    return this.client.post<PlusApiResultPlusTenantVO>(backendApiPath(`/tenant/${id}/uninstall`), body);
  }

/** Install app for tenant */
  async install(id: string | number, body: PlusTenantForm): Promise<PlusApiResultPlusTenantVO> {
    return this.client.post<PlusApiResultPlusTenantVO>(backendApiPath(`/tenant/${id}/install`), body);
  }

/** Get tenant audit logs by page */
  async listAuditLogs(id: string | number, params?: QueryParams): Promise<PlusApiResultPagePlusTenantAuditLogVO> {
    return this.client.post<PlusApiResultPagePlusTenantAuditLogVO>(backendApiPath(`/tenant/${id}/audit_logs/list`), undefined, params);
  }

/** Get tenants by page */
  async listByPage(body?: PlusTenantQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusTenantVO> {
    return this.client.post<PlusApiResultPagePlusTenantVO>(backendApiPath(`/tenant/list`), body, params);
  }

/** Get all tenants */
  async listAllEntities(body?: PlusTenantQueryListForm): Promise<PlusApiResultListPlusTenantVO> {
    return this.client.post<PlusApiResultListPlusTenantVO>(backendApiPath(`/tenant/list/all`), body);
  }

/** Get access tokens */
  async getAccessTokens(body: GetAccessTokenForm): Promise<PlusApiResultListTokenResult> {
    return this.client.post<PlusApiResultListTokenResult>(backendApiPath(`/tenant/get_access_tokens`), body);
  }

/** Get default cloud tenant access tokens */
  async getCloudAccessTokens(body: GetCloudAccessTokenForm): Promise<PlusApiResultListTokenResult> {
    return this.client.post<PlusApiResultListTokenResult>(backendApiPath(`/tenant/cloud/get_access_tokens`), body);
  }

/** Get a tenant by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusTenantVO> {
    return this.client.get<PlusApiResultPlusTenantVO>(backendApiPath(`/tenant/${id}`));
  }

/** Delete a tenant */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/tenant/${id}`));
  }
}

export function createTenantApi(client: HttpClient): TenantApi {
  return new TenantApi(client);
}
