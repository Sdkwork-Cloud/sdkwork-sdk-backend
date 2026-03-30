/** 棋牌游戏擂台查询表单 */
export interface PlusGameArenaQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 创建擂主用户ID */
  ownerUserId?: number;
  /** 当前擂主用户ID */
  currentChampionUserId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 擂台状态 */
  status?: 'OPEN' | 'LOCKED' | 'CLOSED';
}
