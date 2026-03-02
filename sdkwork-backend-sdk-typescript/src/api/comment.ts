import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusCommentsVO, PlusApiResultPagePlusCommentsVO, PlusApiResultPlusCommentsVO, PlusCommentsForm, PlusCommentsReplyForm, QueryListForm } from '../types';


export class CommentApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing comment */
  async update(body: PlusCommentsForm): Promise<PlusApiResultPlusCommentsVO> {
    return this.client.put<PlusApiResultPlusCommentsVO>(backendApiPath(`/comments`), body);
  }

/** Create a new comment */
  async create(body: PlusCommentsForm): Promise<PlusApiResultPlusCommentsVO> {
    return this.client.post<PlusApiResultPlusCommentsVO>(backendApiPath(`/comments`), body);
  }

/** Unlike a comment */
  async unlike(id: string | number): Promise<PlusApiResultPlusCommentsVO> {
    return this.client.post<PlusApiResultPlusCommentsVO>(backendApiPath(`/comments/${id}/unlike`));
  }

/** Reply to a comment */
  async reply(id: string | number, body: PlusCommentsReplyForm): Promise<PlusApiResultPlusCommentsVO> {
    return this.client.post<PlusApiResultPlusCommentsVO>(backendApiPath(`/comments/${id}/reply`), body);
  }

/** Like a comment */
  async like(id: string | number): Promise<PlusApiResultPlusCommentsVO> {
    return this.client.post<PlusApiResultPlusCommentsVO>(backendApiPath(`/comments/${id}/like`));
  }

/** Get comments by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusCommentsVO> {
    return this.client.post<PlusApiResultPagePlusCommentsVO>(backendApiPath(`/comments/list`), body, params);
  }

/** Get all comments */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusCommentsVO> {
    return this.client.post<PlusApiResultListPlusCommentsVO>(backendApiPath(`/comments/list/all`), body);
  }

/** Get a comment by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusCommentsVO> {
    return this.client.get<PlusApiResultPlusCommentsVO>(backendApiPath(`/comments/${id}`));
  }

/** Delete a comment */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/comments/${id}`));
  }
}

export function createCommentApi(client: HttpClient): CommentApi {
  return new CommentApi(client);
}
