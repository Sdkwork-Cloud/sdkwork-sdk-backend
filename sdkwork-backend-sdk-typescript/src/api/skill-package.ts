import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAgentSkillPackageForm, PlusAgentSkillPackageQueryListForm, PlusApiResultBoolean, PlusApiResultListPlusAgentSkillPackageVO, PlusApiResultPagePlusAgentSkillPackageVO, PlusApiResultPlusAgentSkillPackageVO } from '../types';


export class SkillPackageApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get skill package detail */
  async getById(id: string | number): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.get<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/${id}`));
  }

/** Update skill package */
  async update(id: string | number, body: PlusAgentSkillPackageForm): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.put<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/${id}`), body);
  }

/** Delete skill package */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/skill/package/${id}`));
  }

/** Create skill package */
  async create(body: PlusAgentSkillPackageForm): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package`), body);
  }

/** Enable skill package */
  async enable(id: string | number): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/${id}/enable`));
  }

/** Disable skill package */
  async disable(id: string | number): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/${id}/disable`));
  }

/** Query skill package list by page */
  async listByPage(body?: PlusAgentSkillPackageQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultPagePlusAgentSkillPackageVO>(backendApiPath(`/skill/package/list`), body, params);
  }

/** Query all skill packages */
  async listAll(body?: PlusAgentSkillPackageQueryListForm): Promise<PlusApiResultListPlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultListPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/list/all`), body);
  }
}

export function createSkillPackageApi(client: HttpClient): SkillPackageApi {
  return new SkillPackageApi(client);
}
