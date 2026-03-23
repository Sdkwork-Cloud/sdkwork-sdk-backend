import type { PPTNoteReply } from './pptnote-reply';

/** æ¹æ³¨ */
export interface PPTNote {
  /** æ¹æ³¨ID */
  id: string;
  /** æ¹æ³¨åå®¹ */
  content: string;
  /** æ¹æ³¨æ¶é´ */
  time: number;
  /** æ¹æ³¨ç¨æ· */
  user: string;
  /** åç´ ID */
  elId?: string;
  /** åå¤åè¡¨ */
  replies?: PPTNoteReply[];
}
