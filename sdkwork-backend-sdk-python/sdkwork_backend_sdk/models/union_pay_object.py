from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class UnionPayObject:
    """银联支付创建订单返回对象"""
    pay_url: str = None
    tn: str = None
    mer_order_id: str = None
    mer_id: str = None
    mode: str = None
    scheme_str: str = None
    signature: str = None
