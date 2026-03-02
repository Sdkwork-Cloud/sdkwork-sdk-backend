/** Department creation form */
export interface PlusDepartmentForm {
  /** Department name */
  name: string;
  /** Description */
  description?: string;
  /** Owner type */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** Owner ID */
  ownerId: number;
  /** Department code */
  code?: string;
  /** Sort order */
  sortOrder?: number;
  /** Is active */
  isActive?: boolean;
  /** Parent department ID */
  parentId?: number;
}
