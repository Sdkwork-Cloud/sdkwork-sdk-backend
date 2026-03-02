/** Short URL VO (stores short URL metadata and access statistics) */
export interface ShortUrlVO {
  /** Creation time */
  createdAt?: string;
  /** Last update time */
  updatedAt?: string;
  /** Primary key ID */
  id?: number;
  /** Universally unique identifier UUID */
  uuid?: string;
  /** Original long URL (full target address) */
  originalUrl?: string;
  /** Short URL code (unique access identifier) */
  shortCode?: string;
  /** Short URL expiration time (null indicates permanent validity) */
  expiresAt?: string;
  /** Total click count of the short URL */
  clickCount?: number;
  /** Short URL status (active/inactive/expired) */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'EXPIRED';
  /** Creator user ID (null for system-generated URLs) */
  createdBy?: number;
  /** Short URL description (supplementary notes) */
  description?: string;
}
