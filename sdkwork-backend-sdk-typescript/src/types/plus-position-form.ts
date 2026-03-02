/** Position creation form */
export interface PlusPositionForm {
  /** Parent node ID */
  parentId?: number;
  /** Position name */
  name: string;
  /** Position description */
  description?: string;
  /** Owner type */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** Organization ID */
  ownerId: number;
  /** Position code */
  code?: string;
  /** Position level */
  level?: number;
  /** Sort order */
  sortOrder?: number;
  /** Is active */
  isActive?: boolean;
}
