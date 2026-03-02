from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class StripeObject:
    """Stripe支付创建订单返回对象"""
    session_id: str = None
    payment_url: str = None
    client_secret: str = None
    payment_intent_id: str = None
    publishable_key: str = None
    return_url: str = None
    amount: str = None
    currency: str = None
