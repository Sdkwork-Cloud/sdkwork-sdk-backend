/** æ¿¯æç¶é½å¤îéæç«·çã¥å´ */
export interface PlusNotesMediaPublishDraftForm {
  /** éæç«·é¢ã¦åIDéå ¢î¸éåæ³éîå¯ç¹æ°¾ç´ */
  userId?: number;
  /** éæç«·éªå²å½´ */
  platform?: 'DEFAULT' | 'WECHAT_OFFICIAL_ACCOUNT' | 'DOUYIN';
  /** éªå²å½´æµÑæ§éåªçéå²ç²¯ç?default */
  product?: string;
  /** é½å¤î mediaId */
  draftMediaId: string;
}
