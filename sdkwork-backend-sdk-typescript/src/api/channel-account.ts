import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusChannelAccountVO, PlusApiResultPagePlusChannelAccountVO, PlusApiResultPlusChannelAccountVO, PlusChannelAccountForm, PlusChannelAccountQueryForm, QueryListForm } from '../types';


export class ChannelAccountApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update channel account */
  async update(body: PlusChannelAccountForm): Promise<PlusApiResultPlusChannelAccountVO> {
    return this.client.put<PlusApiResultPlusChannelAccountVO>(backendApiPath(`/channel/account`), body);
  }

/** Create channel account */
  async create(body: PlusChannelAccountForm): Promise<PlusApiResultPlusChannelAccountVO> {
    return this.client.post<PlusApiResultPlusChannelAccountVO>(backendApiPath(`/channel/account`), body);
  }

/** Get SMS channel accounts */
  async listSms(body?: PlusChannelAccountQueryForm): Promise<PlusApiResultListPlusChannelAccountVO> {
    return this.client.post<PlusApiResultListPlusChannelAccountVO>(backendApiPath(`/channel/account/list_sms`), body);
  }

/** Get payment channel accounts */
  async listPayment(body?: PlusChannelAccountQueryForm): Promise<PlusApiResultListPlusChannelAccountVO> {
    return this.client.post<PlusApiResultListPlusChannelAccountVO>(backendApiPath(`/channel/account/list_payment`), body);
  }

/** Get OSS channel accounts */
  async listOss(body?: PlusChannelAccountQueryForm): Promise<PlusApiResultListPlusChannelAccountVO> {
    return this.client.post<PlusApiResultListPlusChannelAccountVO>(backendApiPath(`/channel/account/list_oss`), body);
  }

/** Get official account channel accounts */
  async listOfficialAccount(body?: PlusChannelAccountQueryForm): Promise<PlusApiResultListPlusChannelAccountVO> {
    return this.client.post<PlusApiResultListPlusChannelAccountVO>(backendApiPath(`/channel/account/list_official_account`), body);
  }

/** Get mini program channel accounts */
  async listMiniProgram(body?: PlusChannelAccountQueryForm): Promise<PlusApiResultListPlusChannelAccountVO> {
    return this.client.post<PlusApiResultListPlusChannelAccountVO>(backendApiPath(`/channel/account/list_mini_program`), body);
  }

/** Get channel accounts by page */
  async listByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChannelAccountVO> {
    return this.client.post<PlusApiResultPagePlusChannelAccountVO>(backendApiPath(`/channel/account/list`), body, params);
  }

/** Get all channel accounts */
  async listAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusChannelAccountVO> {
    return this.client.post<PlusApiResultListPlusChannelAccountVO>(backendApiPath(`/channel/account/list/all`), body);
  }

/** Get channel account by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusChannelAccountVO> {
    return this.client.get<PlusApiResultPlusChannelAccountVO>(backendApiPath(`/channel/account/${id}`));
  }

/** Delete channel account */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/channel/account/${id}`));
  }
}

export function createChannelAccountApi(client: HttpClient): ChannelAccountApi {
  return new ChannelAccountApi(client);
}
