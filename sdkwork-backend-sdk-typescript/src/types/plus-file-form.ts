import type { FileMediaResource } from './file-media-resource';
import type { TagsContent } from './tags-content';

/** File creation form */
export interface PlusFileForm {
  /** Parent file ID */
  parentId?: number;
  /** File name */
  name: string;
  /** File path */
  path?: string;
  /** Object storage key */
  objectKey?: string;
  /** File size in bytes */
  size?: number;
  /** File content type */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** Storage class */
  storageClass?: 'STANDARD' | 'REDUCED_REDUNDANCY' | 'STANDARD_IA' | 'ONEZONE_IA' | 'INTELLIGENT_TIERING' | 'GLACIER' | 'DEEP_ARCHIVE';
  /** Version ID */
  versionId?: string;
  /** File resource */
  resource?: FileMediaResource;
  /** Upload time */
  uploadTime?: string;
  /** Last access time */
  lastAccessTime?: string;
  /** File description */
  description?: string;
  /** Tags */
  tags?: TagsContent;
  /** File type */
  fileType: 'DEFAULT' | 'FILE' | 'DIRECTORY';
  /** File category */
  fileCategory?: 'UNKNOWN' | 'DOCUMENT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'ARCHIVE' | 'CODE' | 'DATA' | 'PROJECT' | 'OTHER';
  /** File status */
  status?: 'NORMAL' | 'DELETED' | 'ARCHIVED';
  etag?: string;
}
