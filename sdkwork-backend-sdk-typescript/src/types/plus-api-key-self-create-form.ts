/** Current user API key creation form */
export interface PlusApiKeySelfCreateForm {
  /** API key name */
  name: string;
  /** API key type */
  type: 'DEFAULT' | 'SYSTEM' | 'USER' | 'APPLICATION' | 'INTEGRATION';
  /** Expiration time */
  expireTime?: string;
  /** Description */
  description?: string;
}
