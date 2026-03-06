from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponRedeemForm:
    """优惠券兑换请求"""
    redeem_code: str
    channel: str = None
