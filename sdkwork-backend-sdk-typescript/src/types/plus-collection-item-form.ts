/** Collection item creation form */
export interface PlusCollectionItemForm {
  /** Collection ID */
  collectionId: number;
  /** Collection UUID */
  collectionUuid?: string;
  /** Collection type */
  type: 'DEFAULT' | 'MIXED' | 'VIDEO' | 'MUSIC' | 'AUDIO' | 'IMAGE' | 'NOTES' | 'ARTICLE' | 'NEWS' | 'SHORT_DRAMA' | 'FILE' | 'PRODUCT' | 'VIP' | 'FEEDS' | 'TEXT' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'IM_GROUP' | 'NOVEL' | 'SCRIPT' | 'PROSE' | 'PODCAST' | 'AUDIOBOOK' | 'MOVIE' | 'TV_SERIES' | 'ANIMATION' | 'DOCUMENTARY' | 'VARIETY_SHOW' | 'LIVE_STREAM' | 'GAME' | 'EBOOK' | 'COURSE' | 'TUTORIAL' | 'COMIC' | 'GALLERY' | 'USER' | 'ORGANIZATION' | 'TOPIC' | 'TAG' | 'QA' | 'VOTE' | 'SURVEY' | 'QUESTIONNAIRE' | 'FORM' | 'CALENDAR' | 'TASK' | 'REMINDER' | 'INVITATION_CODE' | 'COUPON' | 'ORDER' | 'TRANSACTION' | 'BILL' | 'INVOICE' | 'RECEIPT' | 'CUSTOM_1' | 'CUSTOM_2' | 'CUSTOM_3' | 'CUSTOM_4' | 'CUSTOM_5';
  /** Content type */
  contentType: 'DEFAULT' | 'PRODUCT' | 'VIP' | 'VIP_LEVEL' | 'NEWS' | 'FEEDS' | 'TEXT' | 'IMAGE' | 'AUDIO' | 'VIDEO' | 'FILE' | 'COLLECTION' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'IOT_DEVICE' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'IM_GROUP' | 'SKU' | 'VIP_PACKAGE' | 'NOVEL' | 'SCRIPT' | 'ARTICLE' | 'PROSE' | 'GENERATION_IMAGE' | 'GENERATION_VIDEO' | 'GENERATION_FILM';
  /** Content ID */
  contentId: number;
  /** Content UUID */
  contentUuid?: string;
  /** Title */
  title?: string;
  /** Description */
  description?: string;
  /** Position */
  position?: number;
  /** Is pinned */
  isPinned?: boolean;
  /** Tags */
  tags?: string;
  /** Extra data */
  extraData?: string;
}
