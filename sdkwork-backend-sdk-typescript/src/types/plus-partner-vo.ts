import type { PlusTreeParentMetadata } from './plus-tree-parent-metadata';

/** åéåä½ä¼ä¼´VO */
export interface PlusPartnerVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** åä½ä¼ä¼´åç§°/å¬å¸åç§° */
  name?: string;
  /** åä½ä¼ä¼´ç­çº§ */
  level?: 'DEFAULT' | 'NORMAL' | 'SENIOR' | 'STRATEGIC';
  /** åä½ä¼ä¼´ç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'SUSPENDED' | 'FROZEN' | 'CLOSED';
  /** èç³»äººå§å */
  contactName?: string;
  /** èç³»çµè¯ */
  contactPhone?: string;
  /** èç³»é®ç®± */
  contactEmail?: string;
  /** å¬å¸å°å */
  companyAddress?: string;
  /** è¥ä¸æ§ç§å·ç  */
  businessLicense?: string;
  /** ç»ç®è´¦æ· */
  settlementAccount?: string;
  /** ä½£éæ¯ä¾ */
  commissionRate?: number;
  /** ç´¯è®¡ä½£ééé¢ */
  totalCommission?: number;
  /** å¯æç°ä½£ééé¢ */
  withdrawableCommission?: number;
  /** å·²æç°ä½£ééé¢ */
  withdrawnCommission?: number;
  /** æ¨å¹¿ç  */
  promotionCode?: string;
  /** ä¸çº§åä½ä¼ä¼´ID */
  parentId?: number;
  /** ç¶çº§åæ°æ®ä¿¡æ¯ï¼åå«ææç¶çº§IDè·¯å¾ï¼ */
  parentMetadata?: PlusTreeParentMetadata;
  /** ä¸çº§åä½ä¼ä¼´UUID */
  parentUuid?: string;
  /** åä½å¼å§æ¶é´ */
  cooperationStartTime?: string;
  /** åä½ç»ææ¶é´ */
  cooperationEndTime?: string;
  /** å¤æ³¨ */
  remark?: string;
}
