/** Member Relations VO */
export interface PlusMemberRelationsVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Member ID */
  memberId?: number;
  /** Owner type */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** Owner ID */
  ownerId?: number;
  /** Relation type (DEPARTMENT, POSITION, ROLE) */
  type?: 'DEPARTMENT' | 'POSITION' | 'ROLE';
  /** Parent ID */
  parentId?: number;
  /** Target ID */
  targetId?: number;
  /** Is primary */
  isPrimary?: boolean;
  /** Is active */
  isActive?: boolean;
  /** Effective at */
  effectiveAt?: string;
  /** Expired at */
  expiredAt?: string;
  /** Sort order */
  sortOrder?: number;
  /** Remark */
  remark?: string;
}
