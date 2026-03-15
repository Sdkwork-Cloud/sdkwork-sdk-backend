from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusProjectForm:
    """Project creation form"""
    name: str
    code: str
    description: str = None
    status: str
    leader_id: int = None
    start_time: str = None
    end_time: str = None
    budget_amount: int = None
    is_deleted: bool = None
