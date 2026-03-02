from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiModelPriceForm:
    """Model price creation form"""
    object_id: str
    model: str
    unit: str
    price: float = None
    input_price: float = None
    batch_input_price: float = None
    cached_input_price: float = None
    batch_cached_input_price: float = None
    output_price: float = None
    batch_output_price: float = None
    currency: str
