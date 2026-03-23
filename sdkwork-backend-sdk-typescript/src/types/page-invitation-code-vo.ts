import type { InvitationCodeVO } from './invitation-code-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageInvitationCodeVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: InvitationCodeVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
