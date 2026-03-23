import type { AudioEffectGenerationInput } from './audio-effect-generation-input';
import type { AudioGenerationInput } from './audio-generation-input';
import type { BaseGenerationInput } from './base-generation-input';
import type { CharacterGenerationInput } from './character-generation-input';
import type { ImageGenerationInput } from './image-generation-input';
import type { MusicGenerationInput } from './music-generation-input';
import type { VideoGenerationInput } from './video-generation-input';
import type { VoiceSpeakerGenerationInput } from './voice-speaker-generation-input';

/** AIçæä»»å¡è¾å¥åæ°ç»ä¸å¥å£ */
export interface GenerationInput {
  /** çæç±»å */
  type?: 'DEFAULT' | 'IMAGE' | 'VIDEO' | 'SPEECH' | 'MUSIC' | 'MODEL_3D' | 'CODE' | 'DOCUMENT' | 'PPT' | 'VIDEO_AUTO_SLICE' | 'VOICE_SPEAKER' | 'CHARACTER' | 'AUDIO_EFFECT' | 'FILM' | 'OTHER';
  /** å¾ççæåæ° */
  image?: ImageGenerationInput;
  /** è§é¢çæåæ° */
  video?: VideoGenerationInput;
  /** é³é¢çæåæ° */
  audio?: AudioGenerationInput;
  /** é³ä¹çæåæ° */
  music?: MusicGenerationInput;
  /** è§è²çæåæ° */
  character?: CharacterGenerationInput;
  /** è¯­é³è¯´è¯äººçæåæ° */
  voiceSpeaker?: VoiceSpeakerGenerationInput;
  /** é³æçæåæ° */
  audioEffect?: AudioEffectGenerationInput;
  input?: BaseGenerationInput;
  prompt?: string;
}
