using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class CreateServiceOrderForm
    {
        public int? PublisherUserId { get; set; }
        public string? Subject { get; set; }
        public string? TaskCode { get; set; }
        public string? DispatchMode { get; set; }
        public double? TotalAmount { get; set; }
        public string? DispatchExpireTime { get; set; }
        public string? ExpireTime { get; set; }
        public Dictionary<string, object>? TaskPayload { get; set; }
        public string? Remark { get; set; }
    }
}
