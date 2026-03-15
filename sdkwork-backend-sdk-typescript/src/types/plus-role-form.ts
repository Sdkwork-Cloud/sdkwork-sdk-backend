/** Role creation form */
export interface PlusRoleForm {
  /** Role code */
  code: string;
  /** Role name */
  name: string;
  /** Role description */
  description?: string;
  /** Role status */
  status: 'ACTIVE' | 'INACTIVE';
}
