import type { PageableObject } from './pageable-object';
import type { PlusFeedbackVO } from './plus-feedback-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFeedbackVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusFeedbackVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
