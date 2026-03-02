export interface FilePermission {
  permissions?: 'OWNER_READ' | 'OWNER_WRITE' | 'OWNER_EXECUTE' | 'GROUP_READ' | 'GROUP_WRITE' | 'GROUP_EXECUTE' | 'OTHERS_READ' | 'OTHERS_WRITE' | 'OTHERS_EXECUTE'[];
  readOnly?: boolean;
  permissionSet?: 'OWNER_READ' | 'OWNER_WRITE' | 'OWNER_EXECUTE' | 'GROUP_READ' | 'GROUP_WRITE' | 'GROUP_EXECUTE' | 'OTHERS_READ' | 'OTHERS_WRITE' | 'OTHERS_EXECUTE'[];
}
