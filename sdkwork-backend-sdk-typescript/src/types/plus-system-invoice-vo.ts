/** ç³»ç»åç¥¨VO */
export interface PlusSystemInvoiceVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** ä¸å¡UUID */
  uuid?: string;
  /** åç¥¨æ¬å¤´ */
  title?: string;
  /** çº³ç¨äººè¯å«å· */
  taxId?: string;
  /** åç¥¨ç±»åï¼electronic|paper */
  type?: string;
  /** éé¢ */
  amount?: number;
  /** ç¶æï¼pending|issued|rejected */
  status?: string;
  /** å¼ç¥¨åå®¹ */
  content?: string;
  /** çµå­åç¥¨é®ç®± */
  email?: string;
  /** é®å¯å°å */
  address?: string;
  /** åå»ºæ¶é´ */
  createTime?: string;
}
