/** P lu sN ot es Me di aP ub li sh ed Ar ti cl eF or m */
export interface PlusNotesMediaPublishedArticleForm {
  /** 鍙戝竷鐢ㄦ埛ID锛堢鐞嗗憳鍙寚瀹氾級 */
  userId?: number;
  /** 鍙戝竷骞冲彴 */
  platform?: 'DEFAULT' | 'WECHAT_OFFICIAL_ACCOUNT' | 'DOUYIN';
  /** 骞冲彴浜у搧鏍囪瘑锛岄粯璁efault */
  product?: string;
  /** 宸插彂甯冩枃绔燼rticleId */
  articleId: string;
}
