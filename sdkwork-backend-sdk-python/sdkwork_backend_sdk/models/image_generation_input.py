from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ImageGenerationInput:
    """图片生成输入参数"""
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
    size: str = None
    quality: str = None
    style: str = None
    cfg_scale: float = None
    steps: int = None
    sampler: str = None
    strength: float = None
    safety_checker: bool = None
    aspect_ratio: str = None
    reference_asset_count: int = None
