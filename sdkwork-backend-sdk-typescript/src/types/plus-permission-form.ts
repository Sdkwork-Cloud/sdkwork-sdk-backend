/** RBAC Permission Form (stores system permission metadata for data transfer and validation) */
export interface PlusPermissionForm {
  /** Permission display name (human-readable identifier) */
  name: string;
  /** Permission unique code (programmatic identifier) */
  code: string;
  /** Permission description (functional details) */
  description?: string;
  /** Permission status (ENABLED=1, DISABLED=0) */
  status: 'ACTIVE' | 'INACTIVE';
  /** Display sort order (lower values appear first) */
  sortOrder?: number;
  /** Associated resource URL (for web/api permissions) */
  resourceUrl?: string;
  /** HTTP method (for API permissions, empty for menu permissions) */
  httpMethod?: string;
}
