from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponRedeemForm:
    """Coupon redeem form"""
    redeem_code: str
