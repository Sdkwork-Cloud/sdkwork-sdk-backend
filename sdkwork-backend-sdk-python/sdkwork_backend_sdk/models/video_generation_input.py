from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class VideoGenerationInput:
    """视频生成输入参数"""
    title: str = None
    prompt: str = None
    negative_prompt: str = None
    reference_assets: List[AssetMediaResource] = None
    storyboard: VideoStoryboard = None
    parameters: Dict[str, Any] = None
    n: int = None
    seed: int = None
    format: str = None
    width: int = None
    height: int = None
    duration: int = None
    fps: int = None
    style: str = None
    aspect_ratio: str = None
    motion_strength: int = None
    camera_motion: str = None
    loop: bool = None
    hd: bool = None
    subtitle: bool = None
    text_to_video: bool = None
    reference_asset_count: int = None
