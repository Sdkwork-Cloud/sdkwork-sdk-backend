import type { FileItemVO } from './file-item-vo';

/** File list view object */
export interface FileListVO {
  /** File list */
  data?: FileItemVO[];
  /** Object type */
  object?: string;
}
