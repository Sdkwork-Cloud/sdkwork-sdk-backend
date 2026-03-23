/** ç³»ç»è§è²VOç±» */
export interface PlusRoleVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** è§è²ID */
  id?: number;
  /** è§è²ç¼ç (å¯ä¸) */
  code?: string;
  /** è§è²åç§° */
  name?: string;
  /** è§è²æè¿° */
  description?: string;
  /** è§è²ç¶æ(ACTIVE:æ´»è·,INACTIVE:æªæ¿æ´»,LOCKED:éå®) */
  status?: 'ACTIVE' | 'INACTIVE';
}
