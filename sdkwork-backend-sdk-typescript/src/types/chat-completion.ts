import type { ChatCompletionChoice } from './chat-completion-choice';
import type { ChatCompletionMetadata } from './chat-completion-metadata';
import type { CompletionUsage } from './completion-usage';
import type { PlusAgent } from './plus-agent';

/** å¤§æ¨¡åçèå¤©å®æååºç»æ */
export interface ChatCompletion {
  /** ååºçå¯ä¸æ è¯ç¬¦ */
  id: string;
  /** å¯¹è±¡ç±»åï¼éå¸¸ä¸º"chat.completion" */
  object: string;
  /** ååºåå»ºçæ¶é´æ³ï¼Unixæ¶é´ï¼ä»¥ç§ä¸ºåä½ï¼ */
  created: number;
  /** ç¨äºçæååºçæ¨¡ååç§° */
  model: string;
  /** ååºéé¡¹åè¡¨ */
  choices: ChatCompletionChoice[];
  /** ä½¿ç¨ç»è®¡ä¿¡æ¯ */
  usage?: CompletionUsage;
  /** metadata */
  metadata?: ChatCompletionMetadata;
  content?: string;
  agent?: PlusAgent;
  /** ç³»ç»æçº¹ï¼ç¨äºè¯å«æ¨¡åçæ¬åéç½® */
  system_fingerprint?: string;
}
