using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class QrCodeVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? QrKey { get; set; }
        public string? QrUrl { get; set; }
        public string? QrContent { get; set; }
        public int? ExpireTime { get; set; }
    }
}
