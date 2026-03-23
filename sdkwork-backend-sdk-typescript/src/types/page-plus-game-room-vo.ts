import type { PageableObject } from './pageable-object';
import type { PlusGameRoomVO } from './plus-game-room-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameRoomVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameRoomVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
