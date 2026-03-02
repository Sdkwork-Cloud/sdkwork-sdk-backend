import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusFileContentVO, PlusApiResultPagePlusFileContentVO, PlusApiResultPlusFileContentVO, PlusFileContentForm, QueryListForm } from '../types';


export class FileContentApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update file content */
  async update(body: PlusFileContentForm): Promise<PlusApiResultPlusFileContentVO> {
    return this.client.put<PlusApiResultPlusFileContentVO>(backendApiPath(`/file/content`), body);
  }

/** Create file content */
  async create(body: PlusFileContentForm): Promise<PlusApiResultPlusFileContentVO> {
    return this.client.post<PlusApiResultPlusFileContentVO>(backendApiPath(`/file/content`), body);
  }

/** Get file contents by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFileContentVO> {
    return this.client.post<PlusApiResultPagePlusFileContentVO>(backendApiPath(`/file/content/list`), body, params);
  }

/** Get all file contents */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusFileContentVO> {
    return this.client.post<PlusApiResultListPlusFileContentVO>(backendApiPath(`/file/content/list/all`), body);
  }

/** Get file content by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusFileContentVO> {
    return this.client.get<PlusApiResultPlusFileContentVO>(backendApiPath(`/file/content/${id}`));
  }

/** Delete file content */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/file/content/${id}`));
  }
}

export function createFileContentApi(client: HttpClient): FileContentApi {
  return new FileContentApi(client);
}
