import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusFilePartVO, PlusApiResultPagePlusFilePartVO, PlusApiResultPlusFilePartVO, PlusFilePartForm, QueryListForm } from '../types';


export class FilePartApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing file part */
  async update(body: PlusFilePartForm): Promise<PlusApiResultPlusFilePartVO> {
    return this.client.put<PlusApiResultPlusFilePartVO>(backendApiPath(`/file/part`), body);
  }

/** Create a new file part */
  async create(body: PlusFilePartForm): Promise<PlusApiResultPlusFilePartVO> {
    return this.client.post<PlusApiResultPlusFilePartVO>(backendApiPath(`/file/part`), body);
  }

/** Get file parts by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFilePartVO> {
    return this.client.post<PlusApiResultPagePlusFilePartVO>(backendApiPath(`/file/part/list`), body, params);
  }

/** Get all file parts */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusFilePartVO> {
    return this.client.post<PlusApiResultListPlusFilePartVO>(backendApiPath(`/file/part/list/all`), body);
  }

/** Get a file part by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusFilePartVO> {
    return this.client.get<PlusApiResultPlusFilePartVO>(backendApiPath(`/file/part/${id}`));
  }

/** Delete a file part */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/file/part/${id}`));
  }
}

export function createFilePartApi(client: HttpClient): FilePartApi {
  return new FilePartApi(client);
}
