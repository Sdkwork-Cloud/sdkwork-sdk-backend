/** æ£çæ¸¸æèµäºæ¥è¯¢è¡¨å */
export interface PlusGameTournamentQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** ç©æ³ç±»å */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** èµäºç¶æ */
  status?: 'DRAFT' | 'REGISTERING' | 'RUNNING' | 'SETTLING' | 'FINISHED' | 'CANCELED';
}
