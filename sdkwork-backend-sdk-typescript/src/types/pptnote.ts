import type { PPTNoteReply } from './pptnote-reply';

/** 批注 */
export interface PPTNote {
  /** 批注ID */
  id: string;
  /** 批注内容 */
  content: string;
  /** 批注时间 */
  time: number;
  /** 批注用户 */
  user: string;
  /** 元素ID */
  elId?: string;
  /** 回复列表 */
  replies?: PPTNoteReply[];
}
