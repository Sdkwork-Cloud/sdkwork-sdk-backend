import type { PageableObject } from './pageable-object';
import type { PlusPptTemplateSlideVO } from './plus-ppt-template-slide-vo';
import type { SortObject } from './sort-object';

export interface PagePlusPptTemplateSlideVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusPptTemplateSlideVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
