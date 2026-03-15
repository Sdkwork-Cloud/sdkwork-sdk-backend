/** Current user API key update form */
export interface PlusApiKeySelfUpdateForm {
  /** API key name */
  name?: string;
  /** Expiration time */
  expireTime?: string;
  /** Whether to clear the expiration time */
  clearExpireTime?: boolean;
  /** Description */
  description?: string;
}
