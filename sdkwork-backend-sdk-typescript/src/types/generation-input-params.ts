import type { AudioEffectGenerationInput } from './audio-effect-generation-input';
import type { AudioGenerationInput } from './audio-generation-input';
import type { CharacterGenerationInput } from './character-generation-input';
import type { ImageGenerationInput } from './image-generation-input';
import type { MusicGenerationInput } from './music-generation-input';
import type { VideoGenerationInput } from './video-generation-input';
import type { VoiceSpeakerGenerationInput } from './voice-speaker-generation-input';

/** AIçæä»»å¡è¾å¥åæ° */
export interface GenerationInputParams {
  /** å¾åçæè¾å¥åæ° */
  image?: ImageGenerationInput;
  /** è§é¢çæè¾å¥åæ° */
  video?: VideoGenerationInput;
  /** é³é¢çæè¾å¥åæ° */
  audio?: AudioGenerationInput;
  /** é³ä¹çæè¾å¥åæ° */
  music?: MusicGenerationInput;
  /** è¯­é³è¯´è¯äººçæè¾å¥åæ° */
  voice?: VoiceSpeakerGenerationInput;
  /** è§è²çæè¾å¥åæ° */
  character?: CharacterGenerationInput;
  /** é³æçæè¾å¥åæ° */
  audioEffect?: AudioEffectGenerationInput;
}
