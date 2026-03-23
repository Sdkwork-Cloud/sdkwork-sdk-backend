import type { Participant } from './participant';

/** Notification VO */
export interface PlusNotificationVO {
  /** åå»ºæ¶é´ */
  createdAt?: string;
  /** æ´æ°æ¶é´ */
  updatedAt?: string;
  /** ID */
  id?: number;
  /** UUID */
  uuid?: string;
  /** Message role */
  role?: 'DEFAULT' | 'USER' | 'ASSISTANT' | 'SYSTEM' | 'FUNCTION';
  /** Sender ID */
  senderId?: number;
  /** Sender */
  sender?: Participant;
  /** Receiver ID */
  receiverId?: number;
  /** Receiver */
  receiver?: Participant;
  /** Group ID */
  groupId?: number;
  /** Title */
  title?: string;
  /** Content */
  content?: string;
  /** Type */
  type?: 'USER' | 'GROUP' | 'SYSTEM' | 'TASK' | 'MESSAGE' | 'ALERT' | 'USER_SYSTEM' | 'USER_GROUP' | 'GROUP_SYSTEM' | 'OTHER';
  /** Channel type */
  channelType?: 'DEFAULT' | 'EMAIL' | 'SMS' | 'IN_APP' | 'WECHAT' | 'WECHAT_TEMPLATE' | 'WECHAT_MINI_PROGRAM' | 'DINGTALK' | 'IM' | 'PUSH' | 'OTHER';
  /** Template ID */
  templateId?: string;
  /** Template params */
  templateParams?: Record<string, unknown>;
  /** Redirect URL */
  redirectUrl?: string;
  /** Mini program path */
  miniProgramPath?: string;
  /** Status */
  status?: 'PENDING' | 'SENDING' | 'SENT' | 'DELIVERED' | 'READ' | 'FAILED' | 'REVOKED' | 'EXPIRED';
  /** Sent at */
  sentAt?: string;
  /** Read at */
  readAt?: string;
  /** Extra data */
  extraData?: Record<string, unknown>;
  /** Retry count */
  retryCount?: number;
  /** Max retry count */
  maxRetryCount?: number;
  /** Error message */
  errorMessage?: string;
}
