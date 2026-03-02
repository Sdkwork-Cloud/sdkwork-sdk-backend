import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultFileItemVO, PlusApiResultFileListVO } from '../types';


export class KnowledgeBaseFileApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取文件列表 */
  async listFiles(params?: QueryParams): Promise<PlusApiResultFileListVO> {
    return this.client.get<PlusApiResultFileListVO>(backendApiPath(`/knowledge_base/files`), params);
  }

/** 上传文件 */
  async uploadFile(body?: FormData, params?: QueryParams): Promise<PlusApiResultFileItemVO> {
    return this.client.post<PlusApiResultFileItemVO>(backendApiPath(`/knowledge_base/files`), body, params);
  }

/** 获取文件列表 */
  async getListFiles(params?: QueryParams): Promise<PlusApiResultFileListVO> {
    return this.client.get<PlusApiResultFileListVO>(backendApiPath(`/disk/files`), params);
  }

/** 上传文件 */
  async createUploadFile(body?: FormData, params?: QueryParams): Promise<PlusApiResultFileItemVO> {
    return this.client.post<PlusApiResultFileItemVO>(backendApiPath(`/disk/files`), body, params);
  }

/** 获取单个文件信息 */
  async getFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.get<PlusApiResultFileItemVO>(backendApiPath(`/knowledge_base/files/${fileId}`));
  }

/** 删除文件 */
  async deleteFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.delete<PlusApiResultFileItemVO>(backendApiPath(`/knowledge_base/files/${fileId}`));
  }

/** 获取文件内容 */
  async getFileContent(fileId: string | number): Promise<string> {
    return this.client.get<string>(backendApiPath(`/knowledge_base/files/${fileId}/content`));
  }

/** 获取单个文件信息 */
  async getFileDisk(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.get<PlusApiResultFileItemVO>(backendApiPath(`/disk/files/${fileId}`));
  }

/** 删除文件 */
  async deleteFileDisk(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.delete<PlusApiResultFileItemVO>(backendApiPath(`/disk/files/${fileId}`));
  }

/** 获取文件内容 */
  async getFileContentDisk(fileId: string | number): Promise<string> {
    return this.client.get<string>(backendApiPath(`/disk/files/${fileId}/content`));
  }
}

export function createKnowledgeBaseFileApi(client: HttpClient): KnowledgeBaseFileApi {
  return new KnowledgeBaseFileApi(client);
}
