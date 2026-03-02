import type { PlusPptPayload } from './plus-ppt-payload';
import type { PPTAnimation } from './pptanimation';
import type { PPTBaseElement } from './pptbase-element';
import type { PPTNote } from './pptnote';
import type { PPTSectionTag } from './pptsection-tag';
import type { PPTSlideBackground } from './pptslide-background';
import type { PPTSlideType } from './pptslide-type';
import type { PPTTurningMode } from './pptturning-mode';

/** PPT幻灯片信息 */
export interface PlusPptSlide {
  /** 页面ID */
  id: string;
  /** 元素集合 */
  elements: PPTBaseElement[];
  /** 批注 */
  notes?: PPTNote[];
  /** 备注 */
  remark?: string;
  /** 页面背景 */
  background?: PPTSlideBackground;
  /** 元素动画集合 */
  animations?: PPTAnimation[];
  /** 翻页方式 */
  turningMode?: PPTTurningMode;
  /** 章节标签 */
  sectionTag?: PPTSectionTag;
  /** 页面类型 */
  type?: PPTSlideType;
  /** 幻灯片内容载荷 */
  payload?: PlusPptPayload;
}
