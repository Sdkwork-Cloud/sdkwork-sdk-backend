from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CouponRollbackForm:
    """Coupon rollback request"""
    reason: str = None
