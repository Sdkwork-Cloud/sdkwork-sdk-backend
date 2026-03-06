import type { PageableObject } from './pageable-object';
import type { PlusNotesVO } from './plus-notes-vo';
import type { SortObject } from './sort-object';

export interface PagePlusNotesVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusNotesVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
