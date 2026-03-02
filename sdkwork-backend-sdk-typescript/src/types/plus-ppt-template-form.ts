import type { ImageMediaResourceList } from './image-media-resource-list';
import type { PlusPptTemplateMeta } from './plus-ppt-template-meta';
import type { PlusPptTemplateSlide } from './plus-ppt-template-slide';
import type { PlusPptTemplateTags } from './plus-ppt-template-tags';

/** PPT template creation form */
export interface PlusPptTemplateForm {
  /** 模板名称（唯一标识） */
  title: string;
  /** 模板描述信息 */
  description?: string;
  /** 模板封面图URL/路径 */
  coverImages?: ImageMediaResourceList;
  /** 模板类型（如商业、教育、汇报等） */
  type: 'DEFAULT' | 'BUSINESS' | 'EDUCATION' | 'REPORT' | 'OTHER';
  /** 模板状态（启用/禁用/草稿） */
  status: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'DRAFT';
  /** 模板作者ID（关联用户表） */
  authorId: number;
  /** 模板作者名称 */
  authorName?: string;
  /** PPT tags信息(JSON格式) */
  tags?: PlusPptTemplateTags;
  /** PPT meta信息(JSON格式) */
  meta?: PlusPptTemplateMeta;
  /** PPT slides列表 */
  slides?: PlusPptTemplateSlide[];
}
