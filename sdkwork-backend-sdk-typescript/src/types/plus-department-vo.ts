/** Department VO */
export interface PlusDepartmentVO {
  /** Created at */
  createdAt?: string;
  /** Updated at */
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
  /** Sort order */
  sortOrder?: number;
  /** Is active */
  isActive?: boolean;
  /** Organization ID */
  organizationId?: number;
  /** Member IDs */
  memberIds?: number[];
}
