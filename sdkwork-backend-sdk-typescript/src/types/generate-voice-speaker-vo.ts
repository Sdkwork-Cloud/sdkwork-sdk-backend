import type { AudioMediaResourceList } from './audio-media-resource-list';

/** è¯­é³è¯´è¯äººçæç»æVO */
export interface GenerateVoiceSpeakerVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** Request ID */
  requestId?: string;
  /** Task ID */
  taskId?: string;
  /** Task status */
  taskStatus?: string;
  /** çæçè¯­é³èµæºåè¡¨ */
  voiceResources?: AudioMediaResourceList;
  /** è¯­é³è¯´è¯äººID */
  voiceSpeakerId?: string;
  /** è¯­é³è¯´è¯äººåç§° */
  voiceSpeakerName?: string;
  /** è¯­é³è¯´è¯äººç±»å */
  voiceType?: string;
  /** è¯­é³è¯´è¯äººé£æ ¼ */
  voiceStyle?: string;
  /** çæçæ¨¡ååç§° */
  model?: string;
  /** çæèæ¶ï¼æ¯«ç§ï¼ */
  duration?: number;
  /** éè¯¯ä¿¡æ¯ */
  errorMessage?: string;
}
