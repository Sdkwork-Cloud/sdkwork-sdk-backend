import type { FileMediaResource } from './file-media-resource';
import type { TagsContent } from './tags-content';

/** File creation form */
export interface PlusFileForm {
  /** 文件名称 */
  name: string;
  /** 文件路径 */
  path?: string;
  /** 存储键（对象存储中的唯一标识符） */
  objectKey?: string;
  /** 文件大小（字节） */
  size?: number;
  /** 文件内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 文件扩展名 */
  extension?: string;
  /** 文件的存储类别 */
  storageClass?: 'STANDARD' | 'REDUCED_REDUNDANCY' | 'STANDARD_IA' | 'ONEZONE_IA' | 'INTELLIGENT_TIERING' | 'GLACIER' | 'DEEP_ARCHIVE';
  /** 文件的版本ID */
  versionId?: string;
  /** File resource */
  resource?: FileMediaResource;
  /** 文件上传时间 */
  uploadTime?: string;
  /** 文件最后访问时间 */
  lastAccessTime?: string;
  /** 文件描述 */
  description?: string;
  /** 文件标签 */
  tags?: TagsContent;
  /** 文件类型 */
  fileType: 'DEFAULT' | 'FILE' | 'DIRECTORY';
  /** 文件分类 */
  fileCategory?: 'UNKNOWN' | 'DOCUMENT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'ARCHIVE' | 'CODE' | 'DATA' | 'PROJECT' | 'OTHER';
  /** 是否为公开访问 */
  isPublic: boolean;
  /** 文件状态 */
  status: 'NORMAL' | 'DELETED' | 'ARCHIVED';
  /** 父节点ID */
  parentId?: number;
  etag?: string;
}
