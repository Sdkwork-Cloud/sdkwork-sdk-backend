import type { PageableObject } from './pageable-object';
import type { PlusAiPromptVO } from './plus-ai-prompt-vo';
import type { SortObject } from './sort-object';

export interface PagePlusAiPromptVO {
  totalElements?: number;
  totalPages?: number;
  size?: number;
  content?: PlusAiPromptVO[];
  number?: number;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  sort?: SortObject;
  pageable?: PageableObject;
  empty?: boolean;
}
