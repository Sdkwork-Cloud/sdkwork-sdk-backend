import type { PageableObject } from './pageable-object';
import type { PlusNotificationVO } from './plus-notification-vo';
import type { SortObject } from './sort-object';

export interface PagePlusNotificationVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusNotificationVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
