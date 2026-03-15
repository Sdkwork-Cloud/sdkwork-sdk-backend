from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class GenerationContext:
    generation_id: int = None
    generation_type: str = None
    generation_status: str = None
    channel: str = None
    request_id: str = None
    channel_task_id: str = None
    routing_strategy: str = None
    routing_product: str = None
    routing_provider: str = None
