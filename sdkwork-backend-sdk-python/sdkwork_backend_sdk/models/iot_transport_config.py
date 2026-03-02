from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class IotTransportConfig:
    """IoT transport configuration"""
    type: str = None
    url: str = None
    connection_timeout: int = None
    keep_alive_interval: int = None
    qos: int = None
    client_id: str = None
    auth_token: str = None
    username: str = None
    password: str = None
    ssl_enabled: bool = None
    clean_session: bool = None
    will_topic: str = None
    will_message: str = None
    will_qos: int = None
    will_retain: bool = None
    publish_topics: List[str] = None
    subscribe_topics: List[str] = None
