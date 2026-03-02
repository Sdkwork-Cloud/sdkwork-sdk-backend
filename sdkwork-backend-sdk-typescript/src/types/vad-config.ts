export interface VadConfig {
  speechThreshold?: number;
  minSpeechDurationMs?: number;
  minSilenceDurationMs?: number;
  maxSilenceDurationMs?: number;
  silenceTimeout?: number;
  speechTimeout?: number;
  windowSize?: number;
  stepSize?: number;
}
