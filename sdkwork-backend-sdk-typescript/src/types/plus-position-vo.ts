/** Position VO */
export interface PlusPositionVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Parent ID */
  parentId?: number;
  /** Name */
  name?: string;
  /** Description */
  description?: string;
  /** Owner */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** Owner ID */
  ownerId?: number;
  /** Code */
  code?: string;
  /** Level */
  level?: number;
  /** Sort order */
  sortOrder?: number;
  /** Is active */
  isActive?: boolean;
  /** Organization name */
  organizationName?: string;
  /** Member IDs */
  memberIds?: number[];
}
