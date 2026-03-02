import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVideoVO, PlusApiResultPagePlusVideoVO, PlusApiResultPlusVideoVO, PlusVideoForm, QueryListForm } from '../types';


export class VideoApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing video */
  async update(body: PlusVideoForm): Promise<PlusApiResultPlusVideoVO> {
    return this.client.put<PlusApiResultPlusVideoVO>(backendApiPath(`/video`), body);
  }

/** Create a new video */
  async create(body: PlusVideoForm): Promise<PlusApiResultPlusVideoVO> {
    return this.client.post<PlusApiResultPlusVideoVO>(backendApiPath(`/video`), body);
  }

/** Get videos by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVideoVO> {
    return this.client.post<PlusApiResultPagePlusVideoVO>(backendApiPath(`/video/list`), body, params);
  }

/** Get all videos */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVideoVO> {
    return this.client.post<PlusApiResultListPlusVideoVO>(backendApiPath(`/video/list/all`), body);
  }

/** Get a video by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVideoVO> {
    return this.client.get<PlusApiResultPlusVideoVO>(backendApiPath(`/video/${id}`));
  }

/** Delete a video */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/video/${id}`));
  }
}

export function createVideoApi(client: HttpClient): VideoApi {
  return new VideoApi(client);
}
