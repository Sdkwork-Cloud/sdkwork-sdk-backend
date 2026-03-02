package com.sdkwork.backend

data class SocialInfoList(
    val wechat: WechatInfo? = null,
    val facebook: FacebookInfo? = null,
    val twitter: TwitterInfo? = null,
    val instagram: InstagramInfo? = null,
    val linkedin: LinkedInInfo? = null,
    val telegram: TelegramInfo? = null,
    val whatsapp: WhatsAppInfo? = null,
    val tiktok: TikTokInfo? = null
)
