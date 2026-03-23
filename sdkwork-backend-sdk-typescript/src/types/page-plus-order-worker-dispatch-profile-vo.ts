import type { PageableObject } from './pageable-object';
import type { PlusOrderWorkerDispatchProfileVO } from './plus-order-worker-dispatch-profile-vo';
import type { SortObject } from './sort-object';

export interface PagePlusOrderWorkerDispatchProfileVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusOrderWorkerDispatchProfileVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
