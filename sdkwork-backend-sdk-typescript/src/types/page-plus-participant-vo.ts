import type { PageableObject } from './pageable-object';
import type { PlusParticipantVO } from './plus-participant-vo';
import type { SortObject } from './sort-object';

export interface PagePlusParticipantVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusParticipantVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
