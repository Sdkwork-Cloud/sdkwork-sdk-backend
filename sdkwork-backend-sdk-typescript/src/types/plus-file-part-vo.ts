/** æä»¶åçVOå¯¹è±¡ */
export interface PlusFilePartVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å³èçæä»¶ID */
  fileId?: number;
  /** åçç´¢å¼(ä»0å¼å§) */
  chunkIndex?: number;
  /** åçå¤§å°(å­è) */
  chunkSize?: number;
  /** æä»¶æ»å¤§å°(å­è) */
  totalSize?: number;
  /** åçåå®¹æ ¡éªå */
  checksum?: string;
  /** ä¸ä¼ ç¶æ: 1-ä¸ä¼ ä¸­, 2-ä¸ä¼ å®æ, 3-ä¸ä¼ å¤±è´¥ */
  status?: number;
  /** åçå­å¨è·¯å¾ */
  storagePath?: string;
}
