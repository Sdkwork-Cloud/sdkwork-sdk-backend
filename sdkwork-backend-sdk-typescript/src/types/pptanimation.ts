import type { PPTAnimationTrigger } from './pptanimation-trigger';
import type { PPTAnimationType } from './pptanimation-type';

/** åç´ å¨ç» */
export interface PPTAnimation {
  /** å¨ç»id */
  id: string;
  /** åç´ ID */
  elId: string;
  /** å¨ç»ææ */
  effect: string;
  /** å¨ç»ç±»åï¼å¥åºãéåºãå¼ºè°ï¼ */
  type: PPTAnimationType;
  /** å¨ç»æç»­æ¶é´ */
  duration: number;
  /** å¨ç»è§¦åæ¹å¼ */
  trigger: PPTAnimationTrigger;
}
