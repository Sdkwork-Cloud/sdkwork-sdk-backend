import type { PageableObject } from './pageable-object';
import type { PlusGameRoomSeatVO } from './plus-game-room-seat-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameRoomSeatVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusGameRoomSeatVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
