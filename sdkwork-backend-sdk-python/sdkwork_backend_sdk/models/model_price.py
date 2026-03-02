from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelPrice:
    """AI模型服务价格配置信息"""
    unit: str = None
    items: List[ModelPriceItem] = None
    currency: str = None
