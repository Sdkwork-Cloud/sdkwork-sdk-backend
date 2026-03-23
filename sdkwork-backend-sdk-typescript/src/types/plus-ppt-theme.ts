import type { PlusPptThemeOutline } from './plus-ppt-theme-outline';
import type { PlusPptThemeShadow } from './plus-ppt-theme-shadow';

/** PPTä¸»é¢æ ·å¼å®ä¹ */
export interface PlusPptTheme {
  /** ä¸»é¢ä¸»è¦é¢è²æ¹æ¡ */
  themeColors: string[];
  /** æ¬¡è¦é¢è²æ¹æ¡ */
  subColors: string[];
  /** å¯¼åºç¨ä¸»é¢é¢è²éå */
  exportThemeColors: string[];
  /** é»è®¤å­ä½é¢è² */
  fontColor: string;
  /** å­ä½åç§°ï¼ä¸ºç©ºæ¶ä½¿ç¨é»è®¤å­ä½ */
  fontName?: string;
  /** å¹»ç¯çèæ¯é¢è² */
  backgroundColor: string;
  /** åç´ é´å½±ææè®¾ç½® */
  shadow?: PlusPptThemeShadow;
  /** åç´ è½®å»ææè®¾ç½® */
  outline?: PlusPptThemeOutline;
}
