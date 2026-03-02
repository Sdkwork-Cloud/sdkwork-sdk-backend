import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';

/** Article creation form */
export interface PlusArticleForm {
  /** 文章标题 */
  title: string;
  /** 文章副标题 */
  subtitle?: string;
  /** 文章正文内容 */
  content: string;
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
  status: 'DEFAULT' | 'DRAFT' | 'PUBLISHED' | 'ARCHIVED' | 'DELETED';
  /** 文章关键词 */
  keywords?: string[];
  /** 文章摘要 */
  summary?: string;
}
