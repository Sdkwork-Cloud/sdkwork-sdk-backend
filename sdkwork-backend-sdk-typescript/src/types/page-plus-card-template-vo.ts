import type { PageableObject } from './pageable-object';
import type { PlusCardTemplateVO } from './plus-card-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCardTemplateVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusCardTemplateVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
