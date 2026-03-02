from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SpeechConfig:
    speaker_config: SpeechSpeakerConfig = None
    transcription_config: SpeechTranscriptionConfig = None
    vad_config: VadConfig = None
    aec_config: AecConfig = None
