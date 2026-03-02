from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiModelPriceVO:
    """AI模型价格VO"""
    created_at: str = None
    updated_at: str = None
    object_id: str = None
    model: str = None
    unit: str = None
    price: float = None
    input_price: float = None
    batch_input_price: float = None
    cached_input_price: float = None
    batch_cached_input_price: float = None
    output_price: float = None
    batch_output_price: float = None
    currency: str = None
