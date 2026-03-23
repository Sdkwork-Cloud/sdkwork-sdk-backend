import type { PageableObject } from './pageable-object';
import type { PlusArticleVO } from './plus-article-vo';
import type { SortObject } from './sort-object';

export interface PagePlusArticleVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusArticleVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
