from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class PlusMessageFeedbackForm:
    """Chat Message Feedback Form"""
    id: str = None
    conversation_id: str = None
    rating: str = None
