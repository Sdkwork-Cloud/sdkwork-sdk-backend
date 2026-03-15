/** Growth account query form */
export interface PlusGameGrowthAccountQueryForm {
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
  /** Whether the account is active */
  active?: boolean;
}
