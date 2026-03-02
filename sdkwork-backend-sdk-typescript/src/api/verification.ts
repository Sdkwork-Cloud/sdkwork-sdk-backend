import { backendApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { EmailVerificationForm, PhoneVerificationForm, PlusApiResultBoolean, PlusApiResultVerificationVO, SendVerificationCodeForm } from '../types';


export class VerificationApi {
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
}

export function createVerificationApi(client: HttpClient): VerificationApi {
  return new VerificationApi(client);
}
