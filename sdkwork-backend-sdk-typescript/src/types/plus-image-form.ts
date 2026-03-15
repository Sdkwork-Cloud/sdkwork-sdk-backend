/** Image creation form */
export interface PlusImageForm {
  /** Image title */
  title?: string;
  /** Image description */
  description?: string;
  /** Image URL */
  url: string;
  /** Aspect ratio */
  aspectRatio?: string;
  /** Image width in pixels */
  width?: number;
  /** Image height in pixels */
  height?: number;
  /** File size in bytes */
  fileSize?: number;
  /** Image format */
  format?: string;
  /** Image status */
  status: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
