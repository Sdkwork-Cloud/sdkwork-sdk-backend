from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationOutput:
    """AI生成任务输出结果"""
    resources: List[AssetMediaResource] = None
    primary_url: str = None
    urls: List[str] = None
    duration_ms: int = None
    token_usage: int = None
    cost: float = None
    model_version: str = None
    seed: int = None
    metadata: Dict[str, Any] = None
    created_at: str = None
    resource_count: int = None
    primary_resource: AssetMediaResource = None
