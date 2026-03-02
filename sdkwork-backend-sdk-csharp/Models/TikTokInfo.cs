using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class TikTokInfo
    {
        public string? UserId { get; set; }
        public string? Username { get; set; }
        public string? DisplayName { get; set; }
        public string? AvatarUrl { get; set; }
        public string? Bio { get; set; }
        public bool? IsVerified { get; set; }
        public int? FollowerCount { get; set; }
        public int? FollowingCount { get; set; }
        public int? LikeCount { get; set; }
    }
}
