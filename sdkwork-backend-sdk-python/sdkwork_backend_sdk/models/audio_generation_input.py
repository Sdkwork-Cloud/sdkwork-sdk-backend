from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioGenerationInput:
    """音频生成输入参数(语音合成TTS)"""
    title: str = None
    prompt: str = None
    negative_prompt: str = None
    reference_assets: List[AssetMediaResource] = None
    storyboard: VideoStoryboard = None
    parameters: Dict[str, Any] = None
    n: int = None
    seed: int = None
    format: str = None
    text: str = None
    voice: str = None
    voice_speaker_id: int = None
    language: str = None
    speed: float = None
    pitch: float = None
    volume: int = None
    sample_rate: int = None
    bit_rate: int = None
    channels: int = None
    emotion: str = None
    reference_asset_count: int = None
