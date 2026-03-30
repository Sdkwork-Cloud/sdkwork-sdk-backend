import type { PPTGradientColor } from './pptgradient-color';
import type { PPTGradientType } from './pptgradient-type';

/** 渐变 */
export interface PPTGradient {
  /** 渐变类型（径向、线性） */
  type: PPTGradientType;
  /** 渐变颜色列表 */
  colors: PPTGradientColor[];
  /** 渐变角度（线性渐变） */
  rotate: number;
}
