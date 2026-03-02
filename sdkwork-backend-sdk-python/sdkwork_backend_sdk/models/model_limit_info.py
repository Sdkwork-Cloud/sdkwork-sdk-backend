from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelLimitInfo:
    """AI模型服务令牌使用限制配置信息"""
    unit: str = None
    items: List[ModelLimitItem] = None
