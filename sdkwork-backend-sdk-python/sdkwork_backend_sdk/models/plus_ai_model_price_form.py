from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusAiModelPriceForm:
    """Model price creation form"""
    object_id: str
    model: str
    model_id: int = None
    channel: str = None
    model_key: str = None
    product_code: str = None
    feature_code: str = None
    billing_type: str = None
    price_item_type: str = None
    tier_name: str = None
    rule_priority: int = None
    unit: str
    unit_size: float = None
    price: float = None
    input_price: float = None
    batch_input_price: float = None
    cached_input_price: float = None
    batch_cached_input_price: float = None
    output_price: float = None
    batch_output_price: float = None
    currency: str
    min_usage: float = None
    max_usage: float = None
    effective_from: str = None
    effective_to: str = None
    default_rule: bool = None
    status: str = None
    metadata: Dict[str, Any] = None
