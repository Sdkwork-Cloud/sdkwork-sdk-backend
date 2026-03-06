from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponRollbackForm:
    """优惠券回滚请求"""
    reason: str = None
