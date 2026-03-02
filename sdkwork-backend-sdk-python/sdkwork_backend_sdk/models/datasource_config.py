from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DatasourceConfig:
    type: str = None
    host: str = None
    port: int = None
    database: str = None
    username: str = None
    password: str = None
    params: str = None
    pool_config: PoolConfig = None
    driver_class_name: str = None
    jdbc_url: str = None
