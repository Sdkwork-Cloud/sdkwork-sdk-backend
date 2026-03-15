import type { PlusCard } from './plus-card';

/** Member card creation form */
export interface PlusMemberCardForm {
  /** Related card */
  card: PlusCard;
  /** Whether bonus is supplied */
  supplyBonus?: boolean;
  /** Whether balance is supplied */
  supplyBalance?: boolean;
  /** Bonus display name */
  bonusName?: string;
  /** Balance display name */
  balanceName?: string;
  /** Card prerogative description */
  prerogative?: string;
  /** Whether auto activation is enabled */
  autoActivate?: boolean;
  /** Whether WeChat activation is enabled */
  wxActivate?: boolean;
  /** Money cost unit */
  costMoneyUnit?: number;
  /** Bonus increase amount */
  increaseBonus?: number;
  /** Initial bonus increase amount */
  initIncreaseBonus?: number;
  /** Maximum bonus increase amount */
  maxIncreaseBonus?: number;
  /** Bonus cost unit */
  costBonusUnit?: number;
  /** Money reduced by bonus */
  reduceMoney?: number;
  /** Least money to use bonus */
  leastMoneyToUseBonus?: number;
  /** Maximum reduced bonus */
  maxReduceBonus?: number;
}
