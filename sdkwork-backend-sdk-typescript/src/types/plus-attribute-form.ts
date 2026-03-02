/** Attribute creation form */
export interface PlusAttributeForm {
  /** 属性名称 */
  name: string;
  /** 属性编码（唯一标识） */
  code: string;
  /** 属性描述 */
  description?: string;
  /** 属性类型(PROPERTY:商品属性,SKU_ATTRIBUTE:SKU属性,SKU_VALUE:SKU属性值,SPECIFICATION:规格参数) */
  type: 'CATEGORY' | 'PRODUCT_ATTRIBUTE' | 'SKU_ATTRIBUTE';
  /** 内容类型(如:商品、会员、新闻等) */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** 关联内容ID(外键关联对应实体的ID) */
  contentId: number;
  /** 所属分类ID */
  categoryId: number;
  /** 属性值（如颜色：红色、蓝色） */
  attributeValue?: string;
  /** 排序权重（值越大排序越靠前） */
  sortWeight?: number;
  /** 是否必填(0:否,1:是) */
  required: number;
  /** 属性状态(1:启用,2:禁用,3:删除) */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DELETED';
}
