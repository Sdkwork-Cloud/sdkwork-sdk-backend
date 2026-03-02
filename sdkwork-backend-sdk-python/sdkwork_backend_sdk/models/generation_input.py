from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationInput:
    """AI生成任务输入参数统一入口"""
    type: str = None
    image: ImageGenerationInput = None
    video: VideoGenerationInput = None
    audio: AudioGenerationInput = None
    music: MusicGenerationInput = None
    character: CharacterGenerationInput = None
    voice_speaker: VoiceSpeakerGenerationInput = None
    audio_effect: AudioEffectGenerationInput = None
    input: BaseGenerationInput = None
    prompt: str = None
