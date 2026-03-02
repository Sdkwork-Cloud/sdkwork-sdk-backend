import type { FileContentObject } from './file-content-object';

/** File content creation form */
export interface PlusFileContentForm {
  /** Associated file ID (foreign key to plus_file.id) */
  fileId: number;
  /** Associated file UUID (foreign key to plus_file.uuid) */
  fileUuid: string;
  /** Prompt text */
  prompt?: string;
  /** File encoding format (e.g., UTF-8, GBK, ISO-8859-1) */
  encoding?: string;
  /** File text content */
  content?: FileContentObject;
}
