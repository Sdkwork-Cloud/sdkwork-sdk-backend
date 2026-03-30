import type { ContentVoteMetadata } from './content-vote-metadata';

/** Vote creation form */
export interface ContentVoteForm {
  /** 鍐呭绫诲瀷(濡?鍟嗗搧銆佷細鍛樸€佹柊闂荤瓑) */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB' | 'SKILL';
  /** 璇勫垎(like/ dislike/ neutral) */
  rating: string;
  /** 鍏宠仈鍐呭ID(澶栭敭鍏宠仈瀵瑰簲瀹炰綋鐨処D) */
  contentId: number;
  /** 鍏冩暟鎹?Json鏍煎紡) */
  metadata?: ContentVoteMetadata;
}
