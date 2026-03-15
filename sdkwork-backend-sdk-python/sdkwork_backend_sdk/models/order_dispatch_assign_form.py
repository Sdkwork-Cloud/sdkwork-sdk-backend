from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderDispatchAssignForm:
    """Dispatch assign form"""
    worker_user_id: int
    remark: str = None
