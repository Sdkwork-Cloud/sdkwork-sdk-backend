/** AIæºè½ä½ä¸å·¥å·å³èå³ç³»VOç±»ï¼ç¨äºç»´æ¤AIæºè½ä½ä¸å·¥å·ä¹é´çå¤å¯¹å¤å³èå³ç³» */
export interface PlusAiAgentToolVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** å³èçAIæºè½ä½ID */
  agentId?: number;
  /** å³èçAIå·¥å·ID */
  toolId?: number;
  /** å·¥å·å¨æºè½ä½ä¸­çæåºåºå· */
  sortOrder?: number;
  /** å·¥å·æ¯å¦é»è®¤å¯ç¨(true:å¯ç¨,false:ç¦ç¨) */
  enabled?: boolean;
  /** AIæºè½ä½åç§° */
  agentName?: string;
  /** AIå·¥å·åç§° */
  toolName?: string;
}
