/** Growth reward claim audit view object */
export interface PlusGameGrowthRewardClaimVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** Growth account ID */
  accountId?: number;
  /** User ID */
  userId?: number;
  /** Growth account type */
  accountType?: 'PLAYER_LEVEL' | 'GAME_LEVEL';
  /** Game type */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** Game mode code */
  gameModeCode?: string;
  /** Season key */
  seasonKey?: string;
  /** Current account level number */
  currentLevelNo?: number;
  /** Claimed level number */
  levelNo?: number;
  /** Claimed level code */
  levelCode?: string;
  /** Claimed level name */
  levelName?: string;
  /** Claimed title */
  title?: string;
  /** Claimed badge code */
  badgeCode?: string;
  /** Claim time */
  claimedAt?: string;
  /** Reward issue time */
  rewardIssuedAt?: string;
  /** Operator user ID */
  operatorUserId?: number;
  /** Raw reward configuration */
  rewardConfig?: Record<string, Record<string, unknown>>;
  /** Reward summary */
  rewardSummary?: Record<string, Record<string, unknown>>;
}
