from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PaypalObject:
    """PayPal支付创建订单返回对象"""
    token: str = None
    payer_id: str = None
    payment_url: str = None
    invoice: str = None
    amount: str = None
    currency: str = None
    payment_status: str = None
    transaction_id: str = None
    return_url: str = None
    cancel_url: str = None
