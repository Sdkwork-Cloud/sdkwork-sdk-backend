import type { PlusFileObject } from './plus-file-object';
import type { TagsContent } from './tags-content';

export interface PlusProjectObject {
  name?: string;
  id?: string;
  type?: 'NONE' | 'SDK' | 'PPT' | 'APP_HTML' | 'APP_VUE' | 'APP_FLUTTER' | 'APP_UNIAPP' | 'APP_REACT' | 'APP_UNITY' | 'VIDEO' | 'POSTER';
  owner?: 'DEFAULT' | 'USER' | 'PROJECT' | 'TENANT' | 'SYSTEM' | 'ORGANIZATION';
  lastModifiedTime?: string;
  version?: string;
  description?: string;
  diskId?: number;
  tags?: TagsContent;
  createdAt?: string;
  title?: string;
  author?: string;
  files?: PlusFileObject[];
  uuid?: string;
  ownerId?: number;
  screenType?: 'PHONE' | 'TABLET' | 'LAPTOP' | 'DESKTOP' | 'TV';
}
