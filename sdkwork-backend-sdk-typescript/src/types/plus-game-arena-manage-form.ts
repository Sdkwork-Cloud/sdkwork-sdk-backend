/** 棋牌游戏擂台管理表单 */
export interface PlusGameArenaManageForm {
  /** 创建擂主用户ID；开擂时必填 */
  ownerUserId?: number;
  /** 当前擂主用户ID */
  currentChampionUserId?: number;
  /** 玩法类型；开擂时必填 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 擂台状态 */
  status?: 'OPEN' | 'LOCKED' | 'CLOSED';
  /** 擂台名称 */
  name?: string;
  /** 擂台描述 */
  description?: string;
  /** 擂台押分 */
  stakeScore?: number;
  /** 关联房间ID */
  roomId?: number;
  /** 关联对局ID */
  matchId?: number;
  /** 处理备注 */
  reason?: string;
}
