import type { ImageMediaResourceList } from './image-media-resource-list';
import type { PlusPptTemplateMeta } from './plus-ppt-template-meta';
import type { PlusPptTemplateSlideVO } from './plus-ppt-template-slide-vo';
import type { PlusPptTemplateTags } from './plus-ppt-template-tags';

/** PPT模板VO对象，存储PPT模板的基本信息及关联关系 */
export interface PlusPptTemplateVO {
  /** 创建时间 */
  createdAt?: string;
  /** 最后更新时间 */
  updatedAt?: string;
  /** 主键ID */
  id?: number;
  /** 通用唯一标识符UUID */
  uuid?: string;
  /** 模板名称 */
  title?: string;
  /** 模板描述 */
  description?: string;
  /** 模板封面图URL */
  coverImages?: ImageMediaResourceList;
  /** 模板类型（1-商业/2-教育/3-汇报/4-其他） */
  type?: 'DEFAULT' | 'BUSINESS' | 'EDUCATION' | 'REPORT' | 'OTHER';
  /** 模板状态（1-启用/2-禁用/3-草稿） */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DRAFT';
  /** 模板作者ID */
  authorId?: number;
  /** 模板作者名称 */
  authorName?: string;
  /** PPT tags信息 */
  tags?: PlusPptTemplateTags;
  /** PPT meta信息 */
  meta?: PlusPptTemplateMeta;
  /** PPT模板详情列表 */
  slides?: PlusPptTemplateSlideVO[];
}
