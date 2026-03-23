import type { PPTGradientColor } from './pptgradient-color';
import type { PPTGradientType } from './pptgradient-type';

/** æ¸å */
export interface PPTGradient {
  /** æ¸åç±»åï¼å¾åãçº¿æ§ï¼ */
  type: PPTGradientType;
  /** æ¸åé¢è²åè¡¨ */
  colors: PPTGradientColor[];
  /** æ¸åè§åº¦ï¼çº¿æ§æ¸åï¼ */
  rotate: number;
}
