import type { FileContentObject } from './file-content-object';

/** æä»¶åå®¹VOï¼ä¸PlusFileä¸å¯¹ä¸å¯¹åºï¼å­å¨æä»¶çææ¬åå®¹åç¼ç ä¿¡æ¯ï¼ */
export interface PlusFileContentVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å³èæä»¶ID(å¤é®å³èplus_file.id) */
  fileId?: number;
  /** å³èæä»¶UUID(å¤é®å³èplus_file.uuid) */
  fileUuid?: string;
  /** æç¤ºè¯ */
  prompt?: string;
  /** æä»¶ç¼ç æ ¼å¼(å¦UTF-8ãGBKãISO-8859-1ç­) */
  encoding?: string;
  /** æä»¶ææ¬åå®¹ */
  content?: FileContentObject;
}
