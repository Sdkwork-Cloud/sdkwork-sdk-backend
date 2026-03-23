import type { PageableObject } from './pageable-object';
import type { PlusCardTemplateVO } from './plus-card-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusCardTemplateVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusCardTemplateVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
