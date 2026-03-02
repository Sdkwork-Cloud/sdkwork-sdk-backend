import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusDiskVO, PlusApiResultPagePlusDiskVO, PlusApiResultPlusDiskVO, PlusDiskForm, QueryListForm } from '../types';


export class FileDiskApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing file disk */
  async update(body: PlusDiskForm): Promise<PlusApiResultPlusDiskVO> {
    return this.client.put<PlusApiResultPlusDiskVO>(backendApiPath(`/disk`), body);
  }

/** Create a new file disk */
  async create(body: PlusDiskForm): Promise<PlusApiResultPlusDiskVO> {
    return this.client.post<PlusApiResultPlusDiskVO>(backendApiPath(`/disk`), body);
  }

/** Get file disks by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDiskVO> {
    return this.client.post<PlusApiResultPagePlusDiskVO>(backendApiPath(`/disk/list`), body, params);
  }

/** Get all file disks */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusDiskVO> {
    return this.client.post<PlusApiResultListPlusDiskVO>(backendApiPath(`/disk/list/all`), body);
  }

/** Get a file disk by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusDiskVO> {
    return this.client.get<PlusApiResultPlusDiskVO>(backendApiPath(`/disk/${id}`));
  }

/** Delete a file disk */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/disk/${id}`));
  }
}

export function createFileDiskApi(client: HttpClient): FileDiskApi {
  return new FileDiskApi(client);
}
