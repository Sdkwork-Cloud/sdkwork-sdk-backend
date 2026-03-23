/** Growth record view object */
export interface PlusGameGrowthRecordVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Record ID */
  recordId?: number;
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
  /** Room ID */
  roomId?: number;
  /** Match ID */
  matchId?: number;
  /** Tournament ID */
  tournamentId?: number;
  /** Growth source type */
  sourceType?: 'MATCH_SETTLEMENT' | 'CHALLENGE_SETTLEMENT' | 'ARENA_SETTLEMENT' | 'ROUND_SETTLEMENT' | 'TOURNAMENT_REWARD' | 'LEADERBOARD_REWARD' | 'DAILY_TASK' | 'WEEKLY_TASK' | 'ACTIVITY_REWARD' | 'NEWBIE_REWARD' | 'HONOR_REWARD' | 'ADMIN_ADJUST' | 'SEASON_RESET' | 'SYSTEM_INIT';
  /** Business idempotency key */
  bizNo?: string;
  /** Reason */
  reason?: string;
  /** Experience before change */
  expBefore?: number;
  /** Experience delta */
  expDelta?: number;
  /** Experience after change */
  expAfter?: number;
  /** Total experience before change */
  totalExpBefore?: number;
  /** Total experience delta */
  totalExpDelta?: number;
  /** Total experience after change */
  totalExpAfter?: number;
  /** Level config ID before change */
  levelConfigIdBefore?: number;
  /** Level config ID after change */
  levelConfigIdAfter?: number;
  /** Level number before change */
  levelNoBefore?: number;
  /** Level number after change */
  levelNoAfter?: number;
  /** Level code before change */
  levelCodeBefore?: string;
  /** Level code after change */
  levelCodeAfter?: string;
  /** Whether a level-up occurred */
  levelUp?: boolean;
  /** Operator user ID */
  operatorUserId?: number;
  /** Occurred time */
  occurredAt?: string;
  /** Settlement snapshot */
  settlementData?: Record<string, unknown>;
  /** Extension data */
  extData?: Record<string, unknown>;
}
