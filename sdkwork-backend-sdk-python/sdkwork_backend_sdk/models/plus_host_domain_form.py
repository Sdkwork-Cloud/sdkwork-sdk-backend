from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusHostDomainForm:
    """域名创建表单"""
    domain_name: str
    tld: str = None
    registrar: str = None
    owner_id: int
    registered_at: str
    expired_at: str
    status: str
    dns_servers: DnsServers
    resolution_status: str
    auto_renew: bool = None
    remark: str = None
