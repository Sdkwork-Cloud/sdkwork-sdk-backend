/** 棋牌游戏房间查询表单 */
export interface PlusGameRoomQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 房主用户ID */
  userId?: number;
  /** 玩法定义ID */
  definitionId?: number;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 赛季标识 */
  seasonKey?: string;
  /** 房间号 */
  roomNo?: string;
  /** 房间号模糊匹配 */
  roomNoLike?: string;
  /** 房间名称模糊匹配 */
  nameLike?: string;
  /** 房间类型 */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** 房间状态 */
  status?: 'WAITING' | 'READY' | 'PLAYING' | 'SETTLING' | 'FINISHED' | 'DISMISSED' | 'EXPIRED';
  /** 可见性 */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'PASSWORD';
  /** 是否排位房 */
  ranked?: boolean;
  /** 是否允许观战 */
  allowSpectator?: boolean;
  /** 是否计入榜单 */
  leaderboardEligible?: boolean;
  /** 是否启用回放 */
  replayEnabled?: boolean;
  /** 俱乐部ID */
  clubId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 当前对局ID */
  currentMatchId?: number;
}
