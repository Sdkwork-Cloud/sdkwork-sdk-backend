import type { PageableObject } from './pageable-object';
import type { PlusPptTemplateVO } from './plus-ppt-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPptTemplateVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusPptTemplateVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
