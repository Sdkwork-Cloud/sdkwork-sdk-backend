import type { PageableObject } from './pageable-object';
import type { PlusPptTemplateVO } from './plus-ppt-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPptTemplateVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusPptTemplateVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
