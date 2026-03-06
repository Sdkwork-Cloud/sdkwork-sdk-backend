/** 媒体草稿预览表单 */
export interface PlusNotesMediaPreviewForm {
  /** 发布用户ID（管理员可指定） */
  userId?: number;
  /** 发布平台 */
  platform?: 'DEFAULT' | 'WECHAT_OFFICIAL_ACCOUNT' | 'DOUYIN';
  /** 平台产品标识，默认 default */
  product?: string;
  /** 草稿 mediaId */
  draftMediaId: string;
}
