import type { LoginResultVO } from './login-result-vo';
import type { UserVO } from './user-vo';

/** äºç»´ç ç¶æååº */
export interface QrCodeStatusVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** äºç»´ç ç¶æ: pending(ç­å¾æ«æ)/scanned(å·²æ«æ)/confirmed(å·²ç¡®è®¤)/expired(å·²è¿æ)/cancelled(å·²åæ¶) */
  status?: 'pending' | 'scanned' | 'confirmed' | 'expired' | 'cancelled';
  /** ç¨æ·ä¿¡æ¯(æ«æåè¿å) */
  userInfo?: UserVO;
  /** ç»å½ä»¤ç(ç¡®è®¤åè¿å) */
  token?: LoginResultVO;
}
