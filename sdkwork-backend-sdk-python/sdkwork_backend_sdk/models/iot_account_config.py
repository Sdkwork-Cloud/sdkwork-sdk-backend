from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class IotAccountConfig:
    """IoT account configuration"""
    id: int = None
    uuid: str = None
    region: str = None
    weight: int = None
    channel: str = None
    product: str = None
    functions: List[str] = None
    metadata: AccountConfigMetadata = None
    properties: Dict[str, Any] = None
    transports: List[IotTransportConfig] = None
    firmware_download_url: str = None
    ota_upgrade_url: str = None
    device_registry_url: str = None
    certificate_path: str = None
    private_key_path: str = None
    ca_certificate_path: str = None
    reporting_interval: int = None
    max_retry_attempts: int = None
    retry_interval: int = None
