import type { PageableObject } from './pageable-object';
import type { PlusParticipantVO } from './plus-participant-vo';
import type { SortObject } from './sort-object';

export interface PagePlusParticipantVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusParticipantVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
