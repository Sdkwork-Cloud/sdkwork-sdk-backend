import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusDiskMemberVO, PlusApiResultPagePlusDiskMemberVO, PlusApiResultPlusDiskMemberVO, PlusDiskMemberForm, QueryListForm } from '../types';


export class DiskMemberApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing disk member */
  async update(body: PlusDiskMemberForm): Promise<PlusApiResultPlusDiskMemberVO> {
    return this.client.put<PlusApiResultPlusDiskMemberVO>(backendApiPath(`/disk/member`), body);
  }

/** Create a new disk member */
  async create(body: PlusDiskMemberForm): Promise<PlusApiResultPlusDiskMemberVO> {
    return this.client.post<PlusApiResultPlusDiskMemberVO>(backendApiPath(`/disk/member`), body);
  }

/** Get disk members by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDiskMemberVO> {
    return this.client.post<PlusApiResultPagePlusDiskMemberVO>(backendApiPath(`/disk/member/list`), body, params);
  }

/** Get all disk members */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusDiskMemberVO> {
    return this.client.post<PlusApiResultListPlusDiskMemberVO>(backendApiPath(`/disk/member/list/all`), body);
  }

/** Get a disk member by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusDiskMemberVO> {
    return this.client.get<PlusApiResultPlusDiskMemberVO>(backendApiPath(`/disk/member/${id}`));
  }

/** Delete a disk member */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/disk/member/${id}`));
  }
}

export function createDiskMemberApi(client: HttpClient): DiskMemberApi {
  return new DiskMemberApi(client);
}
