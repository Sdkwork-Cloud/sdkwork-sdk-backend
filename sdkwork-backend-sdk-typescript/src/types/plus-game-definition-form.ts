/** 妫嬬墝娓告垙鐜╂硶瀹氫箟琛ㄥ崟 */
export interface PlusGameDefinitionForm {
  /** 鐜╂硶缂栫爜 */
  code: string;
  /** 鐜╂硶绫诲瀷 */
  gameType: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 鐜╂硶鍒嗙被 */
  category: 'BOARD' | 'CARD' | 'TILE' | 'MIXED';
  /** 鐜╂硶鍚嶇О */
  name: string;
  /** 鐜╂硶鍒悕 */
  alias?: string;
  /** 鐜╂硶妯″紡缂栫爜 */
  gameModeCode?: string;
  /** 鐜╂硶鎻忚堪 */
  description?: string;
  /** 瑙勫垯鎽樿 */
  ruleSummary?: string;
  /** 鏈€灏戠帺瀹舵暟 */
  minPlayers: number;
  /** 鏈€澶氱帺瀹舵暟 */
  maxPlayers: number;
  /** S ea tC ou nt */
  seatCount: number;
  /** T ea mC ou nt */
  teamCount?: number;
  /** D ef au lt Ro un dC ou nt */
  defaultRoundCount?: number;
  /** T ur nB as ed */
  turnBased?: boolean;
  /** 鏄惁鏀寔鎺掍綅 */
  ranked?: boolean;
  /** 鏄惁鏀寔鏃佽 */
  supportsSpectator?: boolean;
  /** 鏄惁鏀寔鎵樼 */
  supportsTrusteeship?: boolean;
  /** S up po rt sR ob ot */
  supportsRobot?: boolean;
  /** 鏄惁鏀寔鍥炴斁 */
  supportsReplay?: boolean;
  /** S up po rt sF ri en dR oo m */
  supportsFriendRoom?: boolean;
  /** 鏄惁鏀寔璧涗簨 */
  supportsTournament?: boolean;
  /** S up po rt sC lu b */
  supportsClub?: boolean;
  /** 鏄惁鏀寔缁冧範妯″紡 */
  supportsPractice?: boolean;
  /** 鎺ㄨ崘闅惧害绛夌骇 */
  difficultyLevel?: number;
  /** 鏁欑▼閾炬帴 */
  tutorialUrl?: string;
  /** 榛樿鎺掕绫诲瀷 */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** 榛樿瑙勫垯閰嶇疆 */
  defaultRuleConfig?: Record<string, unknown>;
  /** M et ad at a */
  metadata?: Record<string, unknown>;
  /** S up po rt ed Le ad er bo ar dP er io ds */
  supportedLeaderboardPeriods?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON'[];
  /** 鏄惁鍚敤 */
  enabled?: boolean;
}
