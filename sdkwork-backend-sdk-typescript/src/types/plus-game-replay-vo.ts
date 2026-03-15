/** 棋牌游戏回放VO */
export interface PlusGameReplayVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 回放ID */
  replayId?: number;
  /** 回放编号 */
  replayNo?: string;
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
  /** 回放标题 */
  title?: string;
  /** 回放状态 */
  status?: 'GENERATING' | 'READY' | 'EXPIRED' | 'DELETED';
  /** 是否公开可见 */
  publicVisible?: boolean;
  /** 是否允许分享 */
  allowShare?: boolean;
  /** 回放时长 */
  durationSeconds?: number;
  /** 动作总数 */
  actionCount?: number;
  /** 关键帧数量 */
  keyFrameCount?: number;
  /** 回放存储键 */
  storageKey?: string;
  /** 封面地址 */
  coverUrl?: string;
  /** 初始局面快照 */
  boardSnapshot?: Record<string, unknown>;
  /** 关键帧摘要 */
  keyFrames?: Record<string, unknown>;
  /** 开始时间 */
  startedAt?: string;
  /** 结束时间 */
  endedAt?: string;
  /** 过期时间 */
  expiredAt?: string;
}
