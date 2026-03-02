from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class WebSearchOptions:
    search_context_size: str = None
    user_location: UserLocation = None
