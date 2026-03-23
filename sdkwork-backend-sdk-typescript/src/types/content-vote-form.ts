import type { ContentVoteMetadata } from './content-vote-metadata';

/** Vote creation form */
export interface ContentVoteForm {
  /** éå­îç»«è¯²ç·(æ¿¡?éåæ§éä½·ç´°éæ¨¸â¬ä½¹æéè¤ç) */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** çå«å(like/ dislike/ neutral) */
  rating: string;
  /** éå® ä»éå­îID(æ¾¶æ ­æ­éå® ä»çµç°ç°²ç¹ç°ç¶é¨å¦D) */
  contentId: number;
  /** éå©æé¹?Jsonéçç´¡) */
  metadata?: ContentVoteMetadata;
}
