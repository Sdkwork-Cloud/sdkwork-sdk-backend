import type { PageableObject } from './pageable-object';
import type { PlusCardTemplateVO } from './plus-card-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCardTemplateVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCardTemplateVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
