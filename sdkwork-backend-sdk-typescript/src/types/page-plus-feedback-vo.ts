import type { PageableObject } from './pageable-object';
import type { PlusFeedbackVO } from './plus-feedback-vo';
import type { SortObject } from './sort-object';

export interface PagePlusFeedbackVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusFeedbackVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
