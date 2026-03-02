/** Music creation form */
export interface PlusMusicForm {
  /** 音乐标题 */
  title?: string;
  /** 音乐描述信息 */
  description?: string;
  /** 音乐存储URL */
  contentUrl: string;
  /** 音乐格式 */
  format: string;
  /** 音乐时长（秒） */
  duration: number;
  /** 音乐文件大小 */
  fileSize?: number;
  /** 音乐缩略图URL */
  thumbnailUrl?: string;
  /** 艺术家名称 */
  artist?: string;
  /** 音乐流派 */
  genre?: string;
  /** 音频比特率 */
  bitrate?: number;
  /** 音乐状态 */
  status: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
}
