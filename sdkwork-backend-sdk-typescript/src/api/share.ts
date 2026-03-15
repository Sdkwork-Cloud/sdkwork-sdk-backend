import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusShareVisitRecordVO, PlusApiResultListPlusShareVO, PlusApiResultPagePlusShareVisitRecordVO, PlusApiResultPagePlusShareVO, PlusApiResultPlusShareVisitRecordVO, PlusApiResultPlusShareVO, PlusShareForm, PlusShareVisitRecordForm, QueryListForm } from '../types';


export class ShareApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 更新分享 */
  async update(body: PlusShareForm): Promise<PlusApiResultPlusShareVO> {
    return this.client.put<PlusApiResultPlusShareVO>(backendApiPath(`/share`), body);
  }

/** 创建分享 */
  async create(body: PlusShareForm): Promise<PlusApiResultPlusShareVO> {
    return this.client.post<PlusApiResultPlusShareVO>(backendApiPath(`/share`), body);
  }

/** Update visit record */
  async updateVisitRecord(body: PlusShareVisitRecordForm): Promise<PlusApiResultPlusShareVisitRecordVO> {
    return this.client.put<PlusApiResultPlusShareVisitRecordVO>(backendApiPath(`/share/visit_record`), body);
  }

/** Create visit record */
  async createVisitRecord(body: PlusShareVisitRecordForm): Promise<PlusApiResultPlusShareVisitRecordVO> {
    return this.client.post<PlusApiResultPlusShareVisitRecordVO>(backendApiPath(`/share/visit_record`), body);
  }

/** Get visit records by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShareVisitRecordVO> {
    return this.client.post<PlusApiResultPagePlusShareVisitRecordVO>(backendApiPath(`/share/visit_record/list`), body, params);
  }

/** Get all visit records */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusShareVisitRecordVO> {
    return this.client.post<PlusApiResultListPlusShareVisitRecordVO>(backendApiPath(`/share/visit_record/list/all`), body);
  }

/** 分页获取分享 */
  async createListByPageShare(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusShareVO> {
    return this.client.post<PlusApiResultPagePlusShareVO>(backendApiPath(`/share/list`), body, params);
  }

/** 获取所有分享 */
  async createListAllEntitiesShare(body?: QueryListForm): Promise<PlusApiResultListPlusShareVO> {
    return this.client.post<PlusApiResultListPlusShareVO>(backendApiPath(`/share/list/all`), body);
  }

/** 获取分享详情 */
  async getById(id: string | number): Promise<PlusApiResultPlusShareVO> {
    return this.client.get<PlusApiResultPlusShareVO>(backendApiPath(`/share/${id}`));
  }

/** 删除分享 */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/share/${id}`));
  }

/** Get visit record by ID */
  async getByIdVisitRecord(id: string | number): Promise<PlusApiResultPlusShareVisitRecordVO> {
    return this.client.get<PlusApiResultPlusShareVisitRecordVO>(backendApiPath(`/share/visit_record/${id}`));
  }

/** Delete visit record */
  async deleteVisitRecord(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/share/visit_record/${id}`));
  }
}

export function createShareApi(client: HttpClient): ShareApi {
  return new ShareApi(client);
}
