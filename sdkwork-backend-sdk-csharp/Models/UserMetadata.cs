using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class UserMetadata
    {
        public int? SpMchId { get; set; }
        public int? PartnerId { get; set; }
        public int? AgentId { get; set; }
        public int? ShopId { get; set; }
        public int? FromUserId { get; set; }
    }
}
