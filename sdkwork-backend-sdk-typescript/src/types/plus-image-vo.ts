import type { AuthorInfo } from './author-info';
import type { ImageMediaResource } from './image-media-resource';

/** 图片信息VO */
export interface PlusImageVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 图片标题 */
  title?: string;
  /** 图片描述信息 */
  description?: string;
  /** 图片资源信息 */
  resource?: ImageMediaResource;
  /** 作者信息 */
  author?: AuthorInfo;
  /** 图片存储URL */
  url?: string;
  /** 图片比例 */
  aspectRatio?: string;
  /** 图片宽度（像素） */
  width?: number;
  /** 图片高度（像素） */
  height?: number;
  /** 图片文件大小 */
  fileSize?: number;
  /** 图片格式 */
  format?: string;
  /** 图片状态 */
  status?: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
