import type { TagsContent } from './tags-content';

/** 文件对象DTO */
export interface PlusFileObject {
  /** 文件ID */
  id?: number;
  /** 文件UUID */
  uuid?: string;
  /** 网盘ID */
  diskId?: number;
  /** 文件名 */
  name?: string;
  /** 文件大小（字节） */
  size?: number;
  /** 文件路径 */
  path?: string;
  /** 相对路径 */
  relativePath?: string;
  /** 文件类型 */
  type?: 'DEFAULT' | 'FILE' | 'DIRECTORY';
  /** 文件扩展名 */
  extension?: string;
  /** 最后修改时间 */
  lastModifiedTime?: string;
  /** 创建时间 */
  createdAt?: string;
  /** 文件版本 */
  versionId?: string;
  /** 文件描述 */
  description?: string;
  /** 项目UUID */
  projectUuid?: string;
  /** 项目ID */
  projectId?: number;
  /** 文件所有者类型 */
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  /** 文件所有者ID */
  ownerId?: number;
  /** 文件作者 */
  author?: string;
  /** 提示词内容 */
  prompt?: string;
  /** 文件内容 */
  content?: string;
  /** 文件标签 */
  tags?: TagsContent;
  /** 是否只读 */
  readonly?: boolean;
  /** 文件权限 */
  permission?: 'OWNER_READ' | 'OWNER_WRITE' | 'OWNER_EXECUTE' | 'GROUP_READ' | 'GROUP_WRITE' | 'GROUP_EXECUTE' | 'OTHERS_READ' | 'OTHERS_WRITE' | 'OTHERS_EXECUTE'[];
  /** 引用文件ID */
  referenceFileId?: number;
  /** 子文件列表 */
  children?: PlusFileObject[];
}
