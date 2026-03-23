import type { ChatCompletionChunkChoice } from './chat-completion-chunk-choice';
import type { ChatCompletionMetadata } from './chat-completion-metadata';
import type { CompletionUsage } from './completion-usage';
import type { PlusAgent } from './plus-agent';

/** èå¤©å®æStreamæ¹å¼çååºå¯¹è±¡ï¼ç¨äºæµå¼ä¼ è¾çèå¤©æ¨¡åååº */
export interface ChatCompletionChunk {
  /** ååºçå¯ä¸æ è¯ç¬¦ï¼åä¸æµå¼ååºçææchunkå±äº«ç¸åçid */
  id: string;
  /** å¯¹è±¡ç±»åï¼æµå¼ååºåºå®ä¸º"chat.completion.chunk" */
  object: string;
  /** ååºåå»ºçæ¶é´æ³ï¼Unixæ¶é´ï¼ä»¥ç§ä¸ºåä½ï¼ */
  created: number;
  /** ç¨äºçæååºçæ¨¡ååç§° */
  model: string;
  /** ååºéé¡¹åè¡¨ï¼åå«å½åchunkçå¢éåå®¹ */
  choices: ChatCompletionChunkChoice[];
  /** ä½¿ç¨æåµç»è®¡ä¿¡æ¯ */
  usage?: CompletionUsage;
  /** metadata */
  metadata?: ChatCompletionMetadata;
  content?: string;
  agent?: PlusAgent;
  reasoningContent?: string;
  /** ç³»ç»æçº¹ï¼ç¨äºè¯å«æ¨¡åçæ¬åéç½® */
  system_fingerprint?: string;
}
