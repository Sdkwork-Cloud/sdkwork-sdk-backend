import type { PageableObject } from './pageable-object';
import type { PlusOAuthAppBindingVO } from './plus-oauth-app-binding-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOAuthAppBindingVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOAuthAppBindingVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
