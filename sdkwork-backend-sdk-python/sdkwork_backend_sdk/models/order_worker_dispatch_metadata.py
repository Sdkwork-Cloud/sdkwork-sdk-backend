from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OrderWorkerDispatchMetadata:
    enabled_task_codes: List[str] = None
    task_concurrent_overrides: Dict[str, int] = None
