package com.sdkwork.backend.model;

public class ClientPayObjects {
    private WechatPayObject wechat;
    private AlipayObject alipay;
    private ApplePayObject applePay;
    private PaypalObject paypal;
    private StripeObject stripe;
    private UnionPayObject unionPay;

    public WechatPayObject getWechat() {
        return this.wechat;
    }
    
    public void setWechat(WechatPayObject wechat) {
        this.wechat = wechat;
    }

    public AlipayObject getAlipay() {
        return this.alipay;
    }
    
    public void setAlipay(AlipayObject alipay) {
        this.alipay = alipay;
    }

    public ApplePayObject getApplePay() {
        return this.applePay;
    }
    
    public void setApplePay(ApplePayObject applePay) {
        this.applePay = applePay;
    }

    public PaypalObject getPaypal() {
        return this.paypal;
    }
    
    public void setPaypal(PaypalObject paypal) {
        this.paypal = paypal;
    }

    public StripeObject getStripe() {
        return this.stripe;
    }
    
    public void setStripe(StripeObject stripe) {
        this.stripe = stripe;
    }

    public UnionPayObject getUnionPay() {
        return this.unionPay;
    }
    
    public void setUnionPay(UnionPayObject unionPay) {
        this.unionPay = unionPay;
    }
}
