import type { GenerationInputParams } from './generation-input-params';
import type { GenerationOutput } from './generation-output';

/** AI generation content detail view object */
export interface PlusAiGenerationContentVO {
  /** Creation timestamp */
  createdAt?: string;
  /** Last update timestamp */
  updatedAt?: string;
  /** Primary key ID */
  id?: number;
  /** Universally unique identifier */
  uuid?: string;
  /** Entity version */
  version?: number;
  /** Content title */
  title?: string;
  /** Content description */
  description?: string;
  /** Content type */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB' | 'SKILL';
  /** Associated content ID */
  contentId?: number;
  /** Content metadata */
  metadata?: Record<string, unknown>;
  /** Input parameters */
  inputParams?: GenerationInputParams;
  /** Generation output */
  output?: GenerationOutput;
  /** Content format */
  contentFormat?: string;
  /** Content storage URL */
  contentUrl?: string;
  /** File size in bytes */
  fileSize?: number;
}
