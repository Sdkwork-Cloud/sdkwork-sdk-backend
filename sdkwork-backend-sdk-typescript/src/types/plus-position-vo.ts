/** Position VO */
export interface PlusPositionVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
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
