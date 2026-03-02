import type { GenerationInputParams } from './generation-input-params';
import type { GenerationOutput } from './generation-output';

/** AI生成内容详情VO */
export interface PlusAiGenerationContentVO {
  /** 创建时间，实体首次持久化时设置 */
  createdAt?: string;
  /** 最后更新时间，实体修改时更新 */
  updatedAt?: string;
  /** 主键ID，由数据库自动生成 */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 版本号，用于乐观锁控制 */
  version?: number;
  /** 生成内容的标题 */
  title?: string;
  /** 生成内容的描述信息 */
  description?: string;
  /** 内容类型 */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID */
  contentId?: number;
  /** 内容元数据 */
  metadata?: Record<string, unknown>;
  /** 输入参数 */
  inputParams?: GenerationInputParams;
  /** 输出结果 */
  output?: GenerationOutput;
  /** 生成内容的格式 */
  contentFormat?: string;
  /** 生成内容的存储URL */
  contentUrl?: string;
  /** 生成内容的文件大小 */
  fileSize?: number;
}
