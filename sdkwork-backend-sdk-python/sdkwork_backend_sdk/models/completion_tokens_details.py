from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class CompletionTokensDetails:
    reasoning_tokens: int = None
    audio_tokens: int = None
    accepted_prediction_tokens: int = None
    rejected_prediction_tokens: int = None
