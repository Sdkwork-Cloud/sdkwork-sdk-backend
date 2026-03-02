from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusGetAccountForm:
    """Form for retrieving cash account"""
    load_history: bool = None
