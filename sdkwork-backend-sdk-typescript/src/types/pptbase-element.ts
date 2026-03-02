import type { PPTElementLink } from './pptelement-link';

/** 元素通用属性 */
export interface PPTBaseElement {
  /** 元素ID */
  id: string;
  /** 元素水平方向位置（距离画布左侧） */
  left: number;
  /** 元素垂直方向位置（距离画布顶部） */
  top: number;
  /** 锁定元素 */
  lock?: boolean;
  /** 组合ID（拥有相同组合ID的元素即为同一组合元素成员） */
  groupId?: string;
  /** 元素宽度 */
  width: number;
  /** 元素高度 */
  height: number;
  /** 旋转角度 */
  rotate: number;
  /** 超链接 */
  link?: PPTElementLink;
  /** 元素名 */
  name?: string;
}
