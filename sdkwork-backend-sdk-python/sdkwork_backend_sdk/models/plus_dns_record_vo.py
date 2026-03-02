from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusDnsRecordVO:
    """DNS解析记录VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    domain_id: int = None
    record_name: str = None
    file_name: str = None
    file_content: str = None
    record_type: str = None
    record_value: DnsRecordValue = None
    ttl: int = None
    priority: int = None
    enabled: bool = None
    first_record_value: str = None
    record_values: List[str] = None
