/** 棋牌游戏房间VO */
export interface PlusGameRoomVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 房间ID */
  roomId?: number;
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
  /** 房间名称 */
  name?: string;
  /** 房间类型 */
  roomType?: 'MATCHMAKING' | 'CLASSIC' | 'FRIEND' | 'TOURNAMENT' | 'PRACTICE' | 'CLUB';
  /** 房间状态 */
  status?: 'WAITING' | 'READY' | 'PLAYING' | 'SETTLING' | 'FINISHED' | 'DISMISSED' | 'EXPIRED';
  /** 房间可见性 */
  visibility?: 'PUBLIC' | 'PRIVATE' | 'PASSWORD';
  /** 座位数 */
  seatCount?: number;
  /** 当前玩家数 */
  currentPlayerCount?: number;
  /** 开局最少人数 */
  minStartPlayerCount?: number;
  /** 房主座位号 */
  hostSeatNo?: number;
  /** 俱乐部ID */
  clubId?: number;
  /** 赛事ID */
  tournamentId?: number;
  /** 地区编码 */
  regionCode?: string;
  /** 当前对局ID */
  currentMatchId?: number;
  /** 当前局数 */
  currentRoundNo?: number;
  /** 计划总局数 */
  plannedRoundCount?: number;
  /** 已完成局数 */
  finishedRoundCount?: number;
  /** 是否排位房 */
  ranked?: boolean;
  /** 是否允许旁观 */
  allowSpectator?: boolean;
  /** 是否允许机器人 */
  allowRobot?: boolean;
  /** 是否允许托管 */
  allowTrusteeship?: boolean;
  /** 是否计入榜单 */
  leaderboardEligible?: boolean;
  /** 是否启用回放 */
  replayEnabled?: boolean;
  /** 观战人数 */
  spectatorCount?: number;
  /** 邀请码 */
  inviteCode?: string;
  /** 房间规则配置 */
  ruleConfig?: Record<string, unknown>;
  /** 扩展数据 */
  extData?: Record<string, unknown>;
  /** 开始时间 */
  startedAt?: string;
  /** 结束时间 */
  endedAt?: string;
  /** 最后活跃时间 */
  lastActiveAt?: string;
}
