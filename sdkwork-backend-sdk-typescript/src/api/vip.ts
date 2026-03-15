import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusVipBenefitUsageVO, PlusApiResultListPlusVipBenefitVO, PlusApiResultListPlusVipLevelBenefitVO, PlusApiResultListPlusVipLevelVO, PlusApiResultListPlusVipPackGroupVO, PlusApiResultListPlusVipPackVO, PlusApiResultListPlusVipPointChangeVO, PlusApiResultListPlusVipRechargePackVO, PlusApiResultListPlusVipRechargeVO, PlusApiResultListPlusVipUserVO, PlusApiResultPagePlusVipBenefitUsageVO, PlusApiResultPagePlusVipBenefitVO, PlusApiResultPagePlusVipLevelBenefitVO, PlusApiResultPagePlusVipLevelVO, PlusApiResultPagePlusVipPackGroupVO, PlusApiResultPagePlusVipPackVO, PlusApiResultPagePlusVipPointChangeVO, PlusApiResultPagePlusVipRechargePackVO, PlusApiResultPagePlusVipRechargeVO, PlusApiResultPagePlusVipUserVO, PlusApiResultPlusVipBenefitUsageVO, PlusApiResultPlusVipBenefitVO, PlusApiResultPlusVipLevelBenefitVO, PlusApiResultPlusVipLevelVO, PlusApiResultPlusVipPackGroupVO, PlusApiResultPlusVipPackVO, PlusApiResultPlusVipPointChangeVO, PlusApiResultPlusVipRechargePackVO, PlusApiResultPlusVipRechargeVO, PlusApiResultPlusVipUserVO, PlusVipBenefitForm, PlusVipBenefitUsageForm, PlusVipLevelBenefitForm, PlusVipLevelForm, PlusVipPackForm, PlusVipPackGroupForm, PlusVipPackGroupQueryForm, PlusVipPointChangeForm, PlusVipRechargeForm, PlusVipRechargePackForm, PlusVipUserForm, QueryListForm } from '../types';


export class VipApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing VIP user */
  async update(body: PlusVipUserForm): Promise<PlusApiResultPlusVipUserVO> {
    return this.client.put<PlusApiResultPlusVipUserVO>(backendApiPath(`/vip/user`), body);
  }

/** Create a new VIP user */
  async create(body: PlusVipUserForm): Promise<PlusApiResultPlusVipUserVO> {
    return this.client.post<PlusApiResultPlusVipUserVO>(backendApiPath(`/vip/user`), body);
  }

/** Update an existing VIP recharge record */
  async updateRecharge(body: PlusVipRechargeForm): Promise<PlusApiResultPlusVipRechargeVO> {
    return this.client.put<PlusApiResultPlusVipRechargeVO>(backendApiPath(`/vip/recharge`), body);
  }

/** Create a new VIP recharge record */
  async createRecharge(body: PlusVipRechargeForm): Promise<PlusApiResultPlusVipRechargeVO> {
    return this.client.post<PlusApiResultPlusVipRechargeVO>(backendApiPath(`/vip/recharge`), body);
  }

/** Update an existing VIP recharge package */
  async updatePack(body: PlusVipRechargePackForm): Promise<PlusApiResultPlusVipRechargePackVO> {
    return this.client.put<PlusApiResultPlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack`), body);
  }

/** Create a new VIP recharge package */
  async createPack(body: PlusVipRechargePackForm): Promise<PlusApiResultPlusVipRechargePackVO> {
    return this.client.post<PlusApiResultPlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack`), body);
  }

/** Update an existing VIP point change record */
  async updateChange(body: PlusVipPointChangeForm): Promise<PlusApiResultPlusVipPointChangeVO> {
    return this.client.put<PlusApiResultPlusVipPointChangeVO>(backendApiPath(`/vip/point/change`), body);
  }

/** Create a new VIP point change record */
  async createChange(body: PlusVipPointChangeForm): Promise<PlusApiResultPlusVipPointChangeVO> {
    return this.client.post<PlusApiResultPlusVipPointChangeVO>(backendApiPath(`/vip/point/change`), body);
  }

/** Update an existing VIP package group */
  async updatePackGroup(body: PlusVipPackGroupForm): Promise<PlusApiResultPlusVipPackGroupVO> {
    return this.client.put<PlusApiResultPlusVipPackGroupVO>(backendApiPath(`/vip/pack_group`), body);
  }

/** Create a new VIP package group */
  async createPackGroup(body: PlusVipPackGroupForm): Promise<PlusApiResultPlusVipPackGroupVO> {
    return this.client.post<PlusApiResultPlusVipPackGroupVO>(backendApiPath(`/vip/pack_group`), body);
  }

/** Update VIP Package */
  async updatePack2(body: PlusVipPackForm): Promise<PlusApiResultPlusVipPackVO> {
    return this.client.put<PlusApiResultPlusVipPackVO>(backendApiPath(`/vip/pack`), body);
  }

/** Create VIP Package */
  async createPack2(body: PlusVipPackForm): Promise<PlusApiResultPlusVipPackVO> {
    return this.client.post<PlusApiResultPlusVipPackVO>(backendApiPath(`/vip/pack`), body);
  }

/** Update an existing VIP level */
  async updateLevel(body: PlusVipLevelForm): Promise<PlusApiResultPlusVipLevelVO> {
    return this.client.put<PlusApiResultPlusVipLevelVO>(backendApiPath(`/vip/level`), body);
  }

/** Create a new VIP level */
  async createLevel(body: PlusVipLevelForm): Promise<PlusApiResultPlusVipLevelVO> {
    return this.client.post<PlusApiResultPlusVipLevelVO>(backendApiPath(`/vip/level`), body);
  }

/** Update an existing VIP level benefit */
  async updateBenefit(body: PlusVipLevelBenefitForm): Promise<PlusApiResultPlusVipLevelBenefitVO> {
    return this.client.put<PlusApiResultPlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit`), body);
  }

/** Create a new VIP level benefit */
  async createBenefit(body: PlusVipLevelBenefitForm): Promise<PlusApiResultPlusVipLevelBenefitVO> {
    return this.client.post<PlusApiResultPlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit`), body);
  }

/** Update an existing VIP benefit */
  async updateBenefit2(body: PlusVipBenefitForm): Promise<PlusApiResultPlusVipBenefitVO> {
    return this.client.put<PlusApiResultPlusVipBenefitVO>(backendApiPath(`/vip/benefit`), body);
  }

/** Create a new VIP benefit */
  async createBenefit2(body: PlusVipBenefitForm): Promise<PlusApiResultPlusVipBenefitVO> {
    return this.client.post<PlusApiResultPlusVipBenefitVO>(backendApiPath(`/vip/benefit`), body);
  }

/** Update an existing VIP benefit usage record */
  async updateUsage(body: PlusVipBenefitUsageForm): Promise<PlusApiResultPlusVipBenefitUsageVO> {
    return this.client.put<PlusApiResultPlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage`), body);
  }

/** Create a new VIP benefit usage record */
  async createUsage(body: PlusVipBenefitUsageForm): Promise<PlusApiResultPlusVipBenefitUsageVO> {
    return this.client.post<PlusApiResultPlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage`), body);
  }

/** Get VIP users by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipUserVO> {
    return this.client.post<PlusApiResultPagePlusVipUserVO>(backendApiPath(`/vip/user/list`), body, params);
  }

/** Get all VIP users */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusVipUserVO> {
    return this.client.post<PlusApiResultListPlusVipUserVO>(backendApiPath(`/vip/user/list/all`), body);
  }

/** Get a VIP user by ID */
  async getCurrentUser(): Promise<PlusApiResultPlusVipUserVO> {
    return this.client.post<PlusApiResultPlusVipUserVO>(backendApiPath(`/vip/user/get_current_user`));
  }

/** Get VIP recharge packages by page */
  async createListByPagePack(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipRechargePackVO> {
    return this.client.post<PlusApiResultPagePlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack/list`), body, params);
  }

/** Get all VIP recharge packages */
  async createListAllEntitiesPack(body?: QueryListForm): Promise<PlusApiResultListPlusVipRechargePackVO> {
    return this.client.post<PlusApiResultListPlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack/list/all`), body);
  }

/** Get VIP recharge records by page */
  async createListByPageRecharge(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipRechargeVO> {
    return this.client.post<PlusApiResultPagePlusVipRechargeVO>(backendApiPath(`/vip/recharge/list`), body, params);
  }

/** Get all VIP recharge records */
  async createListAllEntitiesRecharge(body?: QueryListForm): Promise<PlusApiResultListPlusVipRechargeVO> {
    return this.client.post<PlusApiResultListPlusVipRechargeVO>(backendApiPath(`/vip/recharge/list/all`), body);
  }

/** Get VIP point change records by page */
  async createListByPageChange(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipPointChangeVO> {
    return this.client.post<PlusApiResultPagePlusVipPointChangeVO>(backendApiPath(`/vip/point/change/list`), body, params);
  }

/** Get all VIP point change records */
  async createListAllEntitiesChange(body?: QueryListForm): Promise<PlusApiResultListPlusVipPointChangeVO> {
    return this.client.post<PlusApiResultListPlusVipPointChangeVO>(backendApiPath(`/vip/point/change/list/all`), body);
  }

/** List public */
  async listPublic(body?: PlusVipPackGroupQueryForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipPackGroupVO> {
    return this.client.post<PlusApiResultPagePlusVipPackGroupVO>(backendApiPath(`/vip/pack_group/list_public`), body, params);
  }

/** Get VIP package groups by page */
  async createListByPagePackGroup(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipPackGroupVO> {
    return this.client.post<PlusApiResultPagePlusVipPackGroupVO>(backendApiPath(`/vip/pack_group/list`), body, params);
  }

/** Get all VIP package groups */
  async createListAllEntitiesPackGroup(body?: QueryListForm): Promise<PlusApiResultListPlusVipPackGroupVO> {
    return this.client.post<PlusApiResultListPlusVipPackGroupVO>(backendApiPath(`/vip/pack_group/list/all`), body);
  }

/** Get VIP Packages by Page */
  async createListByPagePack2(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipPackVO> {
    return this.client.post<PlusApiResultPagePlusVipPackVO>(backendApiPath(`/vip/pack/list`), body, params);
  }

/** Get All VIP Packages */
  async createListAllEntitiesPack2(body?: QueryListForm): Promise<PlusApiResultListPlusVipPackVO> {
    return this.client.post<PlusApiResultListPlusVipPackVO>(backendApiPath(`/vip/pack/list/all`), body);
  }

/** Get VIP levels by page */
  async createListByPageLevel(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipLevelVO> {
    return this.client.post<PlusApiResultPagePlusVipLevelVO>(backendApiPath(`/vip/level/list`), body, params);
  }

/** Get all VIP levels */
  async createListAllEntitiesLevel(body?: QueryListForm): Promise<PlusApiResultListPlusVipLevelVO> {
    return this.client.post<PlusApiResultListPlusVipLevelVO>(backendApiPath(`/vip/level/list/all`), body);
  }

/** Get VIP level benefits by page */
  async createListByPageBenefit(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipLevelBenefitVO> {
    return this.client.post<PlusApiResultPagePlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit/list`), body, params);
  }

/** Get all VIP level benefits */
  async createListAllEntitiesBenefit(body?: QueryListForm): Promise<PlusApiResultListPlusVipLevelBenefitVO> {
    return this.client.post<PlusApiResultListPlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit/list/all`), body);
  }

/** Get VIP benefit usage records by page */
  async createListByPageUsage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipBenefitUsageVO> {
    return this.client.post<PlusApiResultPagePlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage/list`), body, params);
  }

/** Get all VIP benefit usage records */
  async createListAllEntitiesUsage(body?: QueryListForm): Promise<PlusApiResultListPlusVipBenefitUsageVO> {
    return this.client.post<PlusApiResultListPlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage/list/all`), body);
  }

/** Get VIP benefits by page */
  async createListByPageBenefit2(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusVipBenefitVO> {
    return this.client.post<PlusApiResultPagePlusVipBenefitVO>(backendApiPath(`/vip/benefit/list`), body, params);
  }

/** Get all VIP benefits */
  async createListAllEntitiesBenefit2(body?: QueryListForm): Promise<PlusApiResultListPlusVipBenefitVO> {
    return this.client.post<PlusApiResultListPlusVipBenefitVO>(backendApiPath(`/vip/benefit/list/all`), body);
  }

/** Get a VIP user by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusVipUserVO> {
    return this.client.get<PlusApiResultPlusVipUserVO>(backendApiPath(`/vip/user/${id}`));
  }

/** Delete a VIP user */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/user/${id}`));
  }

/** Get a VIP recharge record by ID */
  async getByIdRecharge(id: string | number): Promise<PlusApiResultPlusVipRechargeVO> {
    return this.client.get<PlusApiResultPlusVipRechargeVO>(backendApiPath(`/vip/recharge/${id}`));
  }

/** Delete a VIP recharge record */
  async deleteRecharge(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/recharge/${id}`));
  }

/** Get a VIP recharge package by ID */
  async getByIdPack(id: string | number): Promise<PlusApiResultPlusVipRechargePackVO> {
    return this.client.get<PlusApiResultPlusVipRechargePackVO>(backendApiPath(`/vip/recharge/pack/${id}`));
  }

/** Delete a VIP recharge package */
  async deletePack(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/recharge/pack/${id}`));
  }

/** Get a VIP point change record by ID */
  async getByIdChange(id: string | number): Promise<PlusApiResultPlusVipPointChangeVO> {
    return this.client.get<PlusApiResultPlusVipPointChangeVO>(backendApiPath(`/vip/point/change/${id}`));
  }

/** Delete a VIP point change record */
  async deleteChange(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/point/change/${id}`));
  }

/** Get a VIP package group by ID */
  async getByIdPackGroup(id: string | number): Promise<PlusApiResultPlusVipPackGroupVO> {
    return this.client.get<PlusApiResultPlusVipPackGroupVO>(backendApiPath(`/vip/pack_group/${id}`));
  }

/** Delete a VIP package group */
  async deletePackGroup(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/pack_group/${id}`));
  }

/** Get VIP Package by ID */
  async getByIdPack2(id: string | number): Promise<PlusApiResultPlusVipPackVO> {
    return this.client.get<PlusApiResultPlusVipPackVO>(backendApiPath(`/vip/pack/${id}`));
  }

/** Delete VIP Package */
  async deletePack2(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/pack/${id}`));
  }

/** Get a VIP level by ID */
  async getByIdLevel(id: string | number): Promise<PlusApiResultPlusVipLevelVO> {
    return this.client.get<PlusApiResultPlusVipLevelVO>(backendApiPath(`/vip/level/${id}`));
  }

/** Delete a VIP level */
  async deleteLevel(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/level/${id}`));
  }

/** Get a VIP level benefit by ID */
  async getByIdBenefit(id: string | number): Promise<PlusApiResultPlusVipLevelBenefitVO> {
    return this.client.get<PlusApiResultPlusVipLevelBenefitVO>(backendApiPath(`/vip/level/benefit/${id}`));
  }

/** Delete a VIP level benefit */
  async deleteBenefit(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/level/benefit/${id}`));
  }

/** Get a VIP benefit by ID */
  async getByIdBenefit2(id: string | number): Promise<PlusApiResultPlusVipBenefitVO> {
    return this.client.get<PlusApiResultPlusVipBenefitVO>(backendApiPath(`/vip/benefit/${id}`));
  }

/** Delete a VIP benefit */
  async deleteBenefit2(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/benefit/${id}`));
  }

/** Get a VIP benefit usage record by ID */
  async getByIdUsage(id: string | number): Promise<PlusApiResultPlusVipBenefitUsageVO> {
    return this.client.get<PlusApiResultPlusVipBenefitUsageVO>(backendApiPath(`/vip/benefit/usage/${id}`));
  }

/** Delete a VIP benefit usage record */
  async deleteUsage(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/vip/benefit/usage/${id}`));
  }
}

export function createVipApi(client: HttpClient): VipApi {
  return new VipApi(client);
}
