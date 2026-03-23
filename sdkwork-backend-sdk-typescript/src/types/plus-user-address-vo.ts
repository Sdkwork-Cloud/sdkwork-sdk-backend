import type { TagsContent } from './tags-content';

/** ç¨æ·å°åVO */
export interface PlusUserAddressVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** æ¶è´§äººå§å */
  name?: string;
  /** æ¶è´§äººææºå· */
  phone?: string;
  /** å½å®¶ä»£ç  */
  countryCode?: string;
  /** çä»½ä»£ç  */
  provinceCode?: string;
  /** åå¸ä»£ç  */
  cityCode?: string;
  /** åºå¿ä»£ç  */
  districtCode?: string;
  /** è¯¦ç»å°å */
  addressDetail?: string;
  /** é®æ¿ç¼ç  */
  postalCode?: string;
  /** æ¯å¦é»è®¤å°å 0-å¦ 1-æ¯ */
  isDefault?: boolean;
  /** å°åæ ç­¾ï¼å¦ï¼å®¶ãå¬å¸ç­ï¼ */
  tags?: TagsContent;
}
