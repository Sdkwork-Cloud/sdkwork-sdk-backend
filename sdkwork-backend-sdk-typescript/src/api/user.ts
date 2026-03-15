import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultBoolean, PlusApiResultListPlusUserAddressVO, PlusApiResultListPlusUserCardVO, PlusApiResultListPlusUserCouponVO, PlusApiResultListPlusUserOAuthAccountVO, PlusApiResultListPlusUserVO, PlusApiResultPagePlusUserAddressVO, PlusApiResultPagePlusUserCardVO, PlusApiResultPagePlusUserCouponVO, PlusApiResultPagePlusUserOAuthAccountVO, PlusApiResultPagePlusUserVO, PlusApiResultPlusUserAddressVO, PlusApiResultPlusUserCardVO, PlusApiResultPlusUserCouponVO, PlusApiResultPlusUserOAuthAccountVO, PlusApiResultPlusUserProfileVO, PlusApiResultPlusUserVO, PlusUserAddressForm, PlusUserCardForm, PlusUserCouponForm, PlusUserForm, PlusUserOAuthAccountForm, QueryListForm } from '../types';


export class UserApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Update an existing user */
  async update(body: PlusUserForm): Promise<PlusApiResultPlusUserVO> {
    return this.client.put<PlusApiResultPlusUserVO>(backendApiPath(`/user`), body);
  }

/** Create a new user */
  async create(body: PlusUserForm): Promise<PlusApiResultPlusUserVO> {
    return this.client.post<PlusApiResultPlusUserVO>(backendApiPath(`/user`), body);
  }

/** Update user OAuth account */
  async updateAccount(body: PlusUserOAuthAccountForm): Promise<PlusApiResultPlusUserOAuthAccountVO> {
    return this.client.put<PlusApiResultPlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account`), body);
  }

/** Create user OAuth account */
  async createAccount(body: PlusUserOAuthAccountForm): Promise<PlusApiResultPlusUserOAuthAccountVO> {
    return this.client.post<PlusApiResultPlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account`), body);
  }

/** Update an existing user coupon */
  async updateCoupon(body: PlusUserCouponForm): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.put<PlusApiResultPlusUserCouponVO>(backendApiPath(`/user/coupon`), body);
  }

/** Create a new user coupon */
  async createCoupon(body: PlusUserCouponForm): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.post<PlusApiResultPlusUserCouponVO>(backendApiPath(`/user/coupon`), body);
  }

/** Update user-card binding */
  async updateCard(body: PlusUserCardForm): Promise<PlusApiResultPlusUserCardVO> {
    return this.client.put<PlusApiResultPlusUserCardVO>(backendApiPath(`/user/card`), body);
  }

/** Create user-card binding */
  async createCard(body: PlusUserCardForm): Promise<PlusApiResultPlusUserCardVO> {
    return this.client.post<PlusApiResultPlusUserCardVO>(backendApiPath(`/user/card`), body);
  }

/** Update an existing user address */
  async updateAddress(body: PlusUserAddressForm): Promise<PlusApiResultPlusUserAddressVO> {
    return this.client.put<PlusApiResultPlusUserAddressVO>(backendApiPath(`/user/address`), body);
  }

/** Create a new user address */
  async createAddress(body: PlusUserAddressForm): Promise<PlusApiResultPlusUserAddressVO> {
    return this.client.post<PlusApiResultPlusUserAddressVO>(backendApiPath(`/user/address`), body);
  }

/** Get user OAuth accounts by page */
  async createListByPage(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserOAuthAccountVO> {
    return this.client.post<PlusApiResultPagePlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account/list`), body, params);
  }

/** Get all user OAuth accounts */
  async createListAllEntities(body?: QueryListForm): Promise<PlusApiResultListPlusUserOAuthAccountVO> {
    return this.client.post<PlusApiResultListPlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account/list/all`), body);
  }

/** Get users by page */
  async createListByPageUser(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserVO> {
    return this.client.post<PlusApiResultPagePlusUserVO>(backendApiPath(`/user/list`), body, params);
  }

/** Get all users */
  async createListAllEntitiesUser(body?: QueryListForm): Promise<PlusApiResultListPlusUserVO> {
    return this.client.post<PlusApiResultListPlusUserVO>(backendApiPath(`/user/list/all`), body);
  }

/** Get user coupons by page */
  async createListByPageCoupon(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserCouponVO> {
    return this.client.post<PlusApiResultPagePlusUserCouponVO>(backendApiPath(`/user/coupon/list`), body, params);
  }

/** Get all user coupons */
  async createListAllEntitiesCoupon(body?: QueryListForm): Promise<PlusApiResultListPlusUserCouponVO> {
    return this.client.post<PlusApiResultListPlusUserCouponVO>(backendApiPath(`/user/coupon/list/all`), body);
  }

/** Get user-card bindings by page */
  async createListByPageCard(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserCardVO> {
    return this.client.post<PlusApiResultPagePlusUserCardVO>(backendApiPath(`/user/card/list`), body, params);
  }

/** Get all user-card bindings */
  async createListAllEntitiesCard(body?: QueryListForm): Promise<PlusApiResultListPlusUserCardVO> {
    return this.client.post<PlusApiResultListPlusUserCardVO>(backendApiPath(`/user/card/list/all`), body);
  }

/** Get addresses by page */
  async createListByPageAddress(body?: QueryListForm, params?: QueryParams): Promise<PlusApiResultPagePlusUserAddressVO> {
    return this.client.post<PlusApiResultPagePlusUserAddressVO>(backendApiPath(`/user/address/list`), body, params);
  }

/** Get all user addresses */
  async createListAllEntitiesAddress(body?: QueryListForm): Promise<PlusApiResultListPlusUserAddressVO> {
    return this.client.post<PlusApiResultListPlusUserAddressVO>(backendApiPath(`/user/address/list/all`), body);
  }

/** Get a user by ID */
  async getById(id: string | number): Promise<PlusApiResultPlusUserVO> {
    return this.client.get<PlusApiResultPlusUserVO>(backendApiPath(`/user/${id}`));
  }

/** Delete a user */
  async delete(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/${id}`));
  }

/** Get current user profile */
  async getProfile(): Promise<PlusApiResultPlusUserProfileVO> {
    return this.client.get<PlusApiResultPlusUserProfileVO>(backendApiPath(`/user/profile`));
  }

/** Get user OAuth account by ID */
  async getByIdAccount(id: string | number): Promise<PlusApiResultPlusUserOAuthAccountVO> {
    return this.client.get<PlusApiResultPlusUserOAuthAccountVO>(backendApiPath(`/user/oauth/account/${id}`));
  }

/** Delete user OAuth account */
  async deleteAccount(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/oauth/account/${id}`));
  }

/** Get a user coupon by ID */
  async getByIdCoupon(id: string | number): Promise<PlusApiResultPlusUserCouponVO> {
    return this.client.get<PlusApiResultPlusUserCouponVO>(backendApiPath(`/user/coupon/${id}`));
  }

/** Delete a user coupon */
  async deleteCoupon(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/coupon/${id}`));
  }

/** Get user-card binding by ID */
  async getByIdCard(id: string | number): Promise<PlusApiResultPlusUserCardVO> {
    return this.client.get<PlusApiResultPlusUserCardVO>(backendApiPath(`/user/card/${id}`));
  }

/** Delete user-card binding */
  async deleteCard(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/card/${id}`));
  }

/** Get address by ID */
  async getByIdAddress(id: string | number): Promise<PlusApiResultPlusUserAddressVO> {
    return this.client.get<PlusApiResultPlusUserAddressVO>(backendApiPath(`/user/address/${id}`));
  }

/** Delete a user address */
  async deleteAddress(id: string | number): Promise<PlusApiResultBoolean> {
    return this.client.delete<PlusApiResultBoolean>(backendApiPath(`/user/address/${id}`));
  }
}

export function createUserApi(client: HttpClient): UserApi {
  return new UserApi(client);
}
