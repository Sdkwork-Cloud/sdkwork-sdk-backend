import type { LoginResultVO } from './login-result-vo';
import type { UserVO } from './user-vo';

/** 二维码状态响应 */
export interface QrCodeStatusVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 二维码状态: pending(等待扫描)/scanned(已扫描)/confirmed(已确认)/expired(已过期)/cancelled(已取消) */
  status?: 'pending' | 'scanned' | 'confirmed' | 'expired' | 'cancelled';
  /** 用户信息(扫描后返回) */
  userInfo?: UserVO;
  /** 登录令牌(确认后返回) */
  token?: LoginResultVO;
}
