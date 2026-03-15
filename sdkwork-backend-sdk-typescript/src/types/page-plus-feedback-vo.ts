import type { PageableObject } from './pageable-object';
import type { PlusFeedbackVO } from './plus-feedback-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFeedbackVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusFeedbackVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
