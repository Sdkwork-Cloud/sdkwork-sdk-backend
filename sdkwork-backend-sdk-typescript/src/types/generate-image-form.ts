/** Image generation request form */
export interface GenerateImageForm {
  /** Prompt text for image generation */
  prompt?: string;
  /** Negative prompt to exclude certain elements */
  negativePrompt?: string;
  /** Number of images to generate */
  n?: number;
  /** Width of the generated image in pixels */
  width?: number;
  /** Height of the generated image in pixels */
  height?: number;
  /** Image generation model to use */
  model?: string;
  /** Format of the response */
  responseFormat?: string;
  /** Style of the generated image */
  style?: string;
  /** Aspect ratio of the generated image */
  aspectRatio?: string;
}
