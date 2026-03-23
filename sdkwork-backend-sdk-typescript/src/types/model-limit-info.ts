import type { ModelLimitItem } from './model-limit-item';

/** AIæ¨¡åæå¡ä»¤çä½¿ç¨éå¶éç½®ä¿¡æ¯ */
export interface ModelLimitInfo {
  /** ä»¤çè®¡éåä½ï¼ç¨äºæå®åç»­æ°å¼çè®¡éåä½åºåï¼ */
  unit?: 'TOKEN' | 'K_TOKEN' | 'M_TOKEN';
  /** æ¨¡åéå¶é¡¹åè¡¨ï¼åå«è¾å¥/è¾åº/TPM/RPMç­å·ä½éå¶éç½®ï¼ */
  items?: ModelLimitItem[];
}
