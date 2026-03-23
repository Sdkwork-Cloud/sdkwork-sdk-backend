import type { PageableObject } from './pageable-object';
import type { PlusGameRoomSeatVO } from './plus-game-room-seat-vo';
import type { SortObject } from './sort-object';

export interface PagePlusGameRoomSeatVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusGameRoomSeatVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
