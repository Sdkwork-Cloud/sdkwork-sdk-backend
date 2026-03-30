import type { PageableObject } from './pageable-object';
import type { PlusKnowledgeBaseVO } from './plus-knowledge-base-vo';
import type { SortObject } from './sort-object';

export interface PagePlusKnowledgeBaseVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusKnowledgeBaseVO[];
  number?: number;
  numberOfElements?: number;
  first?: boolean;
  last?: boolean;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
