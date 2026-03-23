/** VIPæçå®ä¹VO */
export interface PlusVipBenefitVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** æçID */
  id?: number;
  /** æçåç§°, e.g., 'æ¯æåè´¹çµç¹', 'ä¸å±å®¢æ' */
  name?: string;
  /** æççè¯¦ç»æè¿° */
  description?: string;
  /** æçæ è¯ç¬¦ï¼ç¨äºç¨åºåé¨è¯å« */
  benefitKey?: string;
  /** æçç±»åï¼ç¨äºç¨åºåé¨å¤ç */
  type?: 'DEFAULT' | 'MONTHLY_FREE_POINTS' | 'DEDICATED_SUPPORT' | 'PURCHASE_DISCOUNT' | 'EXCLUSIVE_CONTENT' | 'PRIORITY_SERVICE' | 'BIRTHDAY_GIFT';
}
