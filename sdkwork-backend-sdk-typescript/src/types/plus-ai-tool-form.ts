import type { HttpApiDefinition } from './http-api-definition';
import type { PlusToolDefinition } from './plus-tool-definition';

/** Tool creation form */
export interface PlusAiToolForm {
  /** 工具名称 */
  name: string;
  /** 工具描述 */
  description?: string;
  /** 工具类型(HTTP_API:HTTP接口,FUNCTION:函数,PLUGIN:插件) */
  type: 'HTTP' | 'TOOL' | 'MCP' | 'SCRIPT';
  /** 工具状态(DRAFT:草稿,PUBLISHED:已发布,DEPRECATED:已弃用) */
  status: 'ACTIVE' | 'INACTIVE';
  /** 是否启用(true:启用,false:禁用) */
  enabled: boolean;
  /** HTTP API定义(JSON格式) */
  httpApiDefinition?: HttpApiDefinition;
  /** 工具定义(JSON格式) */
  toolDefinition?: PlusToolDefinition;
}
