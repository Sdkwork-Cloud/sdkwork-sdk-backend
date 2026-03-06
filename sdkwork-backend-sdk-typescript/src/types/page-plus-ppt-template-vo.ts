import type { PageableObject } from './pageable-object';
import type { PlusPptTemplateVO } from './plus-ppt-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPptTemplateVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPptTemplateVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
