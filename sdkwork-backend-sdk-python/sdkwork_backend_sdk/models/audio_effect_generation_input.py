from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class AudioEffectGenerationInput:
    """音效生成输入参数"""
    title: str = None
    prompt: str = None
    negative_prompt: str = None
    reference_assets: List[AssetMediaResource] = None
    storyboard: VideoStoryboard = None
    parameters: Dict[str, Any] = None
    n: int = None
    seed: int = None
    format: str = None
    description: str = None
    category: str = None
    duration: int = None
    sample_rate: int = None
    bit_rate: int = None
    channels: int = None
    loop: bool = None
    fade_in: float = None
    fade_out: float = None
    reference_asset_count: int = None
