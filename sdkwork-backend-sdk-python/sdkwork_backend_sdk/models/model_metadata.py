from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelMetadata:
    """模型附加技术特性信息（包含多模态支持、生成能力等）"""
    durations: List[int] = None
    resolutions: List[str] = None
    ratios: List[AspectRatio] = None
    is_multimodal: bool = None
    is_reasoning: bool = None
    is_tool_call: bool = None
