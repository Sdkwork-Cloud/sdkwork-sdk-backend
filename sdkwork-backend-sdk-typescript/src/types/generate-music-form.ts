/** Music generation request form */
export interface GenerateMusicForm {
  /** Prompt text for music generation */
  prompt?: string;
  /** Lyrics for the music generation */
  lyrics?: string;
  /** Number of music pieces to generate */
  n?: number;
  /** Music generation model to use */
  model?: string;
  /** Tempo of the generated music in BPM */
  tempo?: number;
  /** Style of the generated music */
  style?: string;
  /** Primary instrument for the generated music */
  instrument?: string;
}
