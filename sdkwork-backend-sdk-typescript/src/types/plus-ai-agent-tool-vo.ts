/** AI智能体与工具关联关系VO类，用于维护AI智能体与工具之间的多对多关联关系 */
export interface PlusAiAgentToolVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 关联的AI智能体ID */
  agentId?: number;
  /** 关联的AI工具ID */
  toolId?: number;
  /** 工具在智能体中的排序序号 */
  sortOrder?: number;
  /** 工具是否默认启用(true:启用,false:禁用) */
  enabled?: boolean;
  /** AI智能体名称 */
  agentName?: string;
  /** AI工具名称 */
  toolName?: string;
}
