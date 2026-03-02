import type { PageableObject } from './pageable-object';
import type { PlusWorkspaceVO } from './plus-workspace-vo';
import type { SortObject } from './sort-object';

export interface PagePlusWorkspaceVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusWorkspaceVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
