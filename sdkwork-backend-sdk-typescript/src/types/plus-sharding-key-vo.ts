/** åçé®å¼å¯¹è±¡ */
export interface PlusShardingKeyVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æåæ´æ°æ¶é´ */
  updatedAt?: string;
  /** ä¸»é®ID */
  id?: number;
  /** éç¨å¯ä¸æ è¯ç¬¦UUID */
  uuid?: string;
  /** åçKey */
  shardingKey?: string;
  /** ç§æ·ID */
  tenantId?: number;
  /** æ°æ®æ¥æè */
  owner?: 'DEFAULT' | 'TENANT' | 'ORGANIZATION';
  /** æ°æ®æ¥æèID */
  ownerId?: number;
  /** æ°æ®ç¶æ */
  status?: 'DEFAULT' | 'ACTIVE' | 'INACTIVE' | 'SUSPENDED' | 'DELETED';
  /** æè¿° */
  description?: string;
}
