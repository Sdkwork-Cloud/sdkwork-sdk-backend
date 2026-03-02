import type { TagsContent } from './tags-content';

/** Prompt creation form */
export interface PlusAiPromptForm {
  /** 提示语标题 */
  title: string;
  /** 提示语内容 */
  content: string;
  /** 提示语描述 */
  description?: string;
  /** 关联分类ID */
  categoryId?: number;
  /** 是否启用(true:启用,false:禁用) */
  enabled: boolean;
  /** 排序顺序 */
  sort?: number;
  /** 参数定义(JSON格式) */
  parameters?: Record<string, unknown>;
  /** 创建者 */
  creator?: string;
  /** 适用的AI模型 */
  model?: string;
  /** 标签(逗号分隔) */
  tags?: TagsContent;
  /** 使用次数 */
  usageCount?: number;
  /** 平均响应时间(毫秒) */
  avgResponseTime?: number;
}
