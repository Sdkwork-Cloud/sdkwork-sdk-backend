import type { PageableObject } from './pageable-object';
import type { PlusNotificationVO } from './plus-notification-vo';
import type { SortObject } from './sort-object';

export interface PagePlusNotificationVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusNotificationVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
