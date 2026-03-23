/** Agent-tool relationship creation form */
export interface PlusAiAgentToolForm {
  /** éå® ä»é¨åIéé¸¿åæµ£æD */
  agentId: number;
  /** éå® ä»é¨åIå®¸ã¥å¿ID */
  toolId: number;
  /** å®¸ã¥å¿é¦ã¦æ«¤é³æç¶æ¶î æ®éºæç°­æ´å¿å½¿ */
  sortOrder?: number;
  /** å®¸ã¥å¿éîææ¦æ¨¿î»éîæ¤(true:éîæ¤,false:ç»ä½ºæ¤) */
  enabled: boolean;
}
