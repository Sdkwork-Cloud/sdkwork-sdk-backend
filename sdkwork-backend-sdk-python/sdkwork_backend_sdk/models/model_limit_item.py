from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelLimitItem:
    """模型服务限制配置项（包含限制类型和具体数值）"""
    type: str = None
    value: float = None
