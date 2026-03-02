export interface PlusPermission {
  tenantId?: number;
  organizationId?: number;
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  v?: number;
  name?: string;
  code?: string;
  description?: string;
  status?: 'ACTIVE' | 'INACTIVE';
  sortOrder?: number;
  resourceUrl?: string;
  httpMethod?: string;
}
