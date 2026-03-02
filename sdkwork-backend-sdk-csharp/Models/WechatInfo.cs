using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class WechatInfo
    {
        public string? OpenId { get; set; }
        public string? UnionId { get; set; }
        public string? Nickname { get; set; }
        public string? AvatarUrl { get; set; }
        public int? Gender { get; set; }
        public string? Country { get; set; }
        public string? Province { get; set; }
        public string? City { get; set; }
    }
}
