import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusFileContentVO, PlusApiResultListPlusFilePartVO, PlusApiResultListPlusFileVO, PlusApiResultPagePlusFileContentVO, PlusApiResultPagePlusFilePartVO, PlusApiResultPagePlusFileVO, PlusApiResultPlusFileContentVO, PlusApiResultPlusFilePartVO, PlusApiResultPlusFileVO, PlusApiResultSetPlusTreeNodePlusFileVO, PlusFileContentForm, PlusFileForm, PlusFilePartForm, QueryListForm } from '../types';


export class FileApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update existing file metadata */
  async update(body: PlusFileForm): Promise<PlusApiResultPlusFileVO> {
    return this.client.put<PlusApiResultPlusFileVO>(backendApiPath(`/file`), body);
  }

/** Create a new file metadata */
  async create(body: PlusFileForm): Promise<PlusApiResultPlusFileVO> {
    return this.client.post<PlusApiResultPlusFileVO>(backendApiPath(`/file`), body);
  }

/** Update an existing file part */
  async updatePart(body: PlusFilePartForm): Promise<PlusApiResultPlusFilePartVO> {
    return this.client.put<PlusApiResultPlusFilePartVO>(backendApiPath(`/file/part`), body);
  }

/** Create a new file part */
  async createPart(body: PlusFilePartForm): Promise<PlusApiResultPlusFilePartVO> {
    return this.client.post<PlusApiResultPlusFilePartVO>(backendApiPath(`/file/part`), body);
  }

/** Update file content */
  async updateContent(body: PlusFileContentForm): Promise<PlusApiResultPlusFileContentVO> {
    return this.client.put<PlusApiResultPlusFileContentVO>(backendApiPath(`/file/content`), body);
  }

/** Create file content */
  async createContent(body: PlusFileContentForm): Promise<PlusApiResultPlusFileContentVO> {
    return this.client.post<PlusApiResultPlusFileContentVO>(backendApiPath(`/file/content`), body);
  }

/** Get file parts by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFilePartVO> {
    return this.client.post<PlusApiResultPagePlusFilePartVO>(backendApiPath(`/file/part/list`), body, params);
  }

/** Get all file parts */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusFilePartVO> {
    return this.client.post<PlusApiResultListPlusFilePartVO>(backendApiPath(`/file/part/list/all`), body);
  }

/** Get file metadata by page */
  async createListByPageFile(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFileVO> {
    return this.client.post<PlusApiResultPagePlusFileVO>(backendApiPath(`/file/list`), body, params);
  }

/** Get all file metadata */
  async createListAllEntitiesFile(body?: QueryListForm): Promise<PlusApiResultListPlusFileVO> {
    return this.client.post<PlusApiResultListPlusFileVO>(backendApiPath(`/file/list/all`), body);
  }

/** Get Tree */
  async getTree(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultSetPlusTreeNodePlusFileVO> {
    return this.client.post<PlusApiResultSetPlusTreeNodePlusFileVO>(backendApiPath(`/file/get_tree`), body, params);
  }

/** Get file contents by page */
  async createListByPageContent(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFileContentVO> {
    return this.client.post<PlusApiResultPagePlusFileContentVO>(backendApiPath(`/file/content/list`), body, params);
  }

/** Get all file contents */
  async createListAllEntitiesContent(body?: QueryListForm): Promise<PlusApiResultListPlusFileContentVO> {
    return this.client.post<PlusApiResultListPlusFileContentVO>(backendApiPath(`/file/content/list/all`), body);
  }

/** Get file metadata by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusFileVO> {
    return this.client.get<PlusApiResultPlusFileVO>(backendApiPath(`/file/${id}`));
  }

/** Delete file metadata */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/file/${id}`));
  }

/** Get a file part by ID */
  async getByIdPart(id: string | number): Promise<PlusApiResultPlusFilePartVO> {
    return this.client.get<PlusApiResultPlusFilePartVO>(backendApiPath(`/file/part/${id}`));
  }

/** Delete a file part */
  async deletePart(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/file/part/${id}`));
  }

/** Get file content by ID */
  async getByIdContent(id: string | number): Promise<PlusApiResultPlusFileContentVO> {
    return this.client.get<PlusApiResultPlusFileContentVO>(backendApiPath(`/file/content/${id}`));
  }

/** Delete file content */
  async deleteContent(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/file/content/${id}`));
  }
}

export function createFileApi(client: HttpClient): FileApi {
  return new FileApi(client);
}
