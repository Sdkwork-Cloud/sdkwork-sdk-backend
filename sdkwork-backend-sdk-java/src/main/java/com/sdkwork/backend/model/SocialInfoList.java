package com.sdkwork.backend.model;

public class SocialInfoList {
    private WechatInfo wechat;
    private FacebookInfo facebook;
    private TwitterInfo twitter;
    private InstagramInfo instagram;
    private LinkedInInfo linkedin;
    private TelegramInfo telegram;
    private WhatsAppInfo whatsapp;
    private TikTokInfo tiktok;

    public WechatInfo getWechat() {
        return this.wechat;
    }
    
    public void setWechat(WechatInfo wechat) {
        this.wechat = wechat;
    }

    public FacebookInfo getFacebook() {
        return this.facebook;
    }
    
    public void setFacebook(FacebookInfo facebook) {
        this.facebook = facebook;
    }

    public TwitterInfo getTwitter() {
        return this.twitter;
    }
    
    public void setTwitter(TwitterInfo twitter) {
        this.twitter = twitter;
    }

    public InstagramInfo getInstagram() {
        return this.instagram;
    }
    
    public void setInstagram(InstagramInfo instagram) {
        this.instagram = instagram;
    }

    public LinkedInInfo getLinkedin() {
        return this.linkedin;
    }
    
    public void setLinkedin(LinkedInInfo linkedin) {
        this.linkedin = linkedin;
    }

    public TelegramInfo getTelegram() {
        return this.telegram;
    }
    
    public void setTelegram(TelegramInfo telegram) {
        this.telegram = telegram;
    }

    public WhatsAppInfo getWhatsapp() {
        return this.whatsapp;
    }
    
    public void setWhatsapp(WhatsAppInfo whatsapp) {
        this.whatsapp = whatsapp;
    }

    public TikTokInfo getTiktok() {
        return this.tiktok;
    }
    
    public void setTiktok(TikTokInfo tiktok) {
        this.tiktok = tiktok;
    }
}
