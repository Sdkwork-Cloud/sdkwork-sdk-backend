import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { ChangePasswordForm, EmailVerificationForm, GetCurrentAccessTokenForm, LoginForm, LoginResultVO, OAuthCallbackForm, OAuthLoginRequestForm, PasswordResetForm, PasswordResetRequestForm, PermissionCheckForm, PhoneVerificationForm, PlusApiResultBoolean, PlusApiResultCurrentAccessTokenVO, PlusApiResultListString, PlusApiResultLoginResultVO, PlusApiResultOAuthLoginResponseVO, PlusApiResultPasswordResetResultVO, PlusApiResultQrCodeStatusVO, PlusApiResultQrCodeVO, PlusApiResultRegisterResultVO, PlusApiResultUserVO, PlusApiResultVerificationVO, PlusApiResultVoid, QrCodeConfirmForm, RefreshTokenForm, RegisterForm, RoleCheckForm, SendVerificationCodeForm } from '../types';


export class AuthApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** Verify phone */
  async verifyPhone(body: PhoneVerificationForm): Promise<PlusApiResultVerificationVO> {
    return this.client.post<PlusApiResultVerificationVO>(backendApiPath(`/auth/verification/verify_phone`), body);
  }

/** Verify email */
  async verifyEmail(body: EmailVerificationForm): Promise<PlusApiResultVerificationVO> {
    return this.client.post<PlusApiResultVerificationVO>(backendApiPath(`/auth/verification/verify_email`), body);
  }

/** Send verification code */
  async sendVerificationCode(body: SendVerificationCodeForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/auth/verification/send_code`), body);
  }

/** Generate login QR code */
  async generateQrCode(): Promise<PlusApiResultQrCodeVO> {
    return this.client.post<PlusApiResultQrCodeVO>(backendApiPath(`/auth/qrcode/generate`));
  }

/** Confirm QR login */
  async confirmQrCodeLogin(body: QrCodeConfirmForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(backendApiPath(`/auth/qrcode/confirm`), body);
  }

/** Get OAuth authorization URL */
  async getAuthUrl(body: OAuthLoginRequestForm): Promise<PlusApiResultOAuthLoginResponseVO> {
    return this.client.post<PlusApiResultOAuthLoginResponseVO>(backendApiPath(`/auth/oauth/get_auth_url`), body);
  }

/** Get OAuth authorization URL */
  async createGetAuthUrl(body: OAuthLoginRequestForm): Promise<PlusApiResultOAuthLoginResponseVO> {
    return this.client.post<PlusApiResultOAuthLoginResponseVO>(backendApiPath(`/auth/oauth/authorize`), body);
  }

/** Handle OAuth callback */
  async handleCallback(body: OAuthCallbackForm): Promise<PlusApiResultLoginResultVO> {
    return this.client.post<PlusApiResultLoginResultVO>(backendApiPath(`/auth/oauth/callback`), body);
  }

/** Check role */
  async hasRole(body: RoleCheckForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/auth/authorization/has_role`), body);
  }

/** Check permission */
  async hasPermission(body: PermissionCheckForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/auth/authorization/has_permission`), body);
  }

/** Reset password */
  async resetPassword(body: PasswordResetForm): Promise<PlusApiResultPasswordResetResultVO> {
    return this.client.post<PlusApiResultPasswordResetResultVO>(backendApiPath(`/auth/authentication/reset_password`), body);
  }

/** Request password reset */
  async requestPasswordReset(body: PasswordResetRequestForm): Promise<PlusApiResultPasswordResetResultVO> {
    return this.client.post<PlusApiResultPasswordResetResultVO>(backendApiPath(`/auth/authentication/request_password_reset`), body);
  }

/** Register */
  async register(body: RegisterForm): Promise<PlusApiResultRegisterResultVO> {
    return this.client.post<PlusApiResultRegisterResultVO>(backendApiPath(`/auth/authentication/register`), body);
  }

/** Refresh token */
  async refreshToken(body: RefreshTokenForm): Promise<PlusApiResultLoginResultVO> {
    return this.client.post<PlusApiResultLoginResultVO>(backendApiPath(`/auth/authentication/refresh_token`), body);
  }

/** Logout */
  async logout(): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(backendApiPath(`/auth/authentication/logout`));
  }

/** Login */
  async login(body: LoginForm): Promise<LoginResultVO> {
    return this.client.post<LoginResultVO>(backendApiPath(`/auth/authentication/login`), body);
  }

/** Change password */
  async changePassword(body: ChangePasswordForm): Promise<PlusApiResultBoolean> {
    return this.client.post<PlusApiResultBoolean>(backendApiPath(`/auth/authentication/change_password`), body);
  }

/** Get current tenant/organization access token */
  async getCurrentAccessToken(body: GetCurrentAccessTokenForm): Promise<PlusApiResultCurrentAccessTokenVO> {
    return this.client.post<PlusApiResultCurrentAccessTokenVO>(backendApiPath(`/auth/access_token/current`), body);
  }

/** Check QR code status */
  async checkQrCodeStatus(qrKey: string | number): Promise<PlusApiResultQrCodeStatusVO> {
    return this.client.get<PlusApiResultQrCodeStatusVO>(backendApiPath(`/auth/qrcode/status/${qrKey}`));
  }

/** Get roles */
  async getRoles(): Promise<PlusApiResultListString> {
    return this.client.get<PlusApiResultListString>(backendApiPath(`/auth/authorization/roles`));
  }

/** Get permissions */
  async getPermissions(): Promise<PlusApiResultListString> {
    return this.client.get<PlusApiResultListString>(backendApiPath(`/auth/authorization/permissions`));
  }

/** Get current user */
  async getCurrentUser(): Promise<PlusApiResultUserVO> {
    return this.client.get<PlusApiResultUserVO>(backendApiPath(`/auth/authentication/get_current_user`));
  }
}

export function createAuthApi(client: HttpClient): AuthApi {
  return new AuthApi(client);
}
