/** ä¼åå¡æ©å±è¡¨VOï¼å­å¨ä¼åå¡ä¸å±å±æ§ */
export interface PlusMemberCardVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¼åç­çº§ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** å³èçåºç¡å¡å¸ID */
  cardId?: number;
  /** æ¯å¦æ¯æç§¯å */
  supplyBonus?: boolean;
  /** æ¯å¦æ¯æå¨å¼ */
  supplyBalance?: boolean;
  /** ç§¯ååç§°ï¼å¦âç§¯åâï¼ */
  bonusName?: string;
  /** å¨å¼åç§° */
  balanceName?: string;
  /** ä¼åç¹æè¯´æ */
  prerogative?: string;
  /** æ¯å¦èªå¨æ¿æ´» */
  autoActivate?: boolean;
  /** æ¯å¦ä¸é®æ¿æ´» */
  wxActivate?: boolean;
  /** æ¶è´¹éé¢ï¼åä½ï¼åï¼è·åç§¯å */
  costMoneyUnit?: number;
  /** æ¯è±è´¹costMoneyUnitæå¾ç§¯åæ° */
  increaseBonus?: number;
  /** åå§èµ éç§¯å */
  initIncreaseBonus?: number;
  /** åæ¬¡æå¤§èµ éç§¯åä¸é */
  maxIncreaseBonus?: number;
  /** æ¶èç§¯åçæå°åä½ */
  costBonusUnit?: number;
  /** ä½¿ç¨ç§¯åæµæ£éé¢ï¼åä½ï¼åï¼ */
  reduceMoney?: number;
  /** ä½¿ç¨ç§¯åæµæ£æ¶éæä½æ¶è´¹éé¢ï¼åä½ï¼åï¼ */
  leastMoneyToUseBonus?: number;
  /** æ¯æ¬¡ä½¿ç¨çç§¯åæµæ£ä¸é */
  maxReduceBonus?: number;
}
