/** User creation form */
export interface PlusUserForm {
  /** Username */
  username: string;
  /** Password */
  password?: string;
  /** Password salt */
  salt?: string;
  /** Email */
  email?: string;
  /** Phone number */
  phone?: string;
  /** User status */
  status: 'ACTIVE' | 'INACTIVE';
  /** Assigned role IDs */
  roleIds?: number[];
}
