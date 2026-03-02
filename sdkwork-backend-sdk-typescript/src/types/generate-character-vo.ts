import type { ImageMediaResource } from './image-media-resource';

/** 角色生成结果VO */
export interface GenerateCharacterVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** 请求ID */
  requestId?: string;
  /** 任务ID */
  taskId?: string;
  /** 生成任务状态 */
  taskStatus?: string;
  /** 生成的角色图像资源列表 */
  characterImages?: ImageMediaResource[];
  /** 生成的角色ID */
  characterId?: string;
  /** 生成的角色名称 */
  characterName?: string;
  /** 生成的角色描述 */
  characterDescription?: string;
  /** 生成的模型名称 */
  model?: string;
  /** 生成耗时（毫秒） */
  duration?: number;
  /** 错误信息 */
  errorMessage?: string;
}
