import type { PlusPptThemeOutline } from './plus-ppt-theme-outline';
import type { PlusPptThemeShadow } from './plus-ppt-theme-shadow';

/** PPT主题样式定义 */
export interface PlusPptTheme {
  /** 主题主要颜色方案 */
  themeColors: string[];
  /** 次要颜色方案 */
  subColors: string[];
  /** 导出用主题颜色集合 */
  exportThemeColors: string[];
  /** 默认字体颜色 */
  fontColor: string;
  /** 字体名称，为空时使用默认字体 */
  fontName?: string;
  /** 幻灯片背景颜色 */
  backgroundColor: string;
  /** 元素阴影效果设置 */
  shadow?: PlusPptThemeShadow;
  /** 元素轮廓效果设置 */
  outline?: PlusPptThemeOutline;
}
