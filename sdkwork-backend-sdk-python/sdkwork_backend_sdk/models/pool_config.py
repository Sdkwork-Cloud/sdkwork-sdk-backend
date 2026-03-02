from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PoolConfig:
    min_idle: int = None
    max_pool_size: int = None
    connection_timeout: int = None
    idle_timeout: int = None
    max_lifetime: int = None
    auto_commit: bool = None
    connection_test_query: str = None
    pool_name: str = None
