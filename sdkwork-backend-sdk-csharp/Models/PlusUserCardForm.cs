using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserCardForm
    {
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
