/** PPT template slide creation form */
export interface PlusPptTemplateSlideForm {
  /** 关联的PPT模板ID */
  templateId: number;
  /** 模板section标题（如'封面页'、'目录页'、'内容页1'等） */
  sectionTitle: string;
  /** 模板section内容描述（可包含占位符说明，如'此处填写公司名称'） */
  sectionContent?: string;
  /** 页码（模板中的页面序号） */
  pageNumber: number;
  /** 页面布局类型（标题页/内容页/标题+内容/分栏内容等） */
  layoutType: 'DEFAULT' | 'TITLE' | 'CONTENT' | 'TITLE_CONTENT' | 'COLUMN_CONTENT';
  /** 背景图片URL/路径（如'https://example.com/bg/title.jpg'） */
  backgroundImage?: string;
  /** 排序序号（用于调整section在模板中的展示顺序） */
  sortOrder: number;
  /** 是否为必填section（true-必填，生成PPT时不可删除；false-可选，可删除） */
  isRequired: boolean;
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
}
