import type { PageableObject } from './pageable-object';
import type { PlusArticleVO } from './plus-article-vo';
import type { SortObject } from './sort-object';

export interface PagePlusArticleVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusArticleVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
