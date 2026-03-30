import type { PlusNotesPublishArticleForm } from './plus-notes-publish-article-form';

/** 濯掍綋鑽夌鍒涘缓琛ㄥ崟 */
export interface PlusNotesMediaDraftForm {
  /** 鍙戝竷鐢ㄦ埛ID锛堢鐞嗗憳鍙寚瀹氾級 */
  userId?: number;
  /** 鍙戝竷骞冲彴 */
  platform?: 'DEFAULT' | 'WECHAT_OFFICIAL_ACCOUNT' | 'DOUYIN';
  /** 骞冲彴浜у搧鏍囪瘑锛岄粯璁?default */
  product?: string;
  /** A rt ic le s */
  articles: PlusNotesPublishArticleForm[];
}
