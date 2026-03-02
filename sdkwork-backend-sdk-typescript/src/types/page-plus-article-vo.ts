import type { PageableObject } from './pageable-object';
import type { PlusArticleVO } from './plus-article-vo';
import type { SortObject } from './sort-object';

export interface PagePlusArticleVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusArticleVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
