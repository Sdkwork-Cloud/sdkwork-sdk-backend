from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ModelPriceItem:
    """模型定价具体条目（包含价格类型和对应价格数值）"""
    type: str = None
    price: float = None
