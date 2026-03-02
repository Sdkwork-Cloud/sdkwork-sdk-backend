import type { PageableObject } from './pageable-object';
import type { PlusAiPromptVO } from './plus-ai-prompt-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiPromptVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusAiPromptVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
