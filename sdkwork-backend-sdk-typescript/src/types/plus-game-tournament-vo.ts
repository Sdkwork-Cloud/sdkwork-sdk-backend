/** 棋牌游戏赛事VO */
export interface PlusGameTournamentVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 赛事ID */
  tournamentId?: number;
  /** 赛事编号 */
  tournamentNo?: string;
  /** 赛事名称 */
  name?: string;
  /** 赛事简称 */
  shortName?: string;
  /** 赛事描述 */
  description?: string;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 赛事类型 */
  tournamentType?: 'LADDER' | 'CHALLENGE' | 'KNOCKOUT' | 'ROUND_ROBIN' | 'TEAM' | 'FESTIVAL';
  /** 赛事状态 */
  status?: 'DRAFT' | 'REGISTERING' | 'RUNNING' | 'SETTLING' | 'FINISHED' | 'CANCELED';
  /** 组织者用户ID */
  organizerUserId?: number;
  /** 俱乐部ID */
  clubId?: number;
  /** 赛季标识 */
  seasonKey?: string;
  /** 地区编码 */
  regionCode?: string;
  /** 最少玩家人数 */
  minPlayerCount?: number;
  /** 最多玩家人数 */
  maxPlayerCount?: number;
  /** 队伍规模 */
  teamSize?: number;
  /** 是否需要报名 */
  registrationRequired?: boolean;
  /** 是否排位赛事 */
  ranked?: boolean;
  /** 是否启用回放 */
  replayEnabled?: boolean;
  /** 报名开始时间 */
  signUpStartAt?: string;
  /** 报名结束时间 */
  signUpEndAt?: string;
  /** 开始时间 */
  startAt?: string;
  /** 结束时间 */
  endAt?: string;
  /** 冠军用户ID */
  winnerUserId?: number;
  /** 冠军俱乐部ID */
  winnerClubId?: number;
  /** 总参赛人数 */
  totalParticipantCount?: number;
  /** 总对局数 */
  totalMatchCount?: number;
  /** 已报名人数 */
  registeredCount?: number;
  /** 已签到人数 */
  checkedInCount?: number;
  /** 比赛中人数 */
  playingCount?: number;
  /** 已晋级人数 */
  advancedCount?: number;
  /** 已淘汰人数 */
  eliminatedCount?: number;
  /** 已完赛人数 */
  finishedCount?: number;
  /** 已退赛人数 */
  withdrawnCount?: number;
}
