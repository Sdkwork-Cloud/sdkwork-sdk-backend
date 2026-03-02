/** PPT模板详情配置VO（存储模板中各页面/section的具体配置） */
export interface PlusPptTemplateSlideVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 关联的PPT模板ID */
  templateId?: number;
  /** 模板section标题（如'封面页'、'目录页'、'内容页1'等） */
  sectionTitle?: string;
  /** 模板section内容描述（可包含占位符说明） */
  sectionContent?: string;
  /** 页码（模板中的页面序号） */
  pageNumber?: number;
  /** 页面布局类型（1-标题页/2-内容页/3-标题+内容/4-分栏内容） */
  layoutType?: 'DEFAULT' | 'TITLE' | 'CONTENT' | 'TITLE_CONTENT' | 'COLUMN_CONTENT';
  /** 背景图片URL */
  backgroundImage?: string;
  /** 排序序号（用于调整section在模板中的展示顺序） */
  sortOrder?: number;
  /** 是否必填section（true-必填/false-可选） */
  isRequired?: boolean;
}
