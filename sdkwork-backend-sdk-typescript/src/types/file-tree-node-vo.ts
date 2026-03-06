/** File directory tree node VO */
export interface FileTreeNodeVO {
  /** File ID */
  id?: number;
  /** File UUID */
  uuid?: string;
  /** File name */
  name?: string;
  /** File type */
  type?: string;
  /** Is directory */
  isDirectory?: boolean;
  /** File path */
  path?: string;
  /** Relative path */
  relativePath?: string;
  /** File size (bytes) */
  size?: number;
  /** File content (only valid for file type) */
  content?: string;
  /** Parent directory ID */
  parentId?: number;
  /** Child node list (only valid for directory type) */
  children?: FileTreeNodeVO[];
  /** Created at */
  createdAt?: string;
  /** Updated at */
  updatedAt?: string;
  /** Extension */
  extension?: string;
  /** Description */
  description?: string;
  /** Is read only */
  readOnly?: boolean;
}
