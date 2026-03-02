/** Role-permission association creation form */
export interface PlusRolePermissionForm {
  /** Role ID (foreign key reference to plus_role.id) */
  roleId: number;
  /** Role UUID (unique identifier for distributed system references) */
  roleUuid: string;
  /** Permission ID (foreign key reference to plus_permission.id) */
  permissionId: number;
  /** Permission UUID (unique identifier for distributed system references) */
  permissionUuid: string;
  /** Permission assignment status (1=Enabled, 0=Disabled) */
  enabled: boolean;
  /** Permission assignment description (business context and purpose) */
  description?: string;
  /** Assigner user ID (operator who assigned the permission) */
  operatorId?: number;
}
