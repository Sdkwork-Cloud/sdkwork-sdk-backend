from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MemoryProfile:
    """AI模型服务令牌使用限制配置信息"""
    items: List[ProfileItem] = None
    customs: Dict[str, List[ProfileItem]] = None
    description: str = None
