import type { TagsContent } from './tags-content';

/** 新闻资讯VO对象 */
export interface PlusNewsVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 用户ID(外键关联plus_user.id) */
  userId?: number;
  /** 新闻标题 */
  title?: string;
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
}
