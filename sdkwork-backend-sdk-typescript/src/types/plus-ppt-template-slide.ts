import type { PlusPptPayload } from './plus-ppt-payload';
import type { PlusPptSlide } from './plus-ppt-slide';
import type { PlusPptTemplate } from './plus-ppt-template';
import type { PPTSlideType } from './pptslide-type';
import type { PPTTurningMode } from './pptturning-mode';

/** PPTæ¨¡æ¿å¹»ç¯çéç½®ï¼å­å¨æ¨¡æ¿ä¸­åä¸ªå¹»ç¯ççç»æåå±æ§ */
export interface PlusPptTemplateSlide {
  tenantId?: number;
  organizationId?: number;
  dataScope?: 'DEFAULT' | 'PRIVATE' | 'SHARED' | 'PUBLIC';
  id?: number;
  uuid?: string;
  createdAt?: string;
  updatedAt?: string;
  v?: number;
  /** æå±PPTæ¨¡æ¿ID */
  templateId: number;
  /** æå±PPTæ¨¡æ¿è¯¦ç»ä¿¡æ¯ */
  pptTemplate?: PlusPptTemplate;
  /** å¹»ç¯çåè½ç±»å */
  type: PPTSlideType;
  /** å¹»ç¯çæ¾ç¤ºæ é¢ */
  title?: string;
  /** å¹»ç¯çåå®¹è¯´ææå¤æ³¨ */
  description?: string;
  /** å¹»ç¯çå¨æ¨¡æ¿ä¸­çæ¾ç¤ºé¡ºåºï¼å¼è¶å°è¶é å */
  sortOrder: number;
  /** å¹»ç¯çåå®¹å¸å±æ ·å¼ */
  layoutType?: 'DEFAULT' | 'TITLE' | 'CONTENT' | 'TITLE_CONTENT' | 'COLUMN_CONTENT';
  /** å¹»ç¯çè¯¦ç»éç½®ä¿¡æ¯ï¼åå«ç»æå®ä¹ååå®¹å±æ§ */
  slideConfig?: PlusPptSlide;
  /** å¹»ç¯çè¯¦ç»åå®¹å®ä¹ï¼JSONæ ¼å¼å­å¨ */
  payload?: PlusPptPayload;
  pptturningMode?: PPTTurningMode;
}
