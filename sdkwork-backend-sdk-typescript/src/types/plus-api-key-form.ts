/** API key creation form */
export interface PlusApiKeyForm {
  /** API key name */
  name: string;
  /** API key value */
  keyValue: string;
  /** API key type */
  type: 'DEFAULT' | 'SYSTEM' | 'USER' | 'APPLICATION' | 'INTEGRATION';
  /** API key status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'EXPIRED' | 'REVOKED';
  /** Expiration time */
  expireTime?: string;
  /** Description */
  description?: string;
}
