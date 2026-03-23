/** P lu sN ot es Me di aP ub li sh St at us Fo rm */
export interface PlusNotesMediaPublishStatusForm {
  /** éæç«·é¢ã¦åIDéå ¢î¸éåæ³éîå¯ç¹æ°¾ç´ */
  userId?: number;
  /** éæç«·éªå²å½´ */
  platform?: 'DEFAULT' | 'WECHAT_OFFICIAL_ACCOUNT' | 'DOUYIN';
  /** éªå²å½´æµÑæ§éåªçéå²ç²¯çîefault */
  product?: string;
  /** éæç«·æµ è¯²å§publishId */
  publishId: string;
}
