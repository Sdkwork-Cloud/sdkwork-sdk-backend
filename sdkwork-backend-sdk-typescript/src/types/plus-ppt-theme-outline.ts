/** 轮廓效果设置 */
export interface PlusPptThemeOutline {
  /** 轮廓线宽度(像素) */
  width: number;
  /** 轮廓线颜色 */
  color: string;
  /** 轮廓线样式 */
  style: 'solid' | 'dashed' | 'dotted' | 'double';
}
