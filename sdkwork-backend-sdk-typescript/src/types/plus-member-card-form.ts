import type { PlusCard } from './plus-card';

/** Member card creation form */
export interface PlusMemberCardForm {
  /** 关联的基础卡券记录 */
  card: PlusCard;
  /** 是否支持积分 */
  supplyBonus?: boolean;
  /** 是否支持储值 */
  supplyBalance?: boolean;
  /** 积分名称（如“积分”） */
  bonusName?: string;
  /** 储值名称 */
  balanceName?: string;
  /** 会员特权说明 */
  prerogative?: string;
  /** 是否自动激活 */
  autoActivate?: boolean;
  /** 是否一键激活 */
  wxActivate?: boolean;
  /** 消费金额（单位：分）获取积分 */
  costMoneyUnit?: number;
  /** 每花费costMoneyUnit所得积分数 */
  increaseBonus?: number;
  /** 初始赠送积分 */
  initIncreaseBonus?: number;
  /** 单次最大赠送积分上限 */
  maxIncreaseBonus?: number;
  /** 消耗积分的最小单位 */
  costBonusUnit?: number;
  /** 使用积分抵扣金额（单位：分） */
  reduceMoney?: number;
  /** 使用积分抵扣时需最低消费金额（单位：分） */
  leastMoneyToUseBonus?: number;
  /** 每次使用的积分抵扣上限 */
  maxReduceBonus?: number;
}
