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
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
