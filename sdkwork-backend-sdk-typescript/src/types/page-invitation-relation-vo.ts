import type { InvitationRelationVO } from './invitation-relation-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageInvitationRelationVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: InvitationRelationVO[];
  number?: number;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
