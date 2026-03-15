import type { ImageMediaResource } from './image-media-resource';
import type { VideoMediaResource } from './video-media-resource';

/** Character creation form */
export interface PlusCharacterForm {
  /** Character name */
  name: string;
  /** Character type */
  type: 'HUMAN' | 'PET' | 'ANIMAL' | 'ROBOT' | 'OTHER';
  /** Avatar image */
  avatar?: ImageMediaResource;
  /** Three-view image */
  threeViewImage?: ImageMediaResource;
  /** Grid shots image */
  gridShotsImage?: ImageMediaResource;
  /** Avatar video */
  avatarVideo?: VideoMediaResource;
  /** Agent ID */
  agentId: number;
  /** Description */
  description?: string;
  /** Status */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** Personality */
  personality?: string;
  /** Background */
  background?: string;
  /** Interaction settings */
  interactionSettings?: string;
  /** Version */
  version?: string;
  /** User ID */
  userId?: number;
}
