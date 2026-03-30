/** 函数调用信息，当模型决定需要调用工具函数时返回 */
export interface FunctionCall {
  /** 要调用的函数名称 */
  name: string;
  /** 函数参数，键值对形式 */
  arguments: Record<string, Record<string, unknown>>;
}
