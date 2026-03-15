from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderDispatchRuleForm:
    """Dispatch rule form"""
    task_code: str
    task_name: str
    enabled: bool = None
    allow_grab: bool = None
    allow_assign: bool = None
    default_task_concurrent_limit: int
    metadata: OrderDispatchRuleMetadata = None
