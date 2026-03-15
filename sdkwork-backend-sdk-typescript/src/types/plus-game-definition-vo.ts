/** 棋牌游戏玩法定义VO */
export interface PlusGameDefinitionVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 玩法定义ID */
  definitionId?: number;
  /** 玩法编码 */
  code?: string;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法分类 */
  category?: 'BOARD' | 'CARD' | 'TILE' | 'MIXED';
  /** 玩法名称 */
  name?: string;
  /** 玩法别名 */
  alias?: string;
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 玩法描述 */
  description?: string;
  /** 规则摘要 */
  ruleSummary?: string;
  /** 最少玩家数 */
  minPlayers?: number;
  /** 最多玩家数 */
  maxPlayers?: number;
  /** 座位数 */
  seatCount?: number;
  /** 队伍数 */
  teamCount?: number;
  /** 默认局数 */
  defaultRoundCount?: number;
  /** 是否回合制 */
  turnBased?: boolean;
  /** 是否支持排位 */
  ranked?: boolean;
  /** 是否支持旁观 */
  supportsSpectator?: boolean;
  /** 是否支持托管 */
  supportsTrusteeship?: boolean;
  /** 是否支持机器人 */
  supportsRobot?: boolean;
  /** 是否支持回放 */
  supportsReplay?: boolean;
  /** 是否支持好友房 */
  supportsFriendRoom?: boolean;
  /** 是否支持赛事 */
  supportsTournament?: boolean;
  /** 是否支持俱乐部 */
  supportsClub?: boolean;
  /** 是否支持练习模式 */
  supportsPractice?: boolean;
  /** 推荐难度等级 */
  difficultyLevel?: number;
  /** 教程链接 */
  tutorialUrl?: string;
  /** 默认排行类型 */
  rankingType?: 'SCORE' | 'RATING' | 'WIN_RATE' | 'WIN_COUNT' | 'STREAK' | 'PROFIT';
  /** 默认规则配置 */
  defaultRuleConfig?: Record<string, unknown>;
  /** 扩展元数据 */
  metadata?: Record<string, unknown>;
  /** 支持的榜单周期 */
  supportedLeaderboardPeriods?: 'HOUR' | 'DAY' | 'WEEK' | 'MONTH' | 'QUARTER' | 'YEAR' | 'SEASON'[];
  /** 是否启用 */
  enabled?: boolean;
}
