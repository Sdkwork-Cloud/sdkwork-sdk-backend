import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusAgentSkillBatchReviewForm, PlusAgentSkillFeatureForm, PlusAgentSkillForm, PlusAgentSkillPackageForm, PlusAgentSkillPackageQueryListForm, PlusAgentSkillQueryListForm, PlusAgentSkillReviewForm, PlusApiResultBoolean, PlusApiResultListPlusAgentSkillPackageVO, PlusApiResultListPlusAgentSkillVO, PlusApiResultListPlusSkillBundleVO, PlusApiResultListPlusSkillVO, PlusApiResultPagePlusAgentSkillPackageVO, PlusApiResultPagePlusAgentSkillVO, PlusApiResultPagePlusSkillBundleVO, PlusApiResultPagePlusSkillVO, PlusApiResultPlusAgentSkillPackageVO, PlusApiResultPlusAgentSkillVO, PlusApiResultPlusSkillBundleVO, PlusApiResultPlusSkillVO, PlusSkillBatchReviewForm, PlusSkillBundleForm, PlusSkillBundleQueryListForm, PlusSkillFeatureForm, PlusSkillForm, PlusSkillQueryListForm, PlusSkillReviewForm } from '../types';


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

/** Get one skill detail */
  async getByIdItem(id: string | number): Promise<PlusApiResultPlusSkillVO> {
    return this.client.get<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}`));
  }

/** Update skill */
  async updateItem(id: string | number, body: PlusSkillForm): Promise<PlusApiResultPlusSkillVO> {
    return this.client.put<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}`), body);
  }

/** Get skill package detail */
  async getByIdBundle(id: string | number): Promise<PlusApiResultPlusSkillBundleVO> {
    return this.client.get<PlusApiResultPlusSkillBundleVO>(backendApiPath(`/skill/bundle/${id}`));
  }

/** Update skill package */
  async updateBundle(id: string | number, body: PlusSkillBundleForm): Promise<PlusApiResultPlusSkillBundleVO> {
    return this.client.put<PlusApiResultPlusSkillBundleVO>(backendApiPath(`/skill/bundle/${id}`), body);
  }

/** Delete skill package */
  async deleteBundle(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/skill/bundle/${id}`));
  }

/** Create skill */
  async create(body: PlusAgentSkillForm): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill`), body);
  }

/** Submit skill for review */
  async createSubmitForReview(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/review/submit`));
  }

/** Reject skill review */
  async createRejectReview(id: string | number, body?: PlusAgentSkillReviewForm): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/review/reject`), body);
  }

/** Approve skill review */
  async createApproveReview(id: string | number, body?: PlusAgentSkillReviewForm): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/review/approve`), body);
  }

/** Publish skill */
  async createPublish(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/publish`));
  }

/** Offline skill */
  async createOffline(id: string | number): Promise<PlusApiResultPlusAgentSkillVO> {
    return this.client.post<PlusApiResultPlusAgentSkillVO>(backendApiPath(`/skill/${id}/offline`));
  }

/** Update skill featured status */
  async createUpdateFeature(id: string | number, body: PlusAgentSkillFeatureForm): Promise<PlusApiResultPlusAgentSkillVO> {
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
  async createListPendingReviewByPage(body?: PlusAgentSkillQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusAgentSkillVO> {
    return this.client.post<PlusApiResultPagePlusAgentSkillVO>(backendApiPath(`/skill/review/pending/list`), body, params);
  }

/** Batch reject skill review */
  async createBatchRejectReview(body: PlusAgentSkillBatchReviewForm): Promise<PlusApiResultListPlusAgentSkillVO> {
    return this.client.post<PlusApiResultListPlusAgentSkillVO>(backendApiPath(`/skill/review/batch/reject`), body);
  }

/** Batch approve skill review */
  async createBatchApproveReview(body: PlusAgentSkillBatchReviewForm): Promise<PlusApiResultListPlusAgentSkillVO> {
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

/** Create skill */
  async createItem(body: PlusSkillForm): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item`), body);
  }

/** Submit skill for review */
  async createSubmitForReviewItem(id: string | number): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}/review/submit`));
  }

/** Reject skill review */
  async createRejectReviewItem(id: string | number, body?: PlusSkillReviewForm): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}/review/reject`), body);
  }

/** Approve skill review */
  async createApproveReviewItem(id: string | number, body?: PlusSkillReviewForm): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}/review/approve`), body);
  }

/** Publish skill */
  async createPublishItem(id: string | number): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}/publish`));
  }

/** Offline skill */
  async createOfflineItem(id: string | number): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}/offline`));
  }

/** Update skill featured status */
  async createUpdateFeatureItem(id: string | number, body: PlusSkillFeatureForm): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}/feature`), body);
  }

/** Enable skill */
  async createEnableItem(id: string | number): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}/enable`));
  }

/** Disable skill */
  async createDisableItem(id: string | number): Promise<PlusApiResultPlusSkillVO> {
    return this.client.post<PlusApiResultPlusSkillVO>(backendApiPath(`/skill/item/${id}/disable`));
  }

/** List pending review skills by page */
  async createListPendingReviewByPageItem(body?: PlusSkillQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusSkillVO> {
    return this.client.post<PlusApiResultPagePlusSkillVO>(backendApiPath(`/skill/item/review/pending/list`), body, params);
  }

/** Batch reject skill review */
  async createBatchRejectReviewItem(body: PlusSkillBatchReviewForm): Promise<PlusApiResultListPlusSkillVO> {
    return this.client.post<PlusApiResultListPlusSkillVO>(backendApiPath(`/skill/item/review/batch/reject`), body);
  }

/** Batch approve skill review */
  async createBatchApproveReviewItem(body: PlusSkillBatchReviewForm): Promise<PlusApiResultListPlusSkillVO> {
    return this.client.post<PlusApiResultListPlusSkillVO>(backendApiPath(`/skill/item/review/batch/approve`), body);
  }

/** Query skill list by page */
  async createListByPageItem(body?: PlusSkillQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusSkillVO> {
    return this.client.post<PlusApiResultPagePlusSkillVO>(backendApiPath(`/skill/item/list`), body, params);
  }

/** Query all skills */
  async createListAllItem(body?: PlusSkillQueryListForm): Promise<PlusApiResultListPlusSkillVO> {
    return this.client.post<PlusApiResultListPlusSkillVO>(backendApiPath(`/skill/item/list/all`), body);
  }

/** Create skill package */
  async createBundle(body: PlusSkillBundleForm): Promise<PlusApiResultPlusSkillBundleVO> {
    return this.client.post<PlusApiResultPlusSkillBundleVO>(backendApiPath(`/skill/bundle`), body);
  }

/** Enable skill package */
  async createEnableBundle(id: string | number): Promise<PlusApiResultPlusSkillBundleVO> {
    return this.client.post<PlusApiResultPlusSkillBundleVO>(backendApiPath(`/skill/bundle/${id}/enable`));
  }

/** Disable skill package */
  async createDisableBundle(id: string | number): Promise<PlusApiResultPlusSkillBundleVO> {
    return this.client.post<PlusApiResultPlusSkillBundleVO>(backendApiPath(`/skill/bundle/${id}/disable`));
  }

/** Query skill package list by page */
  async createListByPageBundle(body?: PlusSkillBundleQueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusSkillBundleVO> {
    return this.client.post<PlusApiResultPagePlusSkillBundleVO>(backendApiPath(`/skill/bundle/list`), body, params);
  }

/** Query all skill packages */
  async createListAllBundle(body?: PlusSkillBundleQueryListForm): Promise<PlusApiResultListPlusSkillBundleVO> {
    return this.client.post<PlusApiResultListPlusSkillBundleVO>(backendApiPath(`/skill/bundle/list/all`), body);
  }
}

export function createSkillApi(client: HttpClient): SkillApi {
  return new SkillApi(client);
}
