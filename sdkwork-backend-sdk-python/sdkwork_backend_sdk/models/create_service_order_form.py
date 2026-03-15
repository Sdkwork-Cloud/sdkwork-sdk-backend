from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CreateServiceOrderForm:
    """Create service order form"""
    publisher_user_id: int = None
    subject: str = None
    task_code: str
    dispatch_mode: str
    total_amount: float
    dispatch_expire_time: str = None
    expire_time: str = None
    task_payload: Dict[str, Any] = None
    remark: str = None
