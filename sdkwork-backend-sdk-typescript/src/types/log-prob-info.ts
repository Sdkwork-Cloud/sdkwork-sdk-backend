/** 日志概率信息，包含生成文本的概率分布信息，仅在请求时指定了logprobs参数时返回 */
export interface LogProbInfo {
  /** 生成的token列表 */
  tokens?: string[];
  /** 每个token的对数概率 */
  token_logprobs?: number[];
  /** 每个token的字节偏移量 */
  text_offset?: number[];
}
