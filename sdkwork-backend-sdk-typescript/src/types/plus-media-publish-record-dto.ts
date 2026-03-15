export interface PlusMediaPublishRecordDTO {
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  version?: number;
  batchId?: string;
  userId?: number;
  noteId?: number;
  noteUuid?: string;
  noteTitle?: string;
  platform?: 'DEFAULT' | 'WECHAT_OFFICIAL_ACCOUNT' | 'DOUYIN';
  action?: 'DEFAULT' | 'CREATE_DRAFT' | 'PREVIEW_DRAFT' | 'PUBLISH_DRAFT' | 'DIRECT_PUBLISH' | 'QUERY_PUBLISH_STATUS' | 'QUERY_PUBLISHED_ARTICLE';
  status?: 'DEFAULT' | 'RUNNING' | 'SUCCESS' | 'FAILURE';
  draftMediaId?: string;
  publishId?: string;
  articleId?: string;
  articleIndex?: number;
  errcode?: number;
  errmsg?: string;
  requestPayload?: Record<string, unknown>;
  responsePayload?: Record<string, unknown>;
  startedAt?: string;
  finishedAt?: string;
}
