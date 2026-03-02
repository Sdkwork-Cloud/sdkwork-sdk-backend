export interface PlusDiskObject {
  id?: number;
  uuid?: string;
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  ownerId?: number;
  name?: string;
  type?: 'DEFAULT' | 'LOCAL' | 'CLOUD' | 'DISTRIBUTED' | 'SHARED' | 'UPLOAD' | 'AI' | 'KNOWLEDGE_BASE' | 'RESOURCE' | 'PROJECT' | 'TEMPLATE';
  description?: string;
  diskSize?: number;
  usedSize?: number;
}
