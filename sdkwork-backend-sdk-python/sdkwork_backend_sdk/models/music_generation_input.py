from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicGenerationInput:
    """音乐生成输入参数"""
    title: str = None
    prompt: str = None
    negative_prompt: str = None
    reference_assets: List[AssetMediaResource] = None
    storyboard: VideoStoryboard = None
    parameters: Dict[str, Any] = None
    n: int = None
    seed: int = None
    format: str = None
    lyrics: str = None
    duration: int = None
    genre: str = None
    style: str = None
    tempo: int = None
    key: str = None
    time_signature: str = None
    mood: str = None
    instruments: str = None
    instrumental: bool = None
    hd: bool = None
    reference_asset_count: int = None
