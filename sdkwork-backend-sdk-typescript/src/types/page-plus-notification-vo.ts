import type { PageableObject } from './pageable-object';
import type { PlusNotificationVO } from './plus-notification-vo';
import type { SortObject } from './sort-object';

export interface PagePlusNotificationVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusNotificationVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
