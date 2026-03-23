/** ç¬è®°åå¸æç« è¡¨å */
export interface PlusNotesPublishArticleForm {
  /** ç¬è®°ID */
  noteId?: number;
  /** ç¬è®°UUID */
  noteUuid?: string;
  /** æç« æ é¢ï¼æªä¼ åä½¿ç¨ç¬è®°æ é¢ */
  title?: string;
  /** æç« åå®¹ï¼æ¯æ Markdown/HTMLï¼ï¼æªä¼ åä½¿ç¨ç¬è®°åå®¹ */
  content?: string;
  /** æç« æè¦ */
  digest?: string;
  /** ä½è */
  author?: string;
  /** å°é¢å¾ mediaId */
  thumbMediaId?: string;
  /** åæé¾æ¥ */
  contentSourceUrl?: string;
  /** æ¯å¦æ¾ç¤ºå°é¢ï¼0å¦ï¼1æ¯ï¼ */
  showCoverPic?: number;
  /** æ¯å¦æå¼è¯è®ºï¼0å¦ï¼1æ¯ï¼ */
  needOpenComment?: number;
  /** æ¯å¦ä»ç²ä¸å¯è¯è®ºï¼0å¦ï¼1æ¯ï¼ */
  onlyFansCanComment?: number;
}
