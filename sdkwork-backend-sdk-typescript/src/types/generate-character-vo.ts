import type { ImageMediaResource } from './image-media-resource';

/** Character generation response */
export interface GenerateCharacterVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Request ID */
  requestId?: string;
  /** Task ID */
  taskId?: string;
  /** Task status */
  taskStatus?: string;
  /** Generated character images */
  characterImages?: ImageMediaResource[];
  /** Generated character ID */
  characterId?: string;
  /** Generated character name */
  characterName?: string;
  /** Generated character description */
  characterDescription?: string;
  /** Generation model name */
  model?: string;
  /** Generation duration in milliseconds */
  duration?: number;
  /** Error message */
  errorMessage?: string;
}
