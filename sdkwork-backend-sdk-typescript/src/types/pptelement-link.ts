import type { PPTElementLinkType } from './pptelement-link-type';

/** 元素超链接 */
export interface PPTElementLink {
  /** 链接类型（网页、幻灯片页面） */
  type: PPTElementLinkType;
  /** 目标地址（网页链接、幻灯片页面ID） */
  target: string;
}
