/** 棋牌游戏回放管理表单 */
export interface PlusGameReplayManageForm {
  /** 回放标题 */
  title?: string;
  /** 是否公开可见 */
  publicVisible?: boolean;
  /** 是否允许分享 */
  allowShare?: boolean;
  /** 回放状态 */
  status?: 'GENERATING' | 'READY' | 'EXPIRED' | 'DELETED';
  /** 封面地址 */
  coverUrl?: string;
  /** 过期时间 */
  expiredAt?: string;
}
