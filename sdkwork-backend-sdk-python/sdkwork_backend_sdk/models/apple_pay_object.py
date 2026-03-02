from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ApplePayObject:
    """Apple Pay支付创建订单返回对象"""
    payment_data: str = None
    merchant_id: str = None
    transaction_id: str = None
    display_name: str = None
    network: str = None
    type: str = None
    amount: str = None
    currency_code: str = None
