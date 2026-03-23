import type { TagsContent } from './tags-content';

/** æä»¶åªä½èµæº */
export interface FileMediaResource {
  /** èµæºID */
  id?: number;
  /** èµæºUUID */
  uuid?: string;
  /** èµæºURL */
  url?: string;
  /** èµæºå­èæ°æ® */
  bytes?: string;
  /** æ¬å°æä»¶ */
  localFile?: unknown;
  /** èµæºBase64ç¼ç  */
  base64?: string;
  /** èµæºç±»å */
  type?: 'IMAGE' | 'VIDEO' | 'AUDIO' | 'DOCUMENT' | 'FILE' | 'MUSIC' | 'CHARACTER' | 'MODEL_3D' | 'PPT' | 'CODE';
  /** èµæºå¤§å°(å­è) */
  size?: number;
  /** æä»¶å */
  name?: string;
  /** èµæºæ©å±å */
  extension?: string;
  /** èµæºæ ç­¾ */
  tags?: TagsContent;
  /** èµæºåæ°æ® */
  metadata?: Record<string, unknown>;
  /** AIçææç¤ºè¯ */
  prompt?: string;
  /** å®½åº¦ */
  width?: number;
  /** é«åº¦ */
  height?: number;
  /** æ¶é¿(ç§) */
  duration?: number;
  /** MIMEç±»å */
  mime_type?: string;
}
