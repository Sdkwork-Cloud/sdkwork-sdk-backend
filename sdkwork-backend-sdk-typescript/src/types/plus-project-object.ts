import type { PlusFileObject } from './plus-file-object';
import type { TagsContent } from './tags-content';

export interface PlusProjectObject {
  name?: string;
  id?: string;
  type?: 'NONE' | 'SDK' | 'PPT' | 'APP_HTML' | 'APP_VUE' | 'APP_FLUTTER' | 'APP_UNIAPP' | 'APP_REACT' | 'APP_UNITY' | 'VIDEO' | 'POSTER';
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  lastModifiedTime?: string;
  version?: string;
  tags?: TagsContent;
  description?: string;
  title?: string;
  screenType?: 'PHONE' | 'TABLET' | 'LAPTOP' | 'DESKTOP' | 'TV';
  ownerId?: number;
  uuid?: string;
  author?: string;
  createdAt?: string;
  diskId?: number;
  files?: PlusFileObject[];
}
