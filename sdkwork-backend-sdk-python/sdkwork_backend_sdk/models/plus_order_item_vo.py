from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderItemVO:
    """订单项Value Object，支持多种商品类型：1.实物商品 2.虚拟商品(如电子书、课程等) 3.会员服务"""
    created_at: str = None
    updated_at: str = None
    order_id: int = None
    product_type: str = None
    product_id: int = None
    sku_id: int = None
    quantity: int = None
    unit_price: float = None
    total_amount: float = None
    expire_time: str = None
    content_type: str = None
    content_id: int = None
