using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class SocialInfoList
    {
        public WechatInfo? Wechat { get; set; }
        public FacebookInfo? Facebook { get; set; }
        public TwitterInfo? Twitter { get; set; }
        public InstagramInfo? Instagram { get; set; }
        public LinkedInInfo? Linkedin { get; set; }
        public TelegramInfo? Telegram { get; set; }
        public WhatsAppInfo? Whatsapp { get; set; }
        public TikTokInfo? Tiktok { get; set; }
    }
}
