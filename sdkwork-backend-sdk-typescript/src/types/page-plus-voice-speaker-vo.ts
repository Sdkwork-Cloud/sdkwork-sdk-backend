import type { PageableObject } from './pageable-object';
import type { PlusVoiceSpeakerVO } from './plus-voice-speaker-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVoiceSpeakerVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVoiceSpeakerVO[];
  number?: number;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  numberOfElements?: number;
  pageable?: PageableObject;
  empty?: boolean;
}
