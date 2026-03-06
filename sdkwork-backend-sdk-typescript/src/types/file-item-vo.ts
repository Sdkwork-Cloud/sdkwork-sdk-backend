/** File item view object */
export interface FileItemVO {
  /** File ID */
  id?: string;
  /** Object type */
  object?: string;
  /** File size in bytes */
  bytes?: number;
  /** Creation time in epoch seconds */
  createdAt?: number;
  /** Filename */
  filename?: string;
  /** File purpose */
  purpose?: string;
  /** Expiration time in epoch seconds */
  expiresAt?: number;
  /** File status */
  status?: string;
  /** Status details */
  statusDetails?: string;
  /** Deleted flag */
  deleted?: boolean;
}
