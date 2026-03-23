import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusChannelAccountVO, PlusApiResultListPlusChannelProxyVO, PlusApiResultListPlusChannelResourceVO, PlusApiResultListPlusChannelVO, PlusApiResultPagePlusChannelAccountVO, PlusApiResultPagePlusChannelProxyVO, PlusApiResultPagePlusChannelResourceVO, PlusApiResultPagePlusChannelVO, PlusApiResultPlusChannelAccountVO, PlusApiResultPlusChannelProxyVO, PlusApiResultPlusChannelResourceVO, PlusApiResultPlusChannelVO, PlusApiResultWechatConnectivityCheckResponse, PlusApiResultWechatDomainVerifyResponse, PlusChannelAccountForm, PlusChannelAccountQueryForm, PlusChannelForm, PlusChannelProxyForm, PlusChannelResourceForm, QueryListForm, WechatConnectivityCheckRequest, WechatDomainVerifyRequest } from '../types';


export class ChannelApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update channel */
  async update(body: PlusChannelForm): Promise<PlusApiResultPlusChannelVO> {
    return this.client.put<PlusApiResultPlusChannelVO>(backendApiPath(`/channel`), body);
  }

/** Create channel */
  async create(body: PlusChannelForm): Promise<PlusApiResultPlusChannelVO> {
    return this.client.post<PlusApiResultPlusChannelVO>(backendApiPath(`/channel`), body);
  }

/** Update an existing channel resource */
  async updateResource(body: PlusChannelResourceForm): Promise<PlusApiResultPlusChannelResourceVO> {
    return this.client.put<PlusApiResultPlusChannelResourceVO>(backendApiPath(`/channel/resource`), body);
  }

/** Create a new channel resource */
  async createResource(body: PlusChannelResourceForm): Promise<PlusApiResultPlusChannelResourceVO> {
    return this.client.post<PlusApiResultPlusChannelResourceVO>(backendApiPath(`/channel/resource`), body);
  }

/** Update channel proxy */
  async updateProxy(body: PlusChannelProxyForm): Promise<PlusApiResultPlusChannelProxyVO> {
    return this.client.put<PlusApiResultPlusChannelProxyVO>(backendApiPath(`/channel/proxy`), body);
  }

/** Create channel proxy */
  async createProxy(body: PlusChannelProxyForm): Promise<PlusApiResultPlusChannelProxyVO> {
    return this.client.post<PlusApiResultPlusChannelProxyVO>(backendApiPath(`/channel/proxy`), body);
  }

/** Update channel account */
  async updateAccount(body: PlusChannelAccountForm): Promise<PlusApiResultPlusChannelAccountVO> {
    return this.client.put<PlusApiResultPlusChannelAccountVO>(backendApiPath(`/channel/account`), body);
  }

/** Create channel account */
  async createAccount(body: PlusChannelAccountForm): Promise<PlusApiResultPlusChannelAccountVO> {
    return this.client.post<PlusApiResultPlusChannelAccountVO>(backendApiPath(`/channel/account`), body);
  }

/** Get channel resources by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChannelResourceVO> {
    return this.client.post<PlusApiResultPagePlusChannelResourceVO>(backendApiPath(`/channel/resource/list`), body, params);
  }

/** Get all channel resources */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusChannelResourceVO> {
    return this.client.post<PlusApiResultListPlusChannelResourceVO>(backendApiPath(`/channel/resource/list/all`), body);
  }

/** List channel proxies by page */
  async createListByPageProxy(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChannelProxyVO> {
    return this.client.post<PlusApiResultPagePlusChannelProxyVO>(backendApiPath(`/channel/proxy/list`), body, params);
  }

/** List all channel proxies */
  async createListAllEntitiesProxy(body?: QueryListForm): Promise<PlusApiResultListPlusChannelProxyVO> {
    return this.client.post<PlusApiResultListPlusChannelProxyVO>(backendApiPath(`/channel/proxy/list/all`), body);
  }

/** List channels by page */
  async createListByPageChannel(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChannelVO> {
    return this.client.post<PlusApiResultPagePlusChannelVO>(backendApiPath(`/channel/list`), body, params);
  }

/** List all channels */
  async createListAllEntitiesChannel(body?: QueryListForm): Promise<PlusApiResultListPlusChannelVO> {
    return this.client.post<PlusApiResultListPlusChannelVO>(backendApiPath(`/channel/list/all`), body);
  }

/** Verify WeChat official account domains */
  async verifyWechatDomains(id: string | number, body?: WechatDomainVerifyRequest): Promise<PlusApiResultWechatDomainVerifyResponse> {
    return this.client.post<PlusApiResultWechatDomainVerifyResponse>(backendApiPath(`/channel/account/${id}/wechat/domain/verify`), body);
  }

/** Check WeChat official account connectivity */
  async checkWechatConnectivity(id: string | number, body?: WechatConnectivityCheckRequest): Promise<PlusApiResultWechatConnectivityCheckResponse> {
    return this.client.post<PlusApiResultWechatConnectivityCheckResponse>(backendApiPath(`/channel/account/${id}/wechat/connectivity/check`), body);
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
  async createListByPageAccount(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusChannelAccountVO> {
    return this.client.post<PlusApiResultPagePlusChannelAccountVO>(backendApiPath(`/channel/account/list`), body, params);
  }

/** Get all channel accounts */
  async createListAllEntitiesAccount(body?: QueryListForm): Promise<PlusApiResultListPlusChannelAccountVO> {
    return this.client.post<PlusApiResultListPlusChannelAccountVO>(backendApiPath(`/channel/account/list/all`), body);
  }

/** Get channel by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusChannelVO> {
    return this.client.get<PlusApiResultPlusChannelVO>(backendApiPath(`/channel/${id}`));
  }

/** Delete channel */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/channel/${id}`));
  }

/** Get a channel resource by ID */
  async getByIdResource(id: string | number): Promise<PlusApiResultPlusChannelResourceVO> {
    return this.client.get<PlusApiResultPlusChannelResourceVO>(backendApiPath(`/channel/resource/${id}`));
  }

/** Delete a channel resource */
  async deleteResource(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/channel/resource/${id}`));
  }

/** Get channel proxy by ID */
  async getByIdProxy(id: string | number): Promise<PlusApiResultPlusChannelProxyVO> {
    return this.client.get<PlusApiResultPlusChannelProxyVO>(backendApiPath(`/channel/proxy/${id}`));
  }

/** Delete channel proxy */
  async deleteProxy(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/channel/proxy/${id}`));
  }

/** Get channel account by ID */
  async getByIdAccount(id: string | number): Promise<PlusApiResultPlusChannelAccountVO> {
    return this.client.get<PlusApiResultPlusChannelAccountVO>(backendApiPath(`/channel/account/${id}`));
  }

/** Delete channel account */
  async deleteAccount(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/channel/account/${id}`));
  }
}

export function createChannelApi(client: HttpClient): ChannelApi {
  return new ChannelApi(client);
}
