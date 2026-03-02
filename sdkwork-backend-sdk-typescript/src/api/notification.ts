import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusNotificationVO, PlusApiResultPagePlusNotificationVO, PlusApiResultPlusNotificationVO, PlusNotificationForm, QueryListForm } from '../types';


export class NotificationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing notification */
  async update(body: PlusNotificationForm): Promise<PlusApiResultPlusNotificationVO> {
    return this.client.put<PlusApiResultPlusNotificationVO>(backendApiPath(`/notification`), body);
  }

/** Create a new notification */
  async create(body: PlusNotificationForm): Promise<PlusApiResultPlusNotificationVO> {
    return this.client.post<PlusApiResultPlusNotificationVO>(backendApiPath(`/notification`), body);
  }

/** Get notifications by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusNotificationVO> {
    return this.client.post<PlusApiResultPagePlusNotificationVO>(backendApiPath(`/notification/list`), body, params);
  }

/** Get all notifications */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusNotificationVO> {
    return this.client.post<PlusApiResultListPlusNotificationVO>(backendApiPath(`/notification/list/all`), body);
  }

/** Get a notification by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusNotificationVO> {
    return this.client.get<PlusApiResultPlusNotificationVO>(backendApiPath(`/notification/${id}`));
  }

/** Delete a notification */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/notification/${id}`));
  }
}

export function createNotificationApi(client: HttpClient): NotificationApi {
  return new NotificationApi(client);
}
