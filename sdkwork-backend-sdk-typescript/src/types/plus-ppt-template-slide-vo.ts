/** PPTæ¨¡æ¿è¯¦æéç½®VOï¼å­å¨æ¨¡æ¿ä¸­åé¡µé¢/sectionçå·ä½éç½®ï¼ */
export interface PlusPptTemplateSlideVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å³èçPPTæ¨¡æ¿ID */
  templateId?: number;
  /** æ¨¡æ¿sectionæ é¢ï¼å¦'å°é¢é¡µ'ã'ç®å½é¡µ'ã'åå®¹é¡µ1'ç­ï¼ */
  sectionTitle?: string;
  /** æ¨¡æ¿sectionåå®¹æè¿°ï¼å¯åå«å ä½ç¬¦è¯´æï¼ */
  sectionContent?: string;
  /** é¡µç ï¼æ¨¡æ¿ä¸­çé¡µé¢åºå·ï¼ */
  pageNumber?: number;
  /** é¡µé¢å¸å±ç±»åï¼1-æ é¢é¡µ/2-åå®¹é¡µ/3-æ é¢+åå®¹/4-åæ åå®¹ï¼ */
  layoutType?: 'DEFAULT' | 'TITLE' | 'CONTENT' | 'TITLE_CONTENT' | 'COLUMN_CONTENT';
  /** èæ¯å¾çURL */
  backgroundImage?: string;
  /** æåºåºå·ï¼ç¨äºè°æ´sectionå¨æ¨¡æ¿ä¸­çå±ç¤ºé¡ºåºï¼ */
  sortOrder?: number;
  /** æ¯å¦å¿å¡«sectionï¼true-å¿å¡«/false-å¯éï¼ */
  isRequired?: boolean;
}
