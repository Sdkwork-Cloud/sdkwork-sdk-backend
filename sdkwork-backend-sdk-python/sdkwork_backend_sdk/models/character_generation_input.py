from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CharacterGenerationInput:
    """虚拟角色生成输入参数"""
    title: str = None
    prompt: str = None
    negative_prompt: str = None
    reference_assets: List[AssetMediaResource] = None
    storyboard: VideoStoryboard = None
    parameters: Dict[str, Any] = None
    n: int = None
    seed: int = None
    format: str = None
    name: str = None
    description: str = None
    appearance: str = None
    personality: str = None
    background: str = None
    type: str = None
    style: str = None
    pose: str = None
    expression: str = None
    gender: str = None
    age: str = None
    clothing: str = None
    width: int = None
    height: int = None
    hd: bool = None
    multi_view: bool = None
    reference_asset_count: int = None
