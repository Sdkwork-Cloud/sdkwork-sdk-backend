import type { PageableObject } from './pageable-object';
import type { PlusNotesVO } from './plus-notes-vo';
import type { SortObject } from './sort-object';

export interface PagePlusNotesVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusNotesVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
