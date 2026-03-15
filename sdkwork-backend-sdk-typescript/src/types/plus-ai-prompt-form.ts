import type { TagsContent } from './tags-content';

/** Prompt creation form */
export interface PlusAiPromptForm {
  /** Prompt title */
  title: string;
  /** Prompt content */
  content: string;
  /** Prompt description */
  description?: string;
  /** Category ID */
  categoryId?: number;
  /** Whether the prompt is enabled */
  enabled: boolean;
  /** Sort order */
  sort?: number;
  /** Prompt parameters */
  parameters?: Record<string, unknown>;
  /** Creator */
  creator?: string;
  /** Model */
  model?: string;
  /** Tags */
  tags?: TagsContent;
  /** Usage count */
  usageCount?: number;
  /** Average response time */
  avgResponseTime?: number;
}
