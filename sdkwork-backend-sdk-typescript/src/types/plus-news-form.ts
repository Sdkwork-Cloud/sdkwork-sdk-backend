import type { TagsContent } from './tags-content';

/** News creation form */
export interface PlusNewsForm {
  /** News title */
  title: string;
  /** News URL */
  url?: string;
  /** News source */
  source?: string;
  /** Summary */
  summary?: string;
  /** Publish time */
  publishTime?: string;
  /** Tags */
  tags?: TagsContent;
  /** Category ID */
  categoryId: number;
  /** User ID */
  userId?: number;
}
