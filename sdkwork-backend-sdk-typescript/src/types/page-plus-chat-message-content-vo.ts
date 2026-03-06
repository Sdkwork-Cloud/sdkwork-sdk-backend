import type { PageableObject } from './pageable-object';
import type { PlusChatMessageContentVO } from './plus-chat-message-content-vo';
import type { SortObject } from './sort-object';

export interface PagePlusChatMessageContentVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusChatMessageContentVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
