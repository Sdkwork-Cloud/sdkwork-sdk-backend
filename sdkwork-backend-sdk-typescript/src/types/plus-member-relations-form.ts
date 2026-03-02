/** Member relation creation form */
export interface PlusMemberRelationsForm {
  /** Member ID */
  memberId: number;
  /** Owner type */
  owner: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** Owner ID */
  ownerId: number;
  /** Relation type (DEPARTMENT, POSITION, ROLE) */
  type: 'DEPARTMENT' | 'POSITION' | 'ROLE';
  /** Target ID */
  targetId: number;
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
  /** Created at */
  createdAt?: string;
  /** Updated at */
  updatedAt?: string;
}
