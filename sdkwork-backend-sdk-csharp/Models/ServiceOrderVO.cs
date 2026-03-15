using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class ServiceOrderVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? OrderId { get; set; }
        public string? OrderSn { get; set; }
        public string? TaskCode { get; set; }
        public string? DispatchMode { get; set; }
        public string? DispatchStatus { get; set; }
        public int? WorkerUserId { get; set; }
        public string? DispatchExpireTime { get; set; }
        public bool? Success { get; set; }
        public string? Message { get; set; }
    }
}
