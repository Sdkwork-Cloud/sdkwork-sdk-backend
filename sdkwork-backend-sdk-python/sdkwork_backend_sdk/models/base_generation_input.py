from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class BaseGenerationInput:
    """AI生成任务输入参数基类"""
    title: str = None
    prompt: str = None
    negative_prompt: str = None
    reference_assets: List[AssetMediaResource] = None
    storyboard: VideoStoryboard = None
    parameters: Dict[str, Any] = None
    n: int = None
    seed: int = None
    format: str = None
    reference_asset_count: int = None
