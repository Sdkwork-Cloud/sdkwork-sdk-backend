import type { InvitationRelationVO } from './invitation-relation-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageInvitationRelationVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: InvitationRelationVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
