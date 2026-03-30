import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultFileItemVO, PlusApiResultFileListVO, PlusApiResultListPlusDiskMemberVO, PlusApiResultListPlusDiskVO, PlusApiResultPagePlusDiskMemberVO, PlusApiResultPagePlusDiskVO, PlusApiResultPlusDiskMemberVO, PlusApiResultPlusDiskVO, PlusDiskForm, PlusDiskMemberForm, QueryListForm } from '../types';


export class DiskApi {
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

/** Update an existing disk member */
  async updateMember(body: PlusDiskMemberForm): Promise<PlusApiResultPlusDiskMemberVO> {
    return this.client.put<PlusApiResultPlusDiskMemberVO>(backendApiPath(`/disk/member`), body);
  }

/** Create a new disk member */
  async createMember(body: PlusDiskMemberForm): Promise<PlusApiResultPlusDiskMemberVO> {
    return this.client.post<PlusApiResultPlusDiskMemberVO>(backendApiPath(`/disk/member`), body);
  }

/** Get disk members by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDiskMemberVO> {
    return this.client.post<PlusApiResultPagePlusDiskMemberVO>(backendApiPath(`/disk/member/list`), body, params);
  }

/** Get all disk members */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusDiskMemberVO> {
    return this.client.post<PlusApiResultListPlusDiskMemberVO>(backendApiPath(`/disk/member/list/all`), body);
  }

/** Get file disks by page */
  async createListByPageDisk(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusDiskVO> {
    return this.client.post<PlusApiResultPagePlusDiskVO>(backendApiPath(`/disk/list`), body, params);
  }

/** Get all file disks */
  async createListAllEntitiesDisk(body?: QueryListForm): Promise<PlusApiResultListPlusDiskVO> {
    return this.client.post<PlusApiResultListPlusDiskVO>(backendApiPath(`/disk/list/all`), body);
  }

/** List files */
  async getListFiles(params?: QueryParams): Promise<PlusApiResultFileListVO> {
    return this.client.get<PlusApiResultFileListVO>(backendApiPath(`/disk/files`), params);
  }

/** Upload file */
  async createUploadFile(body?: FormData, params?: QueryParams): Promise<PlusApiResultFileItemVO> {
    return this.client.post<PlusApiResultFileItemVO>(backendApiPath(`/disk/files`), body, params);
  }

/** Get a file disk by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusDiskVO> {
    return this.client.get<PlusApiResultPlusDiskVO>(backendApiPath(`/disk/${id}`));
  }

/** Delete a file disk */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/disk/${id}`));
  }

/** Get a disk member by ID */
  async getByIdMember(id: string | number): Promise<PlusApiResultPlusDiskMemberVO> {
    return this.client.get<PlusApiResultPlusDiskMemberVO>(backendApiPath(`/disk/member/${id}`));
  }

/** Delete a disk member */
  async deleteMember(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/disk/member/${id}`));
  }

/** Get file */
  async getFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.get<PlusApiResultFileItemVO>(backendApiPath(`/disk/files/${fileId}`));
  }

/** Delete file */
  async deleteFile(fileId: string | number): Promise<PlusApiResultFileItemVO> {
    return this.client.delete<PlusApiResultFileItemVO>(backendApiPath(`/disk/files/${fileId}`));
  }

/** Get file content */
  async getFileContent(fileId: string | number): Promise<string> {
    return this.client.get<string>(backendApiPath(`/disk/files/${fileId}/content`));
  }
}

export function createDiskApi(client: HttpClient): DiskApi {
  return new DiskApi(client);
}
