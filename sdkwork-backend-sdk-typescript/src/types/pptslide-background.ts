import type { PPTGradient } from './pptgradient';
import type { PPTSlideBackgroundImage } from './pptslide-background-image';
import type { PPTSlideBackgroundType } from './pptslide-background-type';

/** 幻灯片背景 */
export interface PPTSlideBackground {
  /** 背景类型（纯色、图片、渐变） */
  type: PPTSlideBackgroundType;
  /** 背景颜色（纯色） */
  color?: string;
  /** 图片背景 */
  image?: PPTSlideBackgroundImage;
  pptgradient?: PPTGradient;
}
