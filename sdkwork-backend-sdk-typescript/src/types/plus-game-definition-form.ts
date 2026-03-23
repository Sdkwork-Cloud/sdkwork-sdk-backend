/** å¦«å¬¬å¢å¨ååéâç¡¶ç¹æ°«ç®çã¥å´ */
export interface PlusGameDefinitionForm {
  /** éâç¡¶ç¼æ «ç */
  code: string;
  /** éâç¡¶ç»«è¯²ç· */
  gameType: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** éâç¡¶éåè¢« */
  category: 'BOARD' | 'CARD' | 'TILE' | 'MIXED';
  /** éâç¡¶éå¶Ð */
  name: string;
  /** éâç¡¶éî¢æ */
  alias?: string;
  /** éâç¡¶å¦¯â³ç´¡ç¼æ «ç */
  gameModeCode?: string;
  /** éâç¡¶é»å¿å ª */
  description?: string;
  /** çå«å¯é½æ¨¿î¦ */
  ruleSummary?: string;
  /** éâ¬çæ å¸ºç¹èµæ */
  minPlayers: number;
  /** éâ¬æ¾¶æ°±å¸ºç¹èµæ */
  maxPlayers: number;
  /** S ea tC ou nt */
  seatCount: number;
  /** T ea mC ou nt */
  teamCount?: number;
  /** D ef au lt Ro un dC ou nt */
  defaultRoundCount?: number;
  /** T ur nB as ed */
  turnBased?: boolean;
  /** éîæéîå¯éºæç¶ */
  ranked?: boolean;
  /** éîæéîå¯éä½½î */
  supportsSpectator?: boolean;
  /** éîæéîå¯éµæ¨¼î¸ */
  supportsTrusteeship?: boolean;
  /** S up po rt sR ob ot */
  supportsRobot?: boolean;
  /** éîæéîå¯é¥ç´æ */
  supportsReplay?: boolean;
  /** S up po rt sF ri en dR oo m */
  supportsFriendRoom?: boolean;
  /** éîæéîå¯ç§æ¶ç°¨ */
  supportsTournament?: boolean;
  /** S up po rt sC lu b */
  supportsClub?: boolean;
  /** éîæéîå¯ç¼å§ç¯å¦¯â³ç´¡ */
  supportsPractice?: boolean;
  /** éºã¨å´éæ§å®³ç»å¤éª */
  difficultyLevel?: number;
  /** éæ¬â¼é¾ç¬å¸´ */
  tutorialUrl?: string;
  /** æ¦æ¨¿î»éºæîç»«è¯²ç· */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** æ¦æ¨¿î»çå«å¯é°å¶ç */
  defaultRuleConfig?: Record<string, unknown>;
  /** M et ad at a */
  metadata?: Record<string, unknown>;
  /** S up po rt ed Le ad er bo ar dP er io ds */
  supportedLeaderboardPeriods?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON'[];
  /** éîæéîæ¤ */
  enabled?: boolean;
}
