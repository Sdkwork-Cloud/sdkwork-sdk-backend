import type { ImageMediaResource } from './image-media-resource';
import type { TagsContent } from './tags-content';

/** Notes form */
export interface PlusNotesForm {
  /** I d */
  id?: number;
  /** Title */
  title: string;
  /** Content */
  content?: string;
  /** User ID */
  userId: number;
  /** Category ID */
  categoryId?: number;
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
  tagsAsTagsContent?: TagsContent;
}
