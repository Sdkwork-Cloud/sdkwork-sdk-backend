/** Collection creation form */
export interface PlusCollectionForm {
  /** Name */
  name: string;
  /** Description */
  description?: string;
  /** Type */
  type?: 'DEFAULT' | 'MIXED' | 'VIDEO' | 'MUSIC' | 'AUDIO' | 'IMAGE' | 'NOTES' | 'ARTICLE' | 'NEWS' | 'SHORT_DRAMA' | 'FILE' | 'PRODUCT' | 'VIP' | 'FEEDS' | 'TEXT' | 'VOICE' | 'APP' | 'AGENT' | 'PROMPT' | 'TOOL' | 'PROJECT' | 'EVENTS' | 'COMMENTS' | 'LINK' | 'KNOWLEDGE_BASE' | 'DATASOURCE' | 'IM_GROUP' | 'NOVEL' | 'SCRIPT' | 'PROSE' | 'PODCAST' | 'AUDIOBOOK' | 'MOVIE' | 'TV_SERIES' | 'ANIMATION' | 'DOCUMENTARY' | 'VARIETY_SHOW' | 'LIVE_STREAM' | 'GAME' | 'EBOOK' | 'COURSE' | 'TUTORIAL' | 'COMIC' | 'GALLERY' | 'USER' | 'ORGANIZATION' | 'TOPIC' | 'TAG' | 'QA' | 'VOTE' | 'SURVEY' | 'QUESTIONNAIRE' | 'FORM' | 'CALENDAR' | 'TASK' | 'REMINDER' | 'INVITATION_CODE' | 'COUPON' | 'ORDER' | 'TRANSACTION' | 'BILL' | 'INVOICE' | 'RECEIPT' | 'CUSTOM_1' | 'CUSTOM_2' | 'CUSTOM_3' | 'CUSTOM_4' | 'CUSTOM_5';
  /** Content ID */
  contentId?: number;
}
