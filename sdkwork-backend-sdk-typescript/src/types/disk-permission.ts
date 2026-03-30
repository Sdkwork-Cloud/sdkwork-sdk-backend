export interface DiskPermission {
  permissions?: ('READ' | 'WRITE' | 'MANAGE')[];
  permissionSet?: ('READ' | 'WRITE' | 'MANAGE')[];
}
