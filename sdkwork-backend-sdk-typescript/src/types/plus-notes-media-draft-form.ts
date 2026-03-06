import type { PlusNotesPublishArticleForm } from './plus-notes-publish-article-form';

/** 媒体草稿创建表单 */
export interface PlusNotesMediaDraftForm {
  /** 发布用户ID（管理员可指定） */
  userId?: number;
  /** 发布平台 */
  platform?: 'DEFAULT' | 'WECHAT_OFFICIAL_ACCOUNT' | 'DOUYIN';
  /** 平台产品标识，默认 default */
  product?: string;
  /** 待发布文章列表 */
  articles: PlusNotesPublishArticleForm[];
}
