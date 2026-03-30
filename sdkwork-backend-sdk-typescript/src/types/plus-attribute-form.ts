/** Attribute creation form */
export interface PlusAttributeForm {
  /** Attribute name */
  name: string;
  /** Attribute code */
  code: string;
  /** Attribute description */
  description?: string;
  /** Attribute type */
  type: 'CATEGORY' | 'PRODUCT_ATTRIBUTE' | 'SKU_ATTRIBUTE';
  /** Content type */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB' | 'SKILL';
  /** Content ID */
  contentId: number;
  /** Category ID */
  categoryId: number;
  /** Attribute value */
  attributeValue?: string;
  /** Sort weight */
  sortWeight?: number;
  /** Whether the attribute is required */
  required: number;
  /** Attribute status */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
