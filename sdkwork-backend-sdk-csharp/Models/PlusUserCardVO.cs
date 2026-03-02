using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserCardVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? UserId { get; set; }
        public int? CardId { get; set; }
        public string? CardCode { get; set; }
        public string? AcquireTime { get; set; }
        public string? ActivateTime { get; set; }
        public string? CancelTime { get; set; }
        public int? Points { get; set; }
        public int? Balance { get; set; }
    }
}
