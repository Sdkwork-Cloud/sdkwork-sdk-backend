/** æ£çæ¸¸æèµäºç®¡çè¡¨å */
export interface PlusGameTournamentManageForm {
  /** èµäºç¶æ */
  status?: 'DRAFT' | 'REGISTERING' | 'RUNNING' | 'SETTLING' | 'FINISHED' | 'CANCELED';
  /** æ¥åå¼å§æ¶é´ */
  signUpStartAt?: string;
  /** æ¥åç»ææ¶é´ */
  signUpEndAt?: string;
  /** èµäºå¼å§æ¶é´ */
  startAt?: string;
  /** èµäºç»ææ¶é´ */
  endAt?: string;
  /** å åç¨æ·ID */
  winnerUserId?: number;
  /** å åä¿±ä¹é¨ID */
  winnerClubId?: number;
}
