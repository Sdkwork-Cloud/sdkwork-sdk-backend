/** 棋牌游戏玩法定义查询表单 */
export interface PlusGameDefinitionQueryForm {
  id?: number;
  createdAtFrom?: string;
  createdAtTo?: string;
  /** 玩法编码 */
  code?: string;
  /** 玩法编码模糊匹配 */
  codeLike?: string;
  /** 玩法名称模糊匹配 */
  nameLike?: string;
  /** 玩法类型 */
  gameType?: 'INTERNATIONAL_CHESS' | 'CHINESE_CHESS' | 'GOMOKU' | 'JUNQI' | 'LANDLORD' | 'SHENG_JI' | 'TUO_LA_JI' | 'TEXAS_HOLDEM' | 'MAHJONG' | 'CUSTOM';
  /** 玩法分类 */
  category?: 'BOARD' | 'CARD' | 'TILE' | 'MIXED';
  /** 玩法模式编码 */
  gameModeCode?: string;
  /** 是否启用 */
  enabled?: boolean;
  /** 是否支持排位 */
  ranked?: boolean;
  /** 是否支持回放 */
  supportsReplay?: boolean;
  /** 是否支持赛事 */
  supportsTournament?: boolean;
}
