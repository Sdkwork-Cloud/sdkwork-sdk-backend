/** File disk creation form */
export interface PlusDiskForm {
  /** Disk name */
  name: string;
  /** Disk type */
  type: 'DEFAULT' | 'LOCAL' | 'CLOUD' | 'DISTRIBUTED' | 'SHARED' | 'UPLOAD' | 'AI' | 'KNOWLEDGE_BASE' | 'RESOURCE' | 'PROJECT' | 'TEMPLATE';
  /** Owner type */
  owner: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** Owner ID */
  ownerId: number;
  /** Disk size in bytes */
  diskSize: number;
  /** Used size in bytes */
  usedSize?: number;
  /** Description */
  description?: string;
}
