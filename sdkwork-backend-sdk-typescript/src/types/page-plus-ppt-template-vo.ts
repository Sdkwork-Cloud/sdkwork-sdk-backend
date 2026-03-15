import type { PageableObject } from './pageable-object';
import type { PlusPptTemplateVO } from './plus-ppt-template-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPptTemplateVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPptTemplateVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
