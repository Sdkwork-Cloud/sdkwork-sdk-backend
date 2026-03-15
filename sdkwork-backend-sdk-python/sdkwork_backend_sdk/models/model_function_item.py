from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelFunctionItem:
    """模型功能配置项（包含具体媒体类型和高级功能的支持标识）"""
    type: str = None
    supported: bool = None
