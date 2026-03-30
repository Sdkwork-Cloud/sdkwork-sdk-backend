/** 妫嬬墝娓告垙鐜╁缁熻鏌ヨ琛ㄥ崟 */
export interface PlusGameStatsQueryForm {
  /** 鐜╁鐢ㄦ埛ID */
  userId: number;
  /** 鐜╂硶绫诲瀷 */
  gameType: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 鐜╂硶妯″紡缂栫爜 */
  gameModeCode?: string;
  /** 璧涘鏍囪瘑 */
  seasonKey?: string;
  /** 缁熻鑼冨洿绫诲瀷 */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** 缁熻鑼冨洿褰掑睘ID */
  scopeOwnerId?: number;
}
