/** æ¨¡ååè½éç½®é¡¹ï¼åå«å·ä½åªä½ç±»ååé«çº§åè½çæ¯ææ è¯ï¼ */
export interface ModelFunctionItem {
  /** å·ä½çæ¨¡ååè½ç±»åï¼è¾å¥è¾åºåªä½ç±»ååé«çº§åè½ï¼ */
  type?: 'INPUT_TEXT' | 'INPUT_IMAGE' | 'INPUT_AUDIO' | 'INPUT_VIDEO' | 'INPUT_FILE' | 'INPUT_CODE' | 'OUTPUT_TEXT' | 'OUTPUT_IMAGE' | 'OUTPUT_AUDIO' | 'OUTPUT_VIDEO' | 'OUTPUT_FILE' | 'OUTPUT_CODE' | 'FUNCTION_CALL' | 'MODEL_EXPERIENCE' | 'SESSION_CACHING' | 'MODEL_TUNING' | 'PREFIX_CACHING' | 'STRUCTURED_OUTPUT' | 'MULTIMODAL' | 'REAL_TIME_INFERENCE';
  /** æ¯å¦æ¯æå¯¹åºåè½ç±»å */
  supported?: boolean;
}
