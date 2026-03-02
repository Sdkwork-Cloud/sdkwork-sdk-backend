import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusFeedbackVO, PlusApiResultPagePlusFeedbackVO, PlusApiResultPlusFeedbackVO, PlusFeedbackForm, QueryListForm } from '../types';


export class FeedbackApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update feedback */
  async update(body: PlusFeedbackForm): Promise<PlusApiResultPlusFeedbackVO> {
    return this.client.put<PlusApiResultPlusFeedbackVO>(backendApiPath(`/feedback`), body);
  }

/** Create new feedback */
  async create(body: PlusFeedbackForm): Promise<PlusApiResultPlusFeedbackVO> {
    return this.client.post<PlusApiResultPlusFeedbackVO>(backendApiPath(`/feedback`), body);
  }

/** Get feedback by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFeedbackVO> {
    return this.client.post<PlusApiResultPagePlusFeedbackVO>(backendApiPath(`/feedback/list`), body, params);
  }

/** Get all feedback records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusFeedbackVO> {
    return this.client.post<PlusApiResultListPlusFeedbackVO>(backendApiPath(`/feedback/list/all`), body);
  }

/** Get feedback by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusFeedbackVO> {
    return this.client.get<PlusApiResultPlusFeedbackVO>(backendApiPath(`/feedback/${id}`));
  }

/** Delete feedback */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/feedback/${id}`));
  }
}

export function createFeedbackApi(client: HttpClient): FeedbackApi {
  return new FeedbackApi(client);
}
