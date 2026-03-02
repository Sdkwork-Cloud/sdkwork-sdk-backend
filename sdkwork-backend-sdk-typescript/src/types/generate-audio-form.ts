/** Audio Generation Form */
export interface GenerateAudioForm {
  /** Title */
  title?: string;
  /** Prompt/Text to convert */
  prompt?: string;
  /** Voice type */
  voice?: string;
  /** Model */
  model?: string;
  /** Format */
  format?: string;
  /** Speed */
  speed?: number;
}
