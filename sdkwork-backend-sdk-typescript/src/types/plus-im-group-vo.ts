import type { ImageMediaResource } from './image-media-resource';

/** èå¤©ç¾¤ç»VO */
export interface PlusImGroupVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ç¾¤ç»ID */
  id?: number;
  /** ç¾¤ç»UUID */
  uuid?: string;
  /** ç¾¤ç»åç§° */
  name?: string;
  /** ç¾¤ç»æè¿° */
  description?: string;
  /** ç¾¤ç»å¤´å */
  avatar?: ImageMediaResource;
  /** ç¾¤ç»å¬å */
  announcement?: string;
  /** ç¾¤ç»æåæ°é */
  memberCount?: number;
  /** æå¤§æåæ°é */
  maxMembers?: number;
  /** ç¾¤ç»åå»ºèID */
  creatorId?: number;
  /** ç¾¤ç»ç±»å */
  type?: 'NORMAL' | 'WORK' | 'INTEREST' | 'SUPPORT';
  /** ç¾¤ç»ç¶æ */
  status?: 'ACTIVE' | 'INACTIVE' | 'DISABLED' | 'DELETED';
  /** æ¯å¦åè®¸æåéè¯·æ°æå */
  allowMemberInvite?: boolean;
  /** æ¯å¦éè¦å®¡æ¹æè½å å¥ */
  requireApproval?: boolean;
}
