/** 棋牌游戏回放查询表单 */
export interface PlusGameReplayQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 房间ID */
  roomId?: number;
  /** 对局ID */
  matchId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 房间类型 */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 赛季标识 */
  seasonKey?: string;
  /** 俱乐部ID */
  clubId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 回放归属用户ID */
  ownerUserId?: number;
  /** 回放标题模糊匹配 */
  titleLike?: string;
  /** 回放状态 */
  status?: 'GENERATING' | 'READY' | 'EXPIRED' | 'DELETED';
  /** 是否公开可见 */
  publicVisible?: boolean;
  /** 是否允许分享 */
  allowShare?: boolean;
}
