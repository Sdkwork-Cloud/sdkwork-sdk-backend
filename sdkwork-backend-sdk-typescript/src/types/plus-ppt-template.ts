import type { ImageMediaResourceList } from './image-media-resource-list';
import type { PlusPptTemplateMeta } from './plus-ppt-template-meta';
import type { PlusPptTemplateSlide } from './plus-ppt-template-slide';
import type { PlusPptTemplateTags } from './plus-ppt-template-tags';
import type { PlusUser } from './plus-user';

/** PPT模板实体，存储模板基本信息、结构定义及关联关系 */
export interface PlusPptTemplate {
  tenantId?: number;
  organizationId?: number;
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  v?: number;
  /** 模板名称，系统内唯一 */
  title: string;
  /** 模板功能、适用场景等详细说明 */
  description?: string;
  /** 封面图片URL列表 */
  coverImages?: ImageMediaResourceList;
  /** 模板分类类型 */
  type: 'BUSINESS' | 'EDUCATION' | 'REPORT' | 'OTHER';
  /** 模板使用状态 */
  status: 'ACTIVE' | 'DISABLED' | 'DRAFT';
  /** 模板创建者ID（关联用户表主键） */
  authorId: number;
  /** 模板创建者姓名（冗余字段，优化查询性能） */
  authorName?: string;
  /** 模板作者详细信息（关联用户表） */
  author?: PlusUser;
  /** 模板标签集合，JSON格式存储 */
  tags?: PlusPptTemplateTags;
  /** 模板元数据，包含宽高、主题等配置 */
  meta?: PlusPptTemplateMeta;
  /** 模板包含的幻灯片页面列表 */
  slides?: PlusPptTemplateSlide[];
}
