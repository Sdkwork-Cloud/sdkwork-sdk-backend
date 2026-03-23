import type { PPTGradient } from './pptgradient';
import type { PPTSlideBackgroundImage } from './pptslide-background-image';
import type { PPTSlideBackgroundType } from './pptslide-background-type';

/** å¹»ç¯çèæ¯ */
export interface PPTSlideBackground {
  /** èæ¯ç±»åï¼çº¯è²ãå¾çãæ¸åï¼ */
  type: PPTSlideBackgroundType;
  /** èæ¯é¢è²ï¼çº¯è²ï¼ */
  color?: string;
  /** å¾çèæ¯ */
  image?: PPTSlideBackgroundImage;
  pptgradient?: PPTGradient;
}
