import type { ImageMediaResource } from './image-media-resource';

/** Chat group creation form */
export interface PlusImGroupForm {
  /** ç¼ãç²éå¶Ð */
  name: string;
  /** ç¼ãç²é»å¿å ª */
  description?: string;
  /** ç¼ãç²æ¾¶æå */
  avatar?: ImageMediaResource;
  /** ç¼ãç²éîæ¡ */
  announcement?: string;
  /** ç¼ãç²é´æ¬æ³éä¼´åº */
  memberCount: number;
  /** M ax Me mb er s */
  maxMembers: number;
  /** ç¼ãç²éæ¶ç¼é°å¢D */
  creatorId: number;
  /** ç¼ãç²ç»«è¯²ç· */
  type?: 'NORMAL' | 'WORK' | 'INTEREST' | 'SUPPORT';
  /** S ta tu s */
  status?: 'ACTIVE' | 'INACTIVE' | 'DISABLED' | 'DELETED';
  /** éîæéä½½îé´æ¬æ³é­â¬çéæé´æ¬æ³ */
  allowMemberInvite?: boolean;
  /** R eq ui re Ap pr ov al */
  requireApproval?: boolean;
}
