import type { PlusMediaPublishItemResultDTO } from './plus-media-publish-item-result-dto';

export interface PlusMediaPublishResultDTO {
  batchId?: string;
  platform?: 'DEFAULT' | 'WECHAT_OFFICIAL_ACCOUNT' | 'DOUYIN';
  action?: 'DEFAULT' | 'CREATE_DRAFT' | 'PREVIEW_DRAFT' | 'PUBLISH_DRAFT' | 'DIRECT_PUBLISH';
  success?: boolean;
  errcode?: number;
  errmsg?: string;
  draftMediaId?: string;
  publishId?: string;
  articleId?: string;
  previewData?: unknown;
  items?: PlusMediaPublishItemResultDTO[];
}
