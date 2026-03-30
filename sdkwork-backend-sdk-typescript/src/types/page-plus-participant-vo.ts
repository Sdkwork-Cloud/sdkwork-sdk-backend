import type { PageableObject } from './pageable-object';
import type { PlusParticipantVO } from './plus-participant-vo';
import type { SortObject } from './sort-object';

export interface PagePlusParticipantVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusParticipantVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
