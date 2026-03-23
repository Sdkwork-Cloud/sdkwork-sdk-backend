import type { TagsContent } from './tags-content';

/** æ°å­äººåªä½èµæº */
export interface CharacterMediaResource {
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
  /** è§è²åç§° */
  name?: string;
  /** èµæºæ©å±å */
  extension?: string;
  /** èµæºæ ç­¾ */
  tags?: TagsContent;
  /** èµæºåæ°æ® */
  metadata?: Record<string, unknown>;
  /** AIçææç¤ºè¯ */
  prompt?: string;
  /** è§è²ç±»å */
  characterType?: string;
  /** æ§å« */
  gender?: string;
  /** å¹´é¾æ®µ */
  ageGroup?: string;
  /** å¤´åå¾çURL */
  avatarUrl?: string;
  /** å¤´åè§é¢URL */
  avatarVideoUrl?: string;
  /** å³èåé³äººID */
  speakerId?: number;
  /** å¤è§åæ° */
  appearanceParams?: Record<string, unknown>;
  /** å¨ç»åæ° */
  animationParams?: Record<string, unknown>;
}
