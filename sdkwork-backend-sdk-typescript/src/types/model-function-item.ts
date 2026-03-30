/** 模型功能配置项（包含具体媒体类型和高级功能的支持标识） */
export interface ModelFunctionItem {
  /** 具体的模型功能类型（输入输出媒体类型和高级功能） */
  type?: 'INPUT_TEXT' | 'INPUT_IMAGE' | 'INPUT_AUDIO' | 'INPUT_VIDEO' | 'INPUT_FILE' | 'INPUT_CODE' | 'OUTPUT_TEXT' | 'OUTPUT_IMAGE' | 'OUTPUT_AUDIO' | 'OUTPUT_VIDEO' | 'OUTPUT_FILE' | 'OUTPUT_CODE' | 'FUNCTION_CALL' | 'MODEL_EXPERIENCE' | 'SESSION_CACHING' | 'MODEL_TUNING' | 'PREFIX_CACHING' | 'STRUCTURED_OUTPUT' | 'MULTIMODAL' | 'REAL_TIME_INFERENCE';
  /** 是否支持对应功能类型 */
  supported?: boolean;
}
