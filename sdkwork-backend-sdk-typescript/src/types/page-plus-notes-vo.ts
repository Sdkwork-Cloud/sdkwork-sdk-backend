import type { PageableObject } from './pageable-object';
import type { PlusNotesVO } from './plus-notes-vo';
import type { SortObject } from './sort-object';

export interface PagePlusNotesVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusNotesVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
