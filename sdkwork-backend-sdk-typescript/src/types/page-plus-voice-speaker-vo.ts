import type { PageableObject } from './pageable-object';
import type { PlusVoiceSpeakerVO } from './plus-voice-speaker-vo';
import type { SortObject } from './sort-object';

export interface PagePlusVoiceSpeakerVO {
  totalPages?: number;
  totalElements?: number;
  size?: number;
  content?: PlusVoiceSpeakerVO[];
  number?: number;
  numberOfElements?: number;
  pageable?: PageableObject;
  sort?: SortObject;
  first?: boolean;
  last?: boolean;
  empty?: boolean;
}
