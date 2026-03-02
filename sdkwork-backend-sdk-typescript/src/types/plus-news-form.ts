import type { TagsContent } from './tags-content';

/** News creation form */
export interface PlusNewsForm {
  /** 新闻标题 */
  title: string;
  /** 新闻内容URL */
  url?: string;
  /** 新闻来源 */
  source?: string;
  /** 新闻摘要 */
  summary?: string;
  /** 新闻发布时间 */
  publishTime?: string;
  /** 新闻标签 */
  tags?: TagsContent;
  /** 用户ID(外键关联plus_user.id) */
  userId?: number;
}
