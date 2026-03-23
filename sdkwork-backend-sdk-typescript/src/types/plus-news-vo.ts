import type { TagsContent } from './tags-content';

/** æ°é»èµè®¯VOå¯¹è±¡ */
export interface PlusNewsVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** ç¨æ·ID(å¤é®å³èplus_user.id) */
  userId?: number;
  /** æ°é»æ é¢ */
  title?: string;
  /** æ°é»åå®¹URL */
  url?: string;
  /** æ°é»æ¥æº */
  source?: string;
  /** æ°é»æè¦ */
  summary?: string;
  /** æ°é»åå¸æ¶é´ */
  publishTime?: string;
  /** æ°é»æ ç­¾ */
  tags?: TagsContent;
  /** æ°é»åç±»ID */
  categoryId?: number;
}
