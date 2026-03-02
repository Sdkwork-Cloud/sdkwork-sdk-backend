export interface PlusVoiceSpeakerQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  userId?: number;
  keyword?: string;
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DEPRECATED';
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
}
