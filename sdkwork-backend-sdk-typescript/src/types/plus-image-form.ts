/** Image creation form */
export interface PlusImageForm {
  /** 图片标题 */
  title?: string;
  /** 图片描述信息 */
  description?: string;
  /** 图片存储URL */
  url: string;
  /** 图片比例 */
  aspectRatio: string;
  /** 图片宽度（像素） */
  width?: number;
  /** 图片高度（像素） */
  height?: number;
  /** 图片文件大小 */
  fileSize?: number;
  /** 图片格式 */
  format?: string;
  /** 图片状态 */
  status: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
