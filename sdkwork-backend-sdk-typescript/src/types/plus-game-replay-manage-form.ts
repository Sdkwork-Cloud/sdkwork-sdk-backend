/** æ£çæ¸¸æåæ¾ç®¡çè¡¨å */
export interface PlusGameReplayManageForm {
  /** åæ¾æ é¢ */
  title?: string;
  /** æ¯å¦å¬å¼å¯è§ */
  publicVisible?: boolean;
  /** æ¯å¦åè®¸åäº« */
  allowShare?: boolean;
  /** åæ¾ç¶æ */
  status?: 'GENERATING' | 'READY' | 'EXPIRED' | 'DELETED';
  /** å°é¢å°å */
  coverUrl?: string;
  /** è¿ææ¶é´ */
  expiredAt?: string;
}
