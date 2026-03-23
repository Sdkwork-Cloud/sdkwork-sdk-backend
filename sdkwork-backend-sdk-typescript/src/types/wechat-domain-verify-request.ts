export interface WechatDomainVerifyRequest {
  /** JS secure domains */
  jsSecureDomain?: string[];
  /** OAuth domains */
  oauthDomain?: string[];
  /** Business domains */
  businessDomain?: string[];
  /** IP whitelist */
  ipWhitelist?: string[];
}
