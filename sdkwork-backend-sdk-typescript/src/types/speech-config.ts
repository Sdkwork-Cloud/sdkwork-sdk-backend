import type { AecConfig } from './aec-config';
import type { SpeechSpeakerConfig } from './speech-speaker-config';
import type { SpeechTranscriptionConfig } from './speech-transcription-config';
import type { VadConfig } from './vad-config';

export interface SpeechConfig {
  speakerConfig?: SpeechSpeakerConfig;
  transcriptionConfig?: SpeechTranscriptionConfig;
  vadConfig?: VadConfig;
  aecConfig?: AecConfig;
}
