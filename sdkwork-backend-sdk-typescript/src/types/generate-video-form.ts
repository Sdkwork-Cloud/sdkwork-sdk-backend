/** Video generation request form */
export interface GenerateVideoForm {
  /** Prompt text for video generation */
  prompt?: string;
  /** Negative prompt to exclude certain elements */
  negativePrompt?: string;
  /** Number of videos to generate */
  n?: number;
  /** Width of the generated video in pixels */
  width?: number;
  /** Height of the generated video in pixels */
  height?: number;
  /** Video generation model to use */
  model?: string;
  /** Format of the response */
  responseFormat?: string;
  /** Style of the generated video */
  style?: string;
  /** Aspect ratio of the generated video */
  aspectRatio?: string;
}
