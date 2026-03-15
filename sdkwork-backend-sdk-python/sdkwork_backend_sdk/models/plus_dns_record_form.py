from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDnsRecordForm:
    """DNS record creation form"""
    domain_id: int
    record_name: str = None
    file_name: str = None
    file_content: str = None
    record_type: str
    record_value: DnsRecordValue = None
    ttl: int
    priority: int = None
    enabled: bool
