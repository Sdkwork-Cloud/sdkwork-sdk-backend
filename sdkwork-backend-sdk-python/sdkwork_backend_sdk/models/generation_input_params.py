from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationInputParams:
    """AI生成任务输入参数"""
    image: ImageGenerationInput = None
    video: VideoGenerationInput = None
    audio: AudioGenerationInput = None
    music: MusicGenerationInput = None
    voice: VoiceSpeakerGenerationInput = None
    character: CharacterGenerationInput = None
    audio_effect: AudioEffectGenerationInput = None
