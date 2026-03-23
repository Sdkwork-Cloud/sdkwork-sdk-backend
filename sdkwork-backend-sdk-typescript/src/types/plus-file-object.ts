import type { TagsContent } from './tags-content';

/** æä»¶å¯¹è±¡DTO */
export interface PlusFileObject {
  /** æä»¶ID */
  id?: number;
  /** æä»¶UUID */
  uuid?: string;
  /** ç½çID */
  diskId?: number;
  /** æä»¶å */
  name?: string;
  /** æä»¶å¤§å°ï¼å­èï¼ */
  size?: number;
  /** æä»¶è·¯å¾ */
  path?: string;
  /** ç¸å¯¹è·¯å¾ */
  relativePath?: string;
  /** æä»¶ç±»å */
  type?: 'DEFAULT' | 'FILE' | 'DIRECTORY';
  /** æä»¶æ©å±å */
  extension?: string;
  /** æåä¿®æ¹æ¶é´ */
  lastModifiedTime?: string;
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æä»¶çæ¬ */
  versionId?: string;
  /** æä»¶æè¿° */
  description?: string;
  /** é¡¹ç®UUID */
  projectUuid?: string;
  /** é¡¹ç®ID */
  projectId?: number;
  /** æä»¶ææèç±»å */
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** æä»¶ææèID */
  ownerId?: number;
  /** æä»¶ä½è */
  author?: string;
  /** æç¤ºè¯åå®¹ */
  prompt?: string;
  /** æä»¶åå®¹ */
  content?: string;
  /** æä»¶æ ç­¾ */
  tags?: TagsContent;
  /** æ¯å¦åªè¯» */
  readonly?: boolean;
  /** æä»¶æé */
  permission?: 'OWNER_READ' | 'OWNER_WRITE' | 'OWNER_EXECUTE' | 'GROUP_READ' | 'GROUP_WRITE' | 'GROUP_EXECUTE' | 'OTHERS_READ' | 'OTHERS_WRITE' | 'OTHERS_EXECUTE'[];
  /** å¼ç¨æä»¶ID */
  referenceFileId?: number;
  /** å­æä»¶åè¡¨ */
  children?: PlusFileObject[];
}
