import type { ImageMediaResource } from './image-media-resource';

/** Notes VO */
export interface PlusNotesVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Title */
  title?: string;
  /** Content */
  content?: string;
  /** User ID */
  userId?: number;
  /** User name */
  userName?: string;
  /** Category ID */
  categoryId?: number;
  /** Category name */
  categoryName?: string;
  /** Tags */
  tags?: string;
  /** Access scope */
  accessScope?: 'DEFAULT' | 'PRIVATE' | 'PROTECTED' | 'ORGANIZATION' | 'PUBLIC';
  /** Password */
  password?: string;
  /** Cover image */
  coverImage?: ImageMediaResource;
  /** Status */
  status?: string;
  /** Remark */
  remark?: string;
  /** Disk ID */
  diskId?: number;
  /** Parent ID */
  parentId?: number;
  /** Type (FILE/DIRECTORY) */
  type?: string;
  /** Path */
  path?: string;
  /** Relative path */
  relativePath?: string;
}
