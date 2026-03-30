import type { AuthorInfo } from './author-info';
import type { VideoMediaResource } from './video-media-resource';

/** 视频信息VO */
export interface PlusVideoVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 版本号，用于乐观锁控制 */
  version?: number;
  /** 视频标题 */
  title?: string;
  /** 视频描述信息 */
  description?: string;
  /** 视频资源信息 */
  resource?: VideoMediaResource;
  /** 作者信息 */
  author?: AuthorInfo;
  /** 视频存储URL */
  contentUrl?: string;
  /** 视频比例 */
  aspectRatio?: string;
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
  status?: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
