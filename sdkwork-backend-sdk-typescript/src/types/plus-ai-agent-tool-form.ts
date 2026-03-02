/** Agent-tool relationship creation form */
export interface PlusAiAgentToolForm {
  /** 关联的AI智能体ID */
  agentId: number;
  /** 关联的AI工具ID */
  toolId: number;
  /** 工具在智能体中的排序序号 */
  sortOrder?: number;
  /** 工具是否默认启用(true:启用,false:禁用) */
  enabled: boolean;
}
