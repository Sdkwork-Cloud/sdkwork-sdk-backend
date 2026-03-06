from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VoiceSpeakerGenerationInput:
    """语音说话人生成输入参数"""
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
    speaker_name: str = None
    speaker_id: str = None
    language: str = None
    speed: float = None
    pitch: float = None
    volume: int = None
    emotion: str = None
    save_speaker: bool = None
    voice_clone: bool = None
    using_existing_speaker: bool = None
    reference_asset_count: int = None
