import type { ModelFunctionItem } from './model-function-item';

/** AI模型服务功能支持配置信息 */
export interface ModelFunctionInfo {
  /** 模型功能项列表（包含函数调用、缓存支持等能力配置） */
  functions?: ModelFunctionItem[];
}
