import type { PageableObject } from './pageable-object';
import type { PlusWorkspaceVO } from './plus-workspace-vo';
import type { SortObject } from './sort-object';

export interface PagePlusWorkspaceVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusWorkspaceVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
