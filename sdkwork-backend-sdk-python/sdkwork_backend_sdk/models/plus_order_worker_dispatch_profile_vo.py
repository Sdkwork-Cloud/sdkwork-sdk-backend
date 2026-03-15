from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusOrderWorkerDispatchProfileVO:
    """Worker dispatch profile view object"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    user_id: int = None
    rating_level: str = None
    enabled: bool = None
    global_max_in_progress: int = None
    metadata: OrderWorkerDispatchMetadata = None
