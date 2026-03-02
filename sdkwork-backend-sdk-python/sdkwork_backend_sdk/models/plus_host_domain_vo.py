from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusHostDomainVO:
    """域名管理VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    domain_name: str = None
    tld: str = None
    registrar: str = None
    owner_id: int = None
    registered_at: str = None
    expired_at: str = None
    status: str = None
    dns_servers: DnsServers = None
    resolution_status: str = None
    auto_renew: bool = None
    remark: str = None
    dns_records: List[PlusDnsRecordVO] = None
