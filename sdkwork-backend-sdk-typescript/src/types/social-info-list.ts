import type { FacebookInfo } from './facebook-info';
import type { InstagramInfo } from './instagram-info';
import type { LinkedInInfo } from './linked-in-info';
import type { TelegramInfo } from './telegram-info';
import type { TikTokInfo } from './tik-tok-info';
import type { TwitterInfo } from './twitter-info';
import type { WechatInfo } from './wechat-info';
import type { WhatsAppInfo } from './whats-app-info';

export interface SocialInfoList {
  wechat?: WechatInfo;
  facebook?: FacebookInfo;
  twitter?: TwitterInfo;
  instagram?: InstagramInfo;
  linkedin?: LinkedInInfo;
  telegram?: TelegramInfo;
  whatsapp?: WhatsAppInfo;
  tiktok?: TikTokInfo;
}
