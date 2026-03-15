from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderDispatchRuleVO:
    """Dispatch rule view object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    task_code: str = None
    task_name: str = None
    enabled: bool = None
    allow_grab: bool = None
    allow_assign: bool = None
    default_task_concurrent_limit: int = None
    metadata: OrderDispatchRuleMetadata = None
