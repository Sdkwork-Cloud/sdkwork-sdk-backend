import type { PageableObject } from './pageable-object';
import type { PlusPptTemplateSlideVO } from './plus-ppt-template-slide-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPptTemplateSlideVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusPptTemplateSlideVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
