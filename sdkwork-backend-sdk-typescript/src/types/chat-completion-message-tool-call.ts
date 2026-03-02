import type { FunctionCall } from './function-call';

/** 工具调用对象，包含工具调用的唯一标识、类型和具体函数调用信息 */
export interface ChatCompletionMessageToolCall {
  /** 工具调用的唯一标识符 */
  id: string;
  /** 工具类型，当前仅支持"function" */
  type: string;
  /** 函数调用详情信息 */
  function: FunctionCall;
}
