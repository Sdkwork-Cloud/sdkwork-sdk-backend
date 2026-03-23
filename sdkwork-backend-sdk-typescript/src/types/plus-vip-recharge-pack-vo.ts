/** VIPåå¼å¥é¤VOå¯¹è±¡ */
export interface PlusVipRechargePackVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** å¥é¤ID */
  id?: number;
  /** å¥é¤åç§° */
  name?: string;
  /** å¥é¤æè¿° */
  description?: string;
  /** å¥é¤ä»·æ ¼(å) */
  price?: number;
  /** èµ éçµç¹æ°é */
  pointAmount?: number;
  /** VIPæ¶é¿(å¤©) */
  vipDurationDays?: number;
  /** å¥é¤ç¶æ(1-ä¸æ¶ 2-ä¸æ¶) */
  status?: number;
  /** æåºæé */
  sortWeight?: number;
  /** å¥é¤æææå¼å§æ¶é´ */
  validFrom?: string;
  /** å¥é¤æææç»ææ¶é´ */
  validTo?: string;
  /** å¤æ³¨ä¿¡æ¯ */
  remark?: string;
}
