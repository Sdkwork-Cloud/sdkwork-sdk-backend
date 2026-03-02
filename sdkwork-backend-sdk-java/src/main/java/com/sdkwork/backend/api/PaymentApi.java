package com.sdkwork.backend.api;

import com.sdkwork.backend.http.HttpClient;
import com.sdkwork.backend.model.*;
import java.util.List;
import java.util.Map;

public class PaymentApi {
    private final HttpClient client;
    
    public PaymentApi(HttpClient client) {
        this.client = client;
    }

    /** Update an existing payment record */
    public PlusApiResultPlusPaymentVO update(PlusPaymentForm body) throws Exception {
        return (PlusApiResultPlusPaymentVO) client.put(ApiPaths.backendPath("/trade/payment"), body);
    }

    /** Create a new payment record */
    public PlusApiResultPlusPaymentVO create(PlusPaymentForm body) throws Exception {
        return (PlusApiResultPlusPaymentVO) client.post(ApiPaths.backendPath("/trade/payment"), body);
    }

    /** Check payment status */
    public PlusApiResultBoolean checkPaymentStatus(PlusPaymentStatusQueryForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/trade/payment/status"), body);
    }

    /** Refund payment */
    public PlusApiResultBoolean refund(PlusRefundForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/trade/payment/refund"), body);
    }

    /** Get payment records by page */
    public PlusApiResultPagePlusPaymentVO listByPage(QueryListForm body, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePlusPaymentVO) client.post(ApiPaths.backendPath("/trade/payment/list"), body, params);
    }

    /** Get all payment records */
    public PlusApiResultListPlusPaymentVO listAllEntities(QueryListForm body) throws Exception {
        return (PlusApiResultListPlusPaymentVO) client.post(ApiPaths.backendPath("/trade/payment/list/all"), body);
    }

    /** Cancel payment */
    public PlusApiResultBoolean cancel(PlusPaymentCancelForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.backendPath("/trade/payment/cancel"), body);
    }

    /** Get a payment record by ID */
    public PlusApiResultPlusPaymentVO getById(String id) throws Exception {
        return (PlusApiResultPlusPaymentVO) client.get(ApiPaths.backendPath("/trade/payment/" + id + ""));
    }

    /** Delete a payment record */
    public PlusApiResultBoolean delete(String id) throws Exception {
        return (PlusApiResultBoolean) client.delete(ApiPaths.backendPath("/trade/payment/" + id + ""));
    }
}
