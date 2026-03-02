/** Short URL creation parameters */
export interface ShortUrlForm {
  /** Original long URL (full target address) */
  originalUrl: string;
  /** Short URL code (unique access identifier) */
  shortCode: string;
  /** Short URL expiration time (null indicates permanent validity) */
  expiresAt?: string;
  /** Short URL status (operational state control) */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'EXPIRED';
  /** Creator user ID (null for system-generated URLs) */
  createdBy?: number;
  /** Short URL description (supplementary notes) */
  description?: string;
}
