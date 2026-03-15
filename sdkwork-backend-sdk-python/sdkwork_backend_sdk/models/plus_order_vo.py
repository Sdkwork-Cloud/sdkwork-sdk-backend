from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderVO:
    """Order view object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    order_type: str = None
    user_id: int = None
    subject: str = None
    order_sn: str = None
    transaction_id: str = None
    out_trade_no: str = None
    total_amount: float = None
    paid_amount: float = None
    paid_points_amount: int = None
    status: str = None
    pay_time: str = None
    expire_time: str = None
    content_type: str = None
    content_id: int = None
    task_code: str = None
    dispatch_mode: str = None
    dispatch_status: str = None
    worker_user_id: int = None
    dispatcher_user_id: int = None
    accepted_time: str = None
    service_start_time: str = None
    dispatch_expire_time: str = None
    task_payload: Dict[str, Any] = None
    pay_objects: ClientPayObjects = None
