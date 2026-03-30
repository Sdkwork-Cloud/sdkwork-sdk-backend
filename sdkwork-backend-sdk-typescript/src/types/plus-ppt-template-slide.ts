import type { PlusPptPayload } from './plus-ppt-payload';
import type { PlusPptSlide } from './plus-ppt-slide';
import type { PlusPptTemplate } from './plus-ppt-template';
import type { PPTSlideType } from './pptslide-type';
import type { PPTTurningMode } from './pptturning-mode';

/** PPT模板幻灯片配置，存储模板中单个幻灯片的结构和属性 */
export interface PlusPptTemplateSlide {
  tenantId?: number;
  organizationId?: number;
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  v?: number;
  /** 所属PPT模板ID */
  templateId: number;
  /** 所属PPT模板详细信息 */
  pptTemplate?: PlusPptTemplate;
  /** 幻灯片功能类型 */
  type: PPTSlideType;
  /** 幻灯片显示标题 */
  title?: string;
  /** 幻灯片内容说明或备注 */
  description?: string;
  /** 幻灯片在模板中的显示顺序，值越小越靠前 */
  sortOrder: number;
  /** 幻灯片内容布局样式 */
  layoutType?: 'DEFAULT' | 'TITLE' | 'CONTENT' | 'TITLE_CONTENT' | 'COLUMN_CONTENT';
  /** 幻灯片详细配置信息，包含结构定义和内容属性 */
  slideConfig?: PlusPptSlide;
  /** 幻灯片详细内容定义，JSON格式存储 */
  payload?: PlusPptPayload;
  pptturningMode?: PPTTurningMode;
}
