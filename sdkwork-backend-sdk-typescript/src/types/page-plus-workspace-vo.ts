import type { PageableObject } from './pageable-object';
import type { PlusWorkspaceVO } from './plus-workspace-vo';
import type { SortObject } from './sort-object';

export interface PagePlusWorkspaceVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusWorkspaceVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
