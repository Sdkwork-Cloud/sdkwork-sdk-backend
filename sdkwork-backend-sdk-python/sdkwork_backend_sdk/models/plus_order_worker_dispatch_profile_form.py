from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderWorkerDispatchProfileForm:
    """Worker dispatch profile form"""
    user_id: int
    rating_level: str = None
    enabled: bool = None
    global_max_in_progress: int
    metadata: OrderWorkerDispatchMetadata = None
