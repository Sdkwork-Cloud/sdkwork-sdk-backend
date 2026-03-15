/** Video creation form */
export interface PlusVideoForm {
  /** Video title */
  title?: string;
  /** Video description */
  description?: string;
  /** Video content URL */
  contentUrl: string;
  /** Aspect ratio */
  aspectRatio?: string;
  /** Duration in seconds */
  duration?: number;
  /** Resolution */
  resolution?: string;
  /** Video width in pixels */
  width?: number;
  /** Video height in pixels */
  height?: number;
  /** File size in bytes */
  fileSize?: number;
  /** Video format */
  format?: string;
  /** Thumbnail URL */
  thumbnailUrl?: string;
  /** Video status */
  status: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
