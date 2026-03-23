import type { FileContentObject } from './file-content-object';
import type { FileMediaResource } from './file-media-resource';
import type { FilePermission } from './file-permission';
import type { PlusTreeParentMetadata } from './plus-tree-parent-metadata';
import type { TagsContent } from './tags-content';

/** æä»¶VOç±»ï¼ç¨äºå­å¨æä»¶çåæ°æ®ä¿¡æ¯ */
export interface PlusFileVO {
  parentUuid?: string;
  parentMetadata?: PlusTreeParentMetadata;
  /** æä»¶ID */
  id?: number;
  /** ç¶èç¹ID */
  parentId?: number;
  /** æä»¶åç§° */
  name?: string;
  /** æä»¶è·¯å¾ */
  path?: string;
  /** æä»¶å®æ´è·¯å¾ */
  fullPath?: string;
  /** å­å¨é® */
  objectKey?: string;
  /** æä»¶å¤§å°ï¼å­èï¼ */
  size?: number;
  /** æä»¶åå®¹ç±»å */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** æä»¶æ©å±å */
  extension?: string;
  /** æä»¶çå­å¨ç±»å« */
  storageClass?: 'STANDARD' | 'REDUCED_REDUNDANCY' | 'STANDARD_IA' | 'ONEZONE_IA' | 'INTELLIGENT_TIERING' | 'GLACIER' | 'DEEP_ARCHIVE';
  /** æä»¶ççæ¬ID */
  versionId?: string;
  /** File resource */
  resource?: FileMediaResource;
  /** æä»¶çè®¿é®URL */
  url?: string;
  /** æä»¶ä¸ä¼ æ¶é´ */
  uploadTime?: string;
  /** æä»¶æåè®¿é®æ¶é´ */
  lastAccessTime?: string;
  /** æä»¶æè¿° */
  description?: string;
  /** æä»¶æ ç­¾ */
  tags?: TagsContent;
  /** æä»¶ç±»å */
  fileType?: 'DEFAULT' | 'FILE' | 'DIRECTORY';
  /** æä»¶åç±» */
  fileCategory?: 'UNKNOWN' | 'DOCUMENT' | 'IMAGE' | 'VIDEO' | 'AUDIO' | 'ARCHIVE' | 'CODE' | 'DATA' | 'PROJECT' | 'OTHER';
  /** File permissions */
  permission?: FilePermission;
  /** æ¯å¦ä¸ºå¬å¼è®¿é® */
  isPublic?: boolean;
  /** ç½®é¡¶æ¶é´ */
  pinnedAt?: string;
  /** æä»¶ç¶æ */
  status?: 'NORMAL' | 'DELETED' | 'ARCHIVED';
  /** æä»¶æä»¶åå®¹ */
  content?: FileContentObject;
  etag?: string;
}
