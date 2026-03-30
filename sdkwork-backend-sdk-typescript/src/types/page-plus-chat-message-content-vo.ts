import type { PageableObject } from './pageable-object';
import type { PlusChatMessageContentVO } from './plus-chat-message-content-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChatMessageContentVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusChatMessageContentVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
