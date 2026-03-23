/** æ¨¡åæå¡éå¶éç½®é¡¹ï¼åå«éå¶ç±»ååå·ä½æ°å¼ï¼ */
export interface ModelLimitItem {
  /** éå¶é¡¹ç±»åï¼å¦ä¸ä¸æé¿åº¦ãTPMç­ï¼ */
  type?: 'CONTEXT_LENGTH' | 'MAX_INPUT_TOKENS' | 'MAX_OUTPUT_TOKENS' | 'MAX_THINKING_TOKENS' | 'TPM' | 'RPM';
  /** éå¶å¼ï¼å·ä½æ°å¼ï¼åä½ç±æ¨¡åéç½®çè®¡éåä½å³å®ï¼ */
  value?: number;
}
