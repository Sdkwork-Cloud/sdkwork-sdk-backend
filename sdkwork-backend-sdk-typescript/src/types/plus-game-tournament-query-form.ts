/** 棋牌游戏赛事查询表单 */
export interface PlusGameTournamentQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 赛事状态 */
  status?: 'DRAFT' | 'REGISTERING' | 'RUNNING' | 'SETTLING' | 'FINISHED' | 'CANCELED';
}
