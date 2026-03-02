import type { AudioEffectGenerationInput } from './audio-effect-generation-input';
import type { AudioGenerationInput } from './audio-generation-input';
import type { CharacterGenerationInput } from './character-generation-input';
import type { ImageGenerationInput } from './image-generation-input';
import type { MusicGenerationInput } from './music-generation-input';
import type { VideoGenerationInput } from './video-generation-input';
import type { VoiceSpeakerGenerationInput } from './voice-speaker-generation-input';

/** AI生成任务输入参数 */
export interface GenerationInputParams {
  /** 图像生成输入参数 */
  image?: ImageGenerationInput;
  /** 视频生成输入参数 */
  video?: VideoGenerationInput;
  /** 音频生成输入参数 */
  audio?: AudioGenerationInput;
  /** 音乐生成输入参数 */
  music?: MusicGenerationInput;
  /** 语音说话人生成输入参数 */
  voice?: VoiceSpeakerGenerationInput;
  /** 角色生成输入参数 */
  character?: CharacterGenerationInput;
  /** 音效生成输入参数 */
  audioEffect?: AudioEffectGenerationInput;
}
