/** Organization Member VO */
export interface PlusOrganizationMemberVO {
  /** Created at */
  createdAt?: string;
  /** Updated at */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** User ID */
  userId?: number;
  /** Owner */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** Owner ID */
  ownerId?: number;
  /** Is active */
  isActive?: boolean;
  /** Joined at */
  joinedAt?: string;
  /** Left at */
  leftAt?: string;
  /** Remark */
  remark?: string;
  /** Department IDs */
  departmentIds?: number[];
  /** Position IDs */
  positionIds?: number[];
  /** Role IDs */
  roleIds?: number[];
  /** Primary department ID */
  primaryDepartmentId?: number;
  /** Primary position ID */
  primaryPositionId?: number;
  /** Is valid */
  valid?: boolean;
}
