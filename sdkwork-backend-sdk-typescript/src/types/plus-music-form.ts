/** Music creation form */
export interface PlusMusicForm {
  /** Music title */
  title: string;
  /** Music description */
  description?: string;
  /** Music content URL */
  contentUrl: string;
  /** Music format */
  format?: string;
  /** Duration in seconds */
  duration: number;
  /** File size in bytes */
  fileSize?: number;
  /** Thumbnail URL */
  thumbnailUrl?: string;
  /** Artist name */
  artist?: string;
  /** Music genre */
  genre?: string;
  /** Bitrate in kbps */
  bitrate?: number;
  /** Music status */
  status: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
