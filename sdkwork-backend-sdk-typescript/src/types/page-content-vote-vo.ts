import type { ContentVoteVO } from './content-vote-vo';
import type { PageableObject } from './pageable-object';
import type { SortObject } from './sort-object';

export interface PageContentVoteVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: ContentVoteVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
