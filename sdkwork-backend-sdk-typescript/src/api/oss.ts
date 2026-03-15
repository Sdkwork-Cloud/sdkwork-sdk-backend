import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultFileItemVO, PlusApiResultFileListVO, PlusApiResultGetUrlResult, PlusApiResultListPlusOssBucketVO, PlusApiResultPagePlusOssBucketVO, PlusApiResultPlusFileVO, PlusApiResultPlusOssBucketVO, PlusApiResultPlusTempSessionVO, PlusGetPresignedUrlForm, PlusGetTempSessionForm, PlusOssBucketForm, PlusUploadForm, QueryListForm } from '../types';


export class OssApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing OSS bucket */
  async update(body: PlusOssBucketForm): Promise<PlusApiResultPlusOssBucketVO> {
    return this.client.put<PlusApiResultPlusOssBucketVO>(backendApiPath(`/oss/bucket`), body);
  }

/** Create a new OSS bucket */
  async create(body: PlusOssBucketForm): Promise<PlusApiResultPlusOssBucketVO> {
    return this.client.post<PlusApiResultPlusOssBucketVO>(backendApiPath(`/oss/bucket`), body);
  }

/** List files */
  async listFiles(params?: QueryParams): Promise<PlusApiResultFileListVO> {
    return this.client.get<PlusApiResultFileListVO>(backendApiPath(`/oss/files`), params);
  }

/** Upload file */
  async uploadFile(body?: FormData, params?: QueryParams): Promise<PlusApiResultFileItemVO> {
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

/** Get OSS buckets by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusOssBucketVO> {
    return this.client.post<PlusApiResultPagePlusOssBucketVO>(backendApiPath(`/oss/bucket/list`), body, params);
  }

/** Get all OSS buckets */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusOssBucketVO> {
    return this.client.post<PlusApiResultListPlusOssBucketVO>(backendApiPath(`/oss/bucket/list/all`), body);
  }

/** Get file */
  async getFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.get<PlusApiResultFileItemVO>(backendApiPath(`/oss/files/${fileId}`));
  }

/** Delete file */
  async deleteFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.delete<PlusApiResultFileItemVO>(backendApiPath(`/oss/files/${fileId}`));
  }

/** Get file content */
  async getFileContent(fileId: string | number): Promise<string> {
    return this.client.get<string>(backendApiPath(`/oss/files/${fileId}/content`));
  }

/** Get an OSS bucket by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusOssBucketVO> {
    return this.client.get<PlusApiResultPlusOssBucketVO>(backendApiPath(`/oss/bucket/${id}`));
  }

/** Delete an OSS bucket */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/oss/bucket/${id}`));
  }
}

export function createOssApi(client: HttpClient): OssApi {
  return new OssApi(client);
}
