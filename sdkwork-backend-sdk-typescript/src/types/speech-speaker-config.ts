import type { VoiceSpeakerInfo } from './voice-speaker-info';

export interface SpeechSpeakerConfig {
  speaker?: VoiceSpeakerInfo;
  speakerId?: number;
  volume?: number;
  pitch?: number;
  language?: string;
  speed?: number;
  format?: string;
}
