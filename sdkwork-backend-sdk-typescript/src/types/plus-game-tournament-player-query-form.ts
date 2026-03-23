/** æ£çæ¸¸æèµäºåèµèæ¥è¯¢è¡¨å */
export interface PlusGameTournamentPlayerQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** èµäºID */
  tournamentId?: number;
  /** ç©å®¶ç¨æ·ID */
  userId?: number;
  /** åèµç¶æ */
  status?: 'REGISTERED' | 'CHECKED_IN' | 'PLAYING' | 'ADVANCED' | 'ELIMINATED' | 'FINISHED' | 'WITHDRAWN';
}
