/** Voice Speaker Generation Form */
export interface GenerateVoiceSpeakerForm {
  /** Voice speaker name */
  voiceSpeakerName: string;
  /** Voice type */
  voiceType?: string;
  /** Text content */
  text?: string;
  /** Speed */
  speed?: number;
  /** Pitch */
  pitch?: number;
  /** Volume */
  volume?: number;
  /** Model */
  model?: string;
  /** Response format */
  responseFormat?: string;
  /** Prompt */
  prompt?: string;
}
