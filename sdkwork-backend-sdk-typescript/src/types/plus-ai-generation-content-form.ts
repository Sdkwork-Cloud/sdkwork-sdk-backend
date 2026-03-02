/** AI generated content creation form */
export interface PlusAiGenerationContentForm {
  /** 生成内容的标题 */
  title?: string;
  /** 生成内容的描述信息 */
  description?: string;
  /** 内容类型 */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID */
  contentId?: number;
  /** 内容元数据 */
  metadata?: Record<string, unknown>;
  /** 生成内容的存储URL */
  contentUrl?: string;
  /** 生成内容的文件大小 */
  fileSize?: number;
  /** 生成内容的格式 */
  contentFormat?: string;
}
