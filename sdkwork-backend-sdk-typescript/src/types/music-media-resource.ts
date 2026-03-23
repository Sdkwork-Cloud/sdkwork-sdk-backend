import type { TagsContent } from './tags-content';

/** é³ä¹åªä½èµæº */
export interface MusicMediaResource {
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
  /** èµæºMIMEç±»å */
  mimeType?: string;
  /** èµæºå¤§å°(å­è) */
  size?: number;
  /** èµæºåç§° */
  name?: string;
  /** èµæºæ©å±å */
  extension?: string;
  /** èµæºæ ç­¾ */
  tags?: TagsContent;
  /** èµæºåæ°æ® */
  metadata?: Record<string, unknown>;
  /** AIçææç¤ºè¯ */
  prompt?: string;
  /** é³é¢æ ¼å¼ */
  format?: 'wav' | 'mp3' | 'aac' | 'flac' | 'ogg' | 'pcm' | 'aiff' | 'au' | 'opus';
  /** é³ä¹æ¶é¿(ç§) */
  duration?: number;
}
