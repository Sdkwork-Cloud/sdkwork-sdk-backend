import type { PlusPptPayload } from './plus-ppt-payload';
import type { PPTAnimation } from './pptanimation';
import type { PPTBaseElement } from './pptbase-element';
import type { PPTNote } from './pptnote';
import type { PPTSectionTag } from './pptsection-tag';
import type { PPTSlideBackground } from './pptslide-background';
import type { PPTSlideType } from './pptslide-type';
import type { PPTTurningMode } from './pptturning-mode';

/** PPTå¹»ç¯çä¿¡æ¯ */
export interface PlusPptSlide {
  /** é¡µé¢ID */
  id: string;
  /** åç´ éå */
  elements: PPTBaseElement[];
  /** æ¹æ³¨ */
  notes?: PPTNote[];
  /** å¤æ³¨ */
  remark?: string;
  /** é¡µé¢èæ¯ */
  background?: PPTSlideBackground;
  /** åç´ å¨ç»éå */
  animations?: PPTAnimation[];
  /** ç¿»é¡µæ¹å¼ */
  turningMode?: PPTTurningMode;
  /** ç« èæ ç­¾ */
  sectionTag?: PPTSectionTag;
  /** é¡µé¢ç±»å */
  type?: PPTSlideType;
  /** å¹»ç¯çåå®¹è½½è· */
  payload?: PlusPptPayload;
}
