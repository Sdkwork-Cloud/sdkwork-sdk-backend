/** å¦«å¬¬å¢å¨ååéâîç¼ç»î¸éã¨îçã¥å´ */
export interface PlusGameStatsQueryForm {
  /** éâîé¢ã¦åID */
  userId: number;
  /** éâç¡¶ç»«è¯²ç· */
  gameType: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** éâç¡¶å¦¯â³ç´¡ç¼æ «ç */
  gameModeCode?: string;
  /** ç§æ¶îéåªç */
  seasonKey?: string;
  /** ç¼ç»î¸é¼å¨æ´¿ç»«è¯²ç· */
  scopeType?: 'GLOBAL' | 'GAME' | 'MODE' | 'FRIEND' | 'CLUB' | 'REGION' | 'TOURNAMENT';
  /** ç¼ç»î¸é¼å¨æ´¿è¤°æçID */
  scopeOwnerId?: number;
}
