from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponPointsExchangeForm:
    """积分兑换优惠券请求"""
    request_no: str
