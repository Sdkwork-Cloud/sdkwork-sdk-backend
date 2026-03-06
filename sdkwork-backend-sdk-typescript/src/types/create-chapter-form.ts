/** Form for creating a chapter or directory */
export interface CreateChapterForm {
  /** Content work ID */
  contentWorkId: number;
  /** Parent directory ID */
  parentDirectoryId?: number;
  /** File name */
  fileName: string;
  /** Is directory */
  isDirectory?: boolean;
  /** Content */
  content?: string;
}
