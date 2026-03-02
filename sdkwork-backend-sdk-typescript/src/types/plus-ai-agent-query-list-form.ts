export interface PlusAiAgentQueryListForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  userId?: number;
  keyword?: string;
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED' | 'DRAFT';
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
}
