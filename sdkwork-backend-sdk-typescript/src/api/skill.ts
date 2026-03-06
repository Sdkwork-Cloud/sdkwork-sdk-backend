import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAgentSkillBatchReviewForm, PlusAgentSkillFeatureForm, PlusAgentSkillForm, PlusAgentSkillQueryListForm, PlusAgentSkillReviewForm, PlusApiResultListPlusAgentSkillVO, PlusApiResultPagePlusAgentSkillVO, PlusApiResultPlusAgentSkillVO } from '../types';


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
  async enable(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/enable`));
  }

/** Disable skill */
  async disable(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
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

/** Query skill list by page */
  async listByPage(body?: PlusAgentSkillQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAgentSkillVO> {
    return this.client.post<PlusApiResultPagePlusAgentSkillVO>(backendApiPath(`/skill/list`), body, params);
  }

/** Query all skills */
  async listAll(body?: PlusAgentSkillQueryListForm): Promise<PlusApiResultListPlusAgentSkillVO> {
    return this.client.post<PlusApiResultListPlusAgentSkillVO>(backendApiPath(`/skill/list/all`), body);
  }
}

export function createSkillApi(client: HttpClient): SkillApi {
  return new SkillApi(client);
}
