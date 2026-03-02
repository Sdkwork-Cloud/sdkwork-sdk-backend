import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChangePasswordForm, LoginForm, LoginResultVO, PasswordResetForm, PasswordResetRequestForm, PlusApiResultBoolean, PlusApiResultLoginResultVO, PlusApiResultPasswordResetResultVO, PlusApiResultRegisterResultVO, PlusApiResultUserVO, PlusApiResultVoid, RefreshTokenForm, RegisterForm } from '../types';


export class AuthenticationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 重置密码 */
  async resetPassword(body: PasswordResetForm): Promise<PlusApiResultPasswordResetResultVO> {
    return this.client.post<PlusApiResultPasswordResetResultVO>(backendApiPath(`/auth/authentication/reset_password`), body);
  }

/** 请求密码重置 */
  async requestPasswordReset(body: PasswordResetRequestForm): Promise<PlusApiResultPasswordResetResultVO> {
    return this.client.post<PlusApiResultPasswordResetResultVO>(backendApiPath(`/auth/authentication/request_password_reset`), body);
  }

/** 用户注册 */
  async register(body: RegisterForm): Promise<PlusApiResultRegisterResultVO> {
    return this.client.post<PlusApiResultRegisterResultVO>(backendApiPath(`/auth/authentication/register`), body);
  }

/** 刷新访问令牌 */
  async refreshToken(body: RefreshTokenForm): Promise<PlusApiResultLoginResultVO> {
    return this.client.post<PlusApiResultLoginResultVO>(backendApiPath(`/auth/authentication/refresh_token`), body);
  }

/** 退出登录 */
  async logout(): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(backendApiPath(`/auth/authentication/logout`));
  }

/** 用户登录 */
  async login(body: LoginForm): Promise<LoginResultVO> {
    return this.client.post<LoginResultVO>(backendApiPath(`/auth/authentication/login`), body);
  }

/** 修改密码 */
  async changePassword(body: ChangePasswordForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/auth/authentication/change_password`), body);
  }

/** 获取当前用户信息 */
  async getCurrentUser(): Promise<PlusApiResultUserVO> {
    return this.client.get<PlusApiResultUserVO>(backendApiPath(`/auth/authentication/get_current_user`));
  }
}

export function createAuthenticationApi(client: HttpClient): AuthenticationApi {
  return new AuthenticationApi(client);
}
