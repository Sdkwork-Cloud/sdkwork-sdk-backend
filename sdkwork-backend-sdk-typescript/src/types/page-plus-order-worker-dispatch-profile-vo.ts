import type { PageableObject } from './pageable-object';
import type { PlusOrderWorkerDispatchProfileVO } from './plus-order-worker-dispatch-profile-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderWorkerDispatchProfileVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusOrderWorkerDispatchProfileVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
