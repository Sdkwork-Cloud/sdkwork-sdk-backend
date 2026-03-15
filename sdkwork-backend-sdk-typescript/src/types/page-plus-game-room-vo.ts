import type { PageableObject } from './pageable-object';
import type { PlusGameRoomVO } from './plus-game-room-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameRoomVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameRoomVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
