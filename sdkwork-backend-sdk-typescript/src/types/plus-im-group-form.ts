import type { ImageMediaResource } from './image-media-resource';

/** Chat group creation form */
export interface PlusImGroupForm {
  /** 缇ょ粍鍚嶇О */
  name: string;
  /** 缇ょ粍鎻忚堪 */
  description?: string;
  /** 缇ょ粍澶村儚 */
  avatar?: ImageMediaResource;
  /** 缇ょ粍鍏憡 */
  announcement?: string;
  /** 缇ょ粍鎴愬憳鏁伴噺 */
  memberCount: number;
  /** M ax Me mb er s */
  maxMembers: number;
  /** 缇ょ粍鍒涘缓鑰匢D */
  creatorId: number;
  /** 缇ょ粍绫诲瀷 */
  type?: 'NORMAL' | 'WORK' | 'INTEREST' | 'SUPPORT';
  /** S ta tu s */
  status?: 'ACTIVE' | 'INACTIVE' | 'DISABLED' | 'DELETED';
  /** 鏄惁鍏佽鎴愬憳閭€璇锋柊鎴愬憳 */
  allowMemberInvite?: boolean;
  /** R eq ui re Ap pr ov al */
  requireApproval?: boolean;
}
