import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ContentVoteForm, PlusApiResultBoolean, PlusApiResultContentVoteVO, PlusApiResultListContentVoteVO, PlusApiResultPageContentVoteVO, QueryListForm } from '../types';


export class ContentVoteApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing content vote */
  async update(body: ContentVoteForm): Promise<PlusApiResultContentVoteVO> {
    return this.client.put<PlusApiResultContentVoteVO>(backendApiPath(`/vote`), body);
  }

/** Create a new content vote */
  async create(body: ContentVoteForm): Promise<PlusApiResultContentVoteVO> {
    return this.client.post<PlusApiResultContentVoteVO>(backendApiPath(`/vote`), body);
  }

/** Get content votes by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPageContentVoteVO> {
    return this.client.post<PlusApiResultPageContentVoteVO>(backendApiPath(`/vote/list`), body, params);
  }

/** Get all content votes */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListContentVoteVO> {
    return this.client.post<PlusApiResultListContentVoteVO>(backendApiPath(`/vote/list/all`), body);
  }

/** Get a content vote by ID */
  async getById(id: string | number): Promise<PlusApiResultContentVoteVO> {
    return this.client.get<PlusApiResultContentVoteVO>(backendApiPath(`/vote/${id}`));
  }

/** Delete a content vote */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vote/${id}`));
  }
}

export function createContentVoteApi(client: HttpClient): ContentVoteApi {
  return new ContentVoteApi(client);
}
