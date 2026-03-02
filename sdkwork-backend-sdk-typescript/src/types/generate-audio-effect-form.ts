/** Audio effect generation form parameters */
export interface GenerateAudioEffectForm {
  /** Title */
  title?: string;
  /** Prompt */
  prompt?: string;
  /** Audio type (music/voice/environmental) */
  audioType?: string;
  /** Effect type (reverb/delay/compressor etc.) */
  effectType?: string;
  /** Effect intensity */
  intensity?: number;
  /** Effect parameters (JSON format) */
  effectParams?: string;
  /** Model */
  model?: string;
  /** Channel */
  channel?: string;
}
