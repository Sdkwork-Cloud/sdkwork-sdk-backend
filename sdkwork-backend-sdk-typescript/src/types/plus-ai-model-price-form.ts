/** Model price creation form */
export interface PlusAiModelPriceForm {
  /** 模型标ID */
  objectId: string;
  /** 模型标识符(如"gpt-4","claude-3-opus") */
  model: string;
  /** 价格计量单位 */
  unit: 'TOKEN' | 'K_TOKEN' | 'M_TOKEN' | 'COUNT' | 'DURATION';
  /** 基础价格 */
  price?: number;
  /** 输入价格 */
  inputPrice?: number;
  /** "批量输入价格 */
  batchInputPrice?: number;
  /** 缓存输入价格 */
  cachedInputPrice?: number;
  /** 批量缓存输入价格 */
  batchCachedInputPrice?: number;
  /** 输出价格 */
  outputPrice?: number;
  /** 批量输出价格 */
  batchOutputPrice?: number;
  /** 货币类型 */
  currency: 'USD' | 'EUR' | 'GBP' | 'JPY' | 'AUD' | 'CAD' | 'CHF' | 'CNY' | 'SEK' | 'NZD' | 'BRL' | 'INR' | 'RUB' | 'ZAR' | 'SGD' | 'HKD' | 'KRW' | 'MXN' | 'TRY' | 'ILS' | 'POINT' | 'TOKEN';
}
