import type { PPTElementLinkType } from './pptelement-link-type';

/** åç´ è¶é¾æ¥ */
export interface PPTElementLink {
  /** é¾æ¥ç±»åï¼ç½é¡µãå¹»ç¯çé¡µé¢ï¼ */
  type: PPTElementLinkType;
  /** ç®æ å°åï¼ç½é¡µé¾æ¥ãå¹»ç¯çé¡µé¢IDï¼ */
  target: string;
}
