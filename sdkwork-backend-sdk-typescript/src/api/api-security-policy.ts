import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusApiSecurityPolicyVO, PlusApiResultPagePlusApiSecurityPolicyVO, PlusApiResultPlusApiSecurityPolicyVO, PlusApiSecurityPolicyForm, QueryListForm } from '../types';


export class ApiSecurityPolicyApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

async update(body: PlusApiSecurityPolicyForm): Promise<PlusApiResultPlusApiSecurityPolicyVO> {
    return this.client.put<PlusApiResultPlusApiSecurityPolicyVO>(backendApiPath(`/security/policy`), body);
  }

async create(body: PlusApiSecurityPolicyForm): Promise<PlusApiResultPlusApiSecurityPolicyVO> {
    return this.client.post<PlusApiResultPlusApiSecurityPolicyVO>(backendApiPath(`/security/policy`), body);
  }

/** List policies by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusApiSecurityPolicyVO> {
    return this.client.post<PlusApiResultPagePlusApiSecurityPolicyVO>(backendApiPath(`/security/policy/list`), body, params);
  }

/** List all policies */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusApiSecurityPolicyVO> {
    return this.client.post<PlusApiResultListPlusApiSecurityPolicyVO>(backendApiPath(`/security/policy/list/all`), body);
  }

async getById(id: string | number): Promise<PlusApiResultPlusApiSecurityPolicyVO> {
    return this.client.get<PlusApiResultPlusApiSecurityPolicyVO>(backendApiPath(`/security/policy/${id}`));
  }

async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/security/policy/${id}`));
  }
}

export function createApiSecurityPolicyApi(client: HttpClient): ApiSecurityPolicyApi {
  return new ApiSecurityPolicyApi(client);
}
