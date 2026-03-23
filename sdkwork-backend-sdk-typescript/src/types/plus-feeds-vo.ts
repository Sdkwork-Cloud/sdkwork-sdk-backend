import type { AssetMediaResourceList } from './asset-media-resource-list';
import type { AuthorInfo } from './author-info';
import type { ImageMediaResourceList } from './image-media-resource-list';
import type { TagsContent } from './tags-content';

/** FeedsæµVOå¯¹è±¡ï¼æ¯æéç¨åå®¹å±ç¤ºï¼åæ¬æ°é»èµè®¯ãåå®¢ãè§é¢ãå¾çãé³é¢ç­å¤ç§ç±»å */
export interface PlusFeedsVO {
  /** åå»ºæ¶é´ï¼å®ä½é¦æ¬¡æä¹åæ¶è®¾ç½® */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ï¼å®ä½ä¿®æ¹æ¶æ´æ° */
  updatedAt?: string;
  /** ä¸»é®IDï¼ç±æ°æ®åºèªå¨çæ */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** ç¨æ·ID(å¤é®å³èplus_user.id) */
  userId?: number;
  /** Feedsæ é¢ */
  title?: string;
  /** Feedsåå®¹æè¦ */
  summary?: string;
  /** å³èåå®¹ç±»å */
  contentType?: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM' | 'JOB';
  /** å³èåå®¹ID */
  contentId?: number;
  /** å°é¢å¾çURLåè¡¨ */
  coverImages?: ImageMediaResourceList;
  /** resource list */
  resourceList?: AssetMediaResourceList;
  /** ä½èä¿¡æ¯ */
  author?: AuthorInfo;
  /** åå®¹æ¥æº */
  source?: string;
  /** åå¸æ¶é´ */
  publishTime?: string;
  /** Feedsæ ç­¾ */
  tags?: TagsContent;
  /** Feedsç¶æ */
  status?: 'DEFAULT' | 'DRAFT' | 'PUBLISHED' | 'DELETED';
  /** æµè§æ¬¡æ° */
  viewCount?: number;
  /** ç¹èµæ¬¡æ° */
  likeCount?: number;
  /** è¯è®ºæ¬¡æ° */
  commentCount?: number;
}
