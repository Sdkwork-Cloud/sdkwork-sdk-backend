import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultFileItemVO, PlusApiResultFileListVO } from '../types';


export class KnowledgeBaseFileApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** List files */
  async listFiles(params?: QueryParams): Promise<PlusApiResultFileListVO> {
    return this.client.get<PlusApiResultFileListVO>(backendApiPath(`/knowledge_base/files`), params);
  }

/** Upload file */
  async uploadFile(body?: FormData, params?: QueryParams): Promise<PlusApiResultFileItemVO> {
    return this.client.post<PlusApiResultFileItemVO>(backendApiPath(`/knowledge_base/files`), body, params);
  }

/** List files */
  async getListFiles(params?: QueryParams): Promise<PlusApiResultFileListVO> {
    return this.client.get<PlusApiResultFileListVO>(backendApiPath(`/disk/files`), params);
  }

/** Upload file */
  async createUploadFile(body?: FormData, params?: QueryParams): Promise<PlusApiResultFileItemVO> {
    return this.client.post<PlusApiResultFileItemVO>(backendApiPath(`/disk/files`), body, params);
  }

/** Get file */
  async getFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.get<PlusApiResultFileItemVO>(backendApiPath(`/knowledge_base/files/${fileId}`));
  }

/** Delete file */
  async deleteFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.delete<PlusApiResultFileItemVO>(backendApiPath(`/knowledge_base/files/${fileId}`));
  }

/** Get file content */
  async getFileContent(fileId: string | number): Promise<string> {
    return this.client.get<string>(backendApiPath(`/knowledge_base/files/${fileId}/content`));
  }

/** Get file */
  async getFileDisk(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.get<PlusApiResultFileItemVO>(backendApiPath(`/disk/files/${fileId}`));
  }

/** Delete file */
  async deleteFileDisk(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.delete<PlusApiResultFileItemVO>(backendApiPath(`/disk/files/${fileId}`));
  }

/** Get file content */
  async getFileContentDisk(fileId: string | number): Promise<string> {
    return this.client.get<string>(backendApiPath(`/disk/files/${fileId}/content`));
  }
}

export function createKnowledgeBaseFileApi(client: HttpClient): KnowledgeBaseFileApi {
  return new KnowledgeBaseFileApi(client);
}
