export interface WechatDomainVerifyResponse {
  /** Verification status */
  status?: string;
  /** Verification message */
  message?: string;
  /** Normalized JS secure domains */
  jsSecureDomain?: string[];
  /** Normalized OAuth domains */
  oauthDomain?: string[];
  /** Normalized business domains */
  businessDomain?: string[];
  /** Normalized IP whitelist */
  ipWhitelist?: string[];
  /** Verification time */
  checkedAt?: string;
}
