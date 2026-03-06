from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusSystemInvoiceVO:
    """系统发票VO"""
    created_at: str = None
    updated_at: str = None
    id: int = None
    uuid: str = None
    title: str = None
    tax_id: str = None
    type: str = None
    amount: float = None
    status: str = None
    content: str = None
    email: str = None
    address: str = None
    create_time: str = None
