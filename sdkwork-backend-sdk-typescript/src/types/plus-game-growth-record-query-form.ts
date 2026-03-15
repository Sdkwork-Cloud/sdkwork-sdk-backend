/** Growth record query form */
export interface PlusGameGrowthRecordQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
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
}
