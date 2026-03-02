/** Video creation form */
export interface PlusVideoForm {
  id?: number;
  /** 视频标题 */
  title?: string;
  /** 视频描述信息 */
  description?: string;
  /** 视频存储URL */
  contentUrl: string;
  /** 视频比例 */
  aspectRatio: string;
  /** 视频时长（秒） */
  duration?: number;
  /** 视频分辨率 */
  resolution?: string;
  /** 图片宽度（像素） */
  width?: number;
  /** 图片高度（像素） */
  height?: number;
  /** 视频文件大小 */
  fileSize?: number;
  /** 视频格式 */
  format?: string;
  /** 视频缩略图URL */
  thumbnailUrl?: string;
  /** 视频状态 */
  status: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
}
