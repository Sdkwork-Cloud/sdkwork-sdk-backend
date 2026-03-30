/** Agent-tool relationship creation form */
export interface PlusAiAgentToolForm {
  /** 鍏宠仈鐨凙I鏅鸿兘浣揑D */
  agentId: number;
  /** 鍏宠仈鐨凙I宸ュ叿ID */
  toolId: number;
  /** 宸ュ叿鍦ㄦ櫤鑳戒綋涓殑鎺掑簭搴忓彿 */
  sortOrder?: number;
  /** 宸ュ叿鏄惁榛樿鍚敤(true:鍚敤,false:绂佺敤) */
  enabled: boolean;
}
