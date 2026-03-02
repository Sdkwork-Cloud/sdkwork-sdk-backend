/** Organization member creation form */
export interface PlusOrganizationMemberForm {
  /** User ID */
  userId: number;
  /** Owner type */
  owner: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** Organization ID */
  ownerId: number;
  /** Is active */
  isActive?: boolean;
  /** Joined at */
  joinedAt?: string;
  /** Left at */
  leftAt?: string;
  /** Remark */
  remark?: string;
}
