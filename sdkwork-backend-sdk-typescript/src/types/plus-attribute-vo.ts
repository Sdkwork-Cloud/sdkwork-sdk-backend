/** åååç±»å±æ§VO */
export interface PlusAttributeVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** çæ¬å·ï¼ç¨äºä¹è§éæ§å¶ */
  version?: number;
  /** å±æ§åç§° */
  name?: string;
  /** å±æ§ç¼ç  */
  code?: string;
  /** å±æ§æè¿° */
  description?: string;
  /** å±æ§ç±»å(1:ååå±æ§,2:SKUå±æ§,3:SKUå±æ§å¼,4:è§æ ¼åæ°) */
  type?: 'CATEGORY' | 'PRODUCT_ATTRIBUTE' | 'SKU_ATTRIBUTE';
  /** åå®¹ç±»å(å¦:ååãä¼åãæ°é»ç­) */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** å³èåå®¹ID(å¤é®å³èå¯¹åºå®ä½çID) */
  contentId?: number;
  /** æå±åç±»ID */
  categoryId?: number;
  /** å±æ§å¼ */
  attributeValue?: string;
  /** æåºæé */
  sortWeight?: number;
  /** æ¯å¦å¿å¡«(0:å¦,1:æ¯) */
  required?: number;
  /** å±æ§ç¶æ(1:å¯ç¨,2:ç¦ç¨,3:å é¤) */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
