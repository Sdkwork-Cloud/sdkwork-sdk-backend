from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusProjectVO:
    """项目信息VO对象(维护项目基本信息、状态及关联关系)"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    name: str = None
    code: str = None
    description: str = None
    status: str = None
    leader_id: int = None
    start_time: str = None
    end_time: str = None
    budget_amount: int = None
    is_deleted: bool = None
