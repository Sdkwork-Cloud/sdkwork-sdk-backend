using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusOrderVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? OrderType { get; set; }
        public int? UserId { get; set; }
        public string? Subject { get; set; }
        public string? OrderSn { get; set; }
        public string? TransactionId { get; set; }
        public string? OutTradeNo { get; set; }
        public double? TotalAmount { get; set; }
        public double? PaidAmount { get; set; }
        public int? PaidPointsAmount { get; set; }
        public string? Status { get; set; }
        public string? PayTime { get; set; }
        public string? ExpireTime { get; set; }
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? TaskCode { get; set; }
        public string? DispatchMode { get; set; }
        public string? DispatchStatus { get; set; }
        public int? WorkerUserId { get; set; }
        public int? DispatcherUserId { get; set; }
        public string? AcceptedTime { get; set; }
        public string? ServiceStartTime { get; set; }
        public string? DispatchExpireTime { get; set; }
        public Dictionary<string, object>? TaskPayload { get; set; }
        public ClientPayObjects? PayObjects { get; set; }
    }
}
