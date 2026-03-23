export interface WechatConnectivityCheckResponse {
  /** Whether connectivity configuration is valid */
  success?: boolean;
  /** Validation message */
  message?: string;
  /** Callback URL used for validation */
  callbackUrl?: string;
  /** Whether token has been configured */
  tokenConfigured?: boolean;
  /** Whether encoding AES key has been configured */
  encodingAESKeyConfigured?: boolean;
  /** Validation time */
  checkedAt?: string;
}
