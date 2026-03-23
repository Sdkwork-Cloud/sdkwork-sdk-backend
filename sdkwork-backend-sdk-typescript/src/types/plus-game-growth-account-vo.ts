/** Growth account view object */
export interface PlusGameGrowthAccountVO {
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
  /** Current level config ID */
  currentLevelConfigId?: number;
  /** Current level number */
  currentLevelNo?: number;
  /** Current level code */
  currentLevelCode?: string;
  /** Current level name */
  currentLevelName?: string;
  /** Current title */
  currentTitle?: string;
  /** Current badge code */
  currentBadgeCode?: string;
  /** Current experience */
  currentExp?: number;
  /** Total experience */
  totalExp?: number;
  /** Current level start experience */
  currentLevelStartExp?: number;
  /** Next level required experience */
  nextLevelRequiredExp?: number;
  /** Experience required to next level */
  expToNextLevel?: number;
  /** Current progress percentage */
  progressPercent?: number;
  /** Peak level number */
  peakLevelNo?: number;
  /** Peak experience */
  peakExp?: number;
  /** Total level-up count */
  levelUpCount?: number;
  /** Claimed reward count */
  rewardClaimedCount?: number;
  /** Last experience gain time */
  lastGainAt?: string;
  /** Last level-up time */
  lastLevelUpAt?: string;
  /** Last reset time */
  lastResetAt?: string;
  /** Whether the account is active */
  active?: boolean;
  /** Last claimed level number */
  lastClaimedLevelNo?: number;
  /** Last reward claim time */
  lastRewardClaimedAt?: string;
  /** Last reward issue time */
  lastRewardIssuedAt?: string;
  /** Last claimed level code */
  lastClaimedRewardLevelCode?: string;
  /** Last claimed level name */
  lastClaimedRewardLevelName?: string;
  /** Last claimed reward summary */
  lastClaimedRewardSummary?: Record<string, unknown>;
  /** Last claimed raw reward config */
  lastClaimedRewardConfig?: Record<string, unknown>;
  /** Extension data */
  extData?: Record<string, unknown>;
}
