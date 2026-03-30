import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';
import type { MusicMediaResource } from './music-media-resource';

/** 音乐信息VO */
export interface PlusMusicVO {
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
  /** 音乐标题 */
  title?: string;
  /** 音乐封面图片列表 */
  coverImages?: ImageMediaResourceList;
  /** 音乐描述信息 */
  description?: string;
  /** 资源信息 */
  resource?: MusicMediaResource;
  /** 作者信息 */
  author?: AuthorInfo;
  /** 音乐存储URL */
  contentUrl?: string;
  /** 音乐资源列表 */
  resourceList?: AssetMediaResourceList;
  /** 音乐格式 */
  format?: string;
  /** 音乐时长（秒） */
  duration?: number;
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
  status?: 'DEFAULT' | 'PROCESSING' | 'COMPLETED' | 'FAILED' | 'DELETED';
}
