/** Growth level configuration view object */
export interface PlusGameGrowthLevelConfigVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Configuration ID */
  configId?: number;
  /** Growth account type */
  accountType?: 'PLAYER_LEVEL' | 'GAME_LEVEL';
  /** Game type */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** Game mode code */
  gameModeCode?: string;
  /** Season key */
  seasonKey?: string;
  /** Level number */
  levelNo?: number;
  /** Level code */
  levelCode?: string;
  /** Level name */
  levelName?: string;
  /** Level title */
  title?: string;
  /** Badge code */
  badgeCode?: string;
  /** Icon URL */
  iconUrl?: string;
  /** Required cumulative experience */
  requiredExp?: number;
  /** Start experience for the level */
  expStartValue?: number;
  /** End experience for the level */
  expEndValue?: number;
  /** Default win experience reward */
  winExpReward?: number;
  /** Default lose experience reward */
  loseExpReward?: number;
  /** Default draw experience reward */
  drawExpReward?: number;
  /** Default escape experience penalty */
  escapeExpPenalty?: number;
  /** Configuration status */
  status?: 'ENABLED' | 'DISABLED';
  /** Whether visible to clients */
  visible?: boolean;
  /** Level description */
  description?: string;
  /** Reward configuration */
  rewardConfig?: Record<string, unknown>;
  /** Benefit configuration */
  benefitConfig?: Record<string, unknown>;
  /** Extension data */
  extData?: Record<string, unknown>;
}
