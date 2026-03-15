import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAgentSkillBatchReviewForm, PlusAgentSkillFeatureForm, PlusAgentSkillForm, PlusAgentSkillPackageForm, PlusAgentSkillPackageQueryListForm, PlusAgentSkillQueryListForm, PlusAgentSkillReviewForm, PlusApiResultBoolean, PlusApiResultListPlusAgentSkillPackageVO, PlusApiResultListPlusAgentSkillVO, PlusApiResultPagePlusAgentSkillPackageVO, PlusApiResultPagePlusAgentSkillVO, PlusApiResultPlusAgentSkillPackageVO, PlusApiResultPlusAgentSkillVO } from '../types';


export class SkillApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Get one skill detail */
  async getById(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.get<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}`));
  }

/** Update skill */
  async update(id: string | number, body: PlusAgentSkillForm): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.put<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}`), body);
  }

/** Get skill package detail */
  async getByIdPackage(id: string | number): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.get<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/${id}`));
  }

/** Update skill package */
  async updatePackage(id: string | number, body: PlusAgentSkillPackageForm): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.put<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/${id}`), body);
  }

/** Delete skill package */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/skill/package/${id}`));
  }

/** Create skill */
  async create(body: PlusAgentSkillForm): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill`), body);
  }

/** Submit skill for review */
  async submitForReview(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/review/submit`));
  }

/** Reject skill review */
  async rejectReview(id: string | number, body?: PlusAgentSkillReviewForm): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/review/reject`), body);
  }

/** Approve skill review */
  async approveReview(id: string | number, body?: PlusAgentSkillReviewForm): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/review/approve`), body);
  }

/** Publish skill */
  async publish(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/publish`));
  }

/** Offline skill */
  async offline(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/offline`));
  }

/** Update skill featured status */
  async updateFeature(id: string | number, body: PlusAgentSkillFeatureForm): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/feature`), body);
  }

/** Enable skill */
  async createEnable(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/enable`));
  }

/** Disable skill */
  async createDisable(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/disable`));
  }

/** List pending review skills by page */
  async listPendingReviewByPage(body?: PlusAgentSkillQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAgentSkillVO> {
    return this.client.post<PlusApiResultPagePlusAgentSkillVO>(backendApiPath(`/skill/review/pending/list`), body, params);
  }

/** Batch reject skill review */
  async batchRejectReview(body: PlusAgentSkillBatchReviewForm): Promise<PlusApiResultListPlusAgentSkillVO> {
    return this.client.post<PlusApiResultListPlusAgentSkillVO>(backendApiPath(`/skill/review/batch/reject`), body);
  }

/** Batch approve skill review */
  async batchApproveReview(body: PlusAgentSkillBatchReviewForm): Promise<PlusApiResultListPlusAgentSkillVO> {
    return this.client.post<PlusApiResultListPlusAgentSkillVO>(backendApiPath(`/skill/review/batch/approve`), body);
  }

/** Create skill package */
  async createPackage(body: PlusAgentSkillPackageForm): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package`), body);
  }

/** Enable skill package */
  async createEnablePackage(id: string | number): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/${id}/enable`));
  }

/** Disable skill package */
  async createDisablePackage(id: string | number): Promise<PlusApiResultPlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/${id}/disable`));
  }

/** Query skill package list by page */
  async createListByPage(body?: PlusAgentSkillPackageQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultPagePlusAgentSkillPackageVO>(backendApiPath(`/skill/package/list`), body, params);
  }

/** Query all skill packages */
  async createListAll(body?: PlusAgentSkillPackageQueryListForm): Promise<PlusApiResultListPlusAgentSkillPackageVO> {
    return this.client.post<PlusApiResultListPlusAgentSkillPackageVO>(backendApiPath(`/skill/package/list/all`), body);
  }

/** Query skill list by page */
  async createListByPageSkill(body?: PlusAgentSkillQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAgentSkillVO> {
    return this.client.post<PlusApiResultPagePlusAgentSkillVO>(backendApiPath(`/skill/list`), body, params);
  }

/** Query all skills */
  async createListAllSkill(body?: PlusAgentSkillQueryListForm): Promise<PlusApiResultListPlusAgentSkillVO> {
    return this.client.post<PlusApiResultListPlusAgentSkillVO>(backendApiPath(`/skill/list/all`), body);
  }
}

export function createSkillApi(client: HttpClient): SkillApi {
  return new SkillApi(client);
}
