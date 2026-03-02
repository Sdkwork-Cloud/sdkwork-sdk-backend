import type { PPTAnimationTrigger } from './pptanimation-trigger';
import type { PPTAnimationType } from './pptanimation-type';

/** 元素动画 */
export interface PPTAnimation {
  /** 动画id */
  id: string;
  /** 元素ID */
  elId: string;
  /** 动画效果 */
  effect: string;
  /** 动画类型（入场、退场、强调） */
  type: PPTAnimationType;
  /** 动画持续时间 */
  duration: number;
  /** 动画触发方式 */
  trigger: PPTAnimationTrigger;
}
