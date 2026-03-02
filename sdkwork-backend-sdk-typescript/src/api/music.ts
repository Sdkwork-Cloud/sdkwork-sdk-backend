import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusMusicVO, PlusApiResultPagePlusMusicVO, PlusApiResultPlusMusicVO, PlusMusicForm, QueryListForm } from '../types';


export class MusicApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update music */
  async update(body: PlusMusicForm): Promise<PlusApiResultPlusMusicVO> {
    return this.client.put<PlusApiResultPlusMusicVO>(backendApiPath(`/music`), body);
  }

/** Create new music */
  async create(body: PlusMusicForm): Promise<PlusApiResultPlusMusicVO> {
    return this.client.post<PlusApiResultPlusMusicVO>(backendApiPath(`/music`), body);
  }

/** Get music records by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusMusicVO> {
    return this.client.post<PlusApiResultPagePlusMusicVO>(backendApiPath(`/music/list`), body, params);
  }

/** Get all music records */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusMusicVO> {
    return this.client.post<PlusApiResultListPlusMusicVO>(backendApiPath(`/music/list/all`), body);
  }

/** Get music by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusMusicVO> {
    return this.client.get<PlusApiResultPlusMusicVO>(backendApiPath(`/music/${id}`));
  }

/** Delete music */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/music/${id}`));
  }
}

export function createMusicApi(client: HttpClient): MusicApi {
  return new MusicApi(client);
}
