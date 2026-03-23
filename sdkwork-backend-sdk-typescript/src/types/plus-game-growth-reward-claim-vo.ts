/** Growth reward claim audit view object */
export interface PlusGameGrowthRewardClaimVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
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
  rewardConfig?: Record<string, unknown>;
  /** Reward summary */
  rewardSummary?: Record<string, unknown>;
}
