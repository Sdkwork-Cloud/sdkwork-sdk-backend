import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';

/** Article creation form */
export interface PlusArticleForm {
  /** Article title */
  title: string;
  /** Article subtitle */
  subtitle?: string;
  /** Article content */
  content: string;
  /** Category ID */
  categoryId: number;
  /** Word count */
  wordCount?: number;
  /** Reading time in minutes */
  readingTime?: number;
  /** Cover images */
  coverImages?: ImageMediaResourceList;
  /** Author */
  author?: AuthorInfo;
  /** Source */
  source?: string;
  /** Article status */
  status: 'DEFAULT' | 'DRAFT' | 'PUBLISHED' | 'ARCHIVED' | 'DELETED';
  /** Keywords */
  keywords?: string[];
  /** Summary */
  summary?: string;
}
