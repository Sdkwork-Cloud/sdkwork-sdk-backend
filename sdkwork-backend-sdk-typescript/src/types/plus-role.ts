import type { PlusPermission } from './plus-permission';

export interface PlusRole {
  tenantId?: number;
  organizationId?: number;
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  v?: number;
  code?: string;
  name?: string;
  description?: string;
  status?: 'ACTIVE' | 'INACTIVE';
  permissions?: PlusPermission[];
  permissionCodes?: string[];
}
