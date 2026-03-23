import type { ImageMediaResource } from './image-media-resource';
import type { VideoMediaResource } from './video-media-resource';

/** èæè§è²VO */
export interface PlusCharacterVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** è§è²ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** è§è²åç§° */
  name?: string;
  /** è§è²ç±»å */
  type?: 'HUMAN' | 'PET' | 'ANIMAL' | 'ROBOT' | 'OTHER';
  /** è§è²å¤´åå¾ç */
  avatar?: ImageMediaResource;
  /** è§è²ä¸è§å¾ */
  threeViewImage?: ImageMediaResource;
  /** è§è²GRIDåéå¾ */
  gridShotsImage?: ImageMediaResource;
  /** è§è²å¤´åè§é¢ */
  avatarVideo?: VideoMediaResource;
  /** å³èçAIæºè½ä½ID */
  agentId?: number;
  /** è§è²æè¿° (è¯¦ç»åè½è¯´æ) */
  description?: string;
  /** è§è²ç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** è§è²ä¸ªæ§ç¹å¾ (JSONæ ¼å¼å­å¨) */
  personality?: string;
  /** è§è²èæ¯æäº (JSONæ ¼å¼å­å¨) */
  background?: string;
  /** äº¤äºè®¾ç½® (JSONæ ¼å¼å­å¨) */
  interactionSettings?: string;
  /** è§è²çæ¬ */
  version?: string;
  /** ç¨æ·ID */
  userId?: number;
}
