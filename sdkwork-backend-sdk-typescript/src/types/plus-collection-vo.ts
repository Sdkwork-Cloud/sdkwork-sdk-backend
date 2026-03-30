/** Collection VO */
export interface PlusCollectionVO {
  /** 创建时间 */
  createdAt?: string;
  /** 更新时间 */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Name */
  name?: string;
  /** Description */
  description?: string;
  /** Type */
  type?: 'DEFAULT' | 'MIXED' | 'VIDEO' | 'MUSIC' | 'AUDIO' | 'IMAGE' | 'NOTES' | 'ARTICLE' | 'NEWS' | 'SHORT_DRAMA' | 'FILE' | 'PRODUCT' | 'VIP' | 'FEEDS' | 'TEXT' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'IM_GROUP' | 'NOVEL' | 'SCRIPT' | 'PROSE' | 'PODCAST' | 'AUDIOBOOK' | 'MOVIE' | 'TV_SERIES' | 'ANIMATION' | 'DOCUMENTARY' | 'VARIETY_SHOW' | 'LIVE_STREAM' | 'GAME' | 'EBOOK' | 'COURSE' | 'TUTORIAL' | 'COMIC' | 'GALLERY' | 'USER' | 'ORGANIZATION' | 'TOPIC' | 'TAG' | 'QA' | 'VOTE' | 'SURVEY' | 'QUESTIONNAIRE' | 'FORM' | 'CALENDAR' | 'TASK' | 'REMINDER' | 'INVITATION_CODE' | 'COUPON' | 'ORDER' | 'TRANSACTION' | 'BILL' | 'INVOICE' | 'RECEIPT' | 'CUSTOM_1' | 'CUSTOM_2' | 'CUSTOM_3' | 'CUSTOM_4' | 'CUSTOM_5';
  /** Content ID */
  contentId?: number;
  /** Cover image */
  coverImage?: string;
  /** Is public */
  isPublic?: boolean;
  /** Is pinned */
  isPinned?: boolean;
  /** Sort */
  sort?: number;
  /** Item count */
  itemCount?: number;
  /** View count */
  viewCount?: number;
  /** Favorite count */
  favoriteCount?: number;
  /** Last updated at */
  lastUpdatedAt?: string;
  /** Parent ID */
  parentId?: number;
  /** Children IDs */
  childrenIds?: number[];
}
