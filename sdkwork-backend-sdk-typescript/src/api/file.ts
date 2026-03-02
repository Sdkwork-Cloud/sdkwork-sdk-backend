import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultFileItemVO, PlusApiResultFileListVO, PlusApiResultGetUrlResult, PlusApiResultListPlusFileVO, PlusApiResultPagePlusFileVO, PlusApiResultPlusFileVO, PlusApiResultPlusTempSessionVO, PlusApiResultSetPlusTreeNodePlusFileVO, PlusFileForm, PlusGetPresignedUrlForm, PlusGetTempSessionForm, PlusUploadForm, QueryListForm } from '../types';


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

/** 获取文件列表 */
  async listFiles(params?: QueryParams): Promise<PlusApiResultFileListVO> {
    return this.client.get<PlusApiResultFileListVO>(backendApiPath(`/oss/files`), params);
  }

/** 上传文件 */
  async upload(body?: FormData, params?: QueryParams): Promise<PlusApiResultFileItemVO> {
    return this.client.post<PlusApiResultFileItemVO>(backendApiPath(`/oss/files`), body, params);
  }

/** Get upload temporary session */
  async getTempSession(body: PlusGetTempSessionForm): Promise<PlusApiResultPlusTempSessionVO> {
    return this.client.post<PlusApiResultPlusTempSessionVO>(backendApiPath(`/oss/files/temp_session`), body);
  }

/** Generate presigned URL */
  async getPresignedUrl(body: PlusGetPresignedUrlForm): Promise<PlusApiResultGetUrlResult> {
    return this.client.post<PlusApiResultGetUrlResult>(backendApiPath(`/oss/files/get_presigned_url`), body);
  }

/** Upload file */
  async createFiles(body: PlusUploadForm): Promise<PlusApiResultPlusFileVO> {
    return this.client.post<PlusApiResultPlusFileVO>(backendApiPath(`/oss/files/create`), body);
  }

/** Get file metadata by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusFileVO> {
    return this.client.post<PlusApiResultPagePlusFileVO>(backendApiPath(`/file/list`), body, params);
  }

/** Get all file metadata */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusFileVO> {
    return this.client.post<PlusApiResultListPlusFileVO>(backendApiPath(`/file/list/all`), body);
  }

/** Get Tree */
  async getTree(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultSetPlusTreeNodePlusFileVO> {
    return this.client.post<PlusApiResultSetPlusTreeNodePlusFileVO>(backendApiPath(`/file/get_tree`), body, params);
  }

/** 获取单个文件信息 */
  async getFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.get<PlusApiResultFileItemVO>(backendApiPath(`/oss/files/${fileId}`));
  }

/** 删除文件 */
  async deleteFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.delete<PlusApiResultFileItemVO>(backendApiPath(`/oss/files/${fileId}`));
  }

/** 获取文件内容 */
  async getFileContent(fileId: string | number): Promise<string> {
    return this.client.get<string>(backendApiPath(`/oss/files/${fileId}/content`));
  }

/** Get file metadata by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusFileVO> {
    return this.client.get<PlusApiResultPlusFileVO>(backendApiPath(`/file/${id}`));
  }

/** Delete file metadata */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/file/${id}`));
  }
}

export function createFileApi(client: HttpClient): FileApi {
  return new FileApi(client);
}
