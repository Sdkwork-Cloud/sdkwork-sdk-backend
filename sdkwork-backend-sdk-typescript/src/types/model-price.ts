import type { ModelPriceItem } from './model-price-item';

/** AIæ¨¡åæå¡ä»·æ ¼éç½®ä¿¡æ¯ */
export interface ModelPrice {
  /** ä»·æ ¼è®¡éåä½ï¼ç¨äºæå®ä»·æ ¼é¡¹çè®¡éåºåï¼ */
  unit?: 'TOKEN' | 'K_TOKEN' | 'M_TOKEN' | 'COUNT' | 'DURATION';
  /** ä»·æ ¼é¡¹åè¡¨ï¼åå«è¾å¥/è¾åº/æ¹éå¤çç­ä»·æ ¼ç±»åï¼ */
  items?: ModelPriceItem[];
  /** è´§å¸ä»£ç ï¼æå®ä»·æ ¼ä½¿ç¨çè´§å¸ç±»åï¼å¦USDãCNYç­ï¼ */
  currency?: 'USD' | 'EUR' | 'GBP' | 'JPY' | 'AUD' | 'CAD' | 'CHF' | 'CNY' | 'SEK' | 'NZD' | 'BRL' | 'INR' | 'RUB' | 'ZAR' | 'SGD' | 'HKD' | 'KRW' | 'MXN' | 'TRY' | 'ILS' | 'POINT' | 'TOKEN';
}
