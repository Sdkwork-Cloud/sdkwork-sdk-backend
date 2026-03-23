/** Character generation request form */
export interface GenerateCharacterForm {
  /** Character name */
  name: string;
  /** Character description */
  description: string;
  /** Character appearance */
  appearance?: string;
  /** Character personality */
  personality?: string;
  /** Character background */
  background?: string;
  /** Generation style */
  style?: string;
  /** Response format */
  responseFormat?: string;
  /** Model */
  model?: string;
  /** Number of images */
  n: number;
  /** Image width */
  width?: number;
  /** Image height */
  height?: number;
  /** Quality */
  quality?: string;
  /** Prompt */
  prompt?: string;
  /** Negative prompt */
  negativePrompt?: string;
}
