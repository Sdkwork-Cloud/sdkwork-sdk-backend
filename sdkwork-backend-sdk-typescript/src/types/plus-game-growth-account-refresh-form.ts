/** Growth account refresh form */
export interface PlusGameGrowthAccountRefreshForm {
  /** User ID */
  userId: number;
  /** Growth account type */
  accountType: 'PLAYER_LEVEL' | 'GAME_LEVEL';
  /** Game type, required for game-level growth accounts */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** Game mode code */
  gameModeCode?: string;
  /** Season key */
  seasonKey?: string;
}
