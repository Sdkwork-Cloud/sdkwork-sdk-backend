import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';

/** AI生成文章VO对象 */
export interface PlusArticleVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 文章标题 */
  title?: string;
  /** 文章副标题 */
  subtitle?: string;
  /** 文章正文内容 */
  content?: string;
  /** 文章字数统计 */
  wordCount?: number;
  /** 预计阅读时间 */
  readingTime?: number;
  /** 文章封面图URL */
  coverImages?: ImageMediaResourceList;
  /** 文章作者信息 */
  author?: AuthorInfo;
  /** 文章来源 */
  source?: string;
  /** 文章状态 */
  status?: 'DEFAULT' | 'DRAFT' | 'PUBLISHED' | 'ARCHIVED' | 'DELETED';
  /** 文章关键词 */
  keywords?: string[];
  /** 文章摘要 */
  summary?: string;
}
