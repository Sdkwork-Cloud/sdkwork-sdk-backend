/** Audio generation form */
export interface GenerateAudioForm {
  /** Title */
  title?: string;
  /** Prompt or text to convert */
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
