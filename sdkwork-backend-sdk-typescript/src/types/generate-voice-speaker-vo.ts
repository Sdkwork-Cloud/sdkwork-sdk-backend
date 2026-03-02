import type { AudioMediaResourceList } from './audio-media-resource-list';

/** 语音说话人生成结果VO */
export interface GenerateVoiceSpeakerVO {
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
  /** 生成的语音资源列表 */
  voiceResources?: AudioMediaResourceList;
  /** 语音说话人ID */
  voiceSpeakerId?: string;
  /** 语音说话人名称 */
  voiceSpeakerName?: string;
  /** 语音说话人类型 */
  voiceType?: string;
  /** 语音说话人风格 */
  voiceStyle?: string;
  /** 生成的模型名称 */
  model?: string;
  /** 生成耗时（毫秒） */
  duration?: number;
  /** 错误信息 */
  errorMessage?: string;
}
