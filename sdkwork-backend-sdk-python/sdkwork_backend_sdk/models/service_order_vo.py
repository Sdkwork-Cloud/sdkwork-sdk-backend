from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ServiceOrderVO:
    """Service order action result"""
    created_at: str = None
    updated_at: str = None
    order_id: int = None
    order_sn: str = None
    task_code: str = None
    dispatch_mode: str = None
    dispatch_status: str = None
    worker_user_id: int = None
    dispatch_expire_time: str = None
    success: bool = None
    message: str = None
