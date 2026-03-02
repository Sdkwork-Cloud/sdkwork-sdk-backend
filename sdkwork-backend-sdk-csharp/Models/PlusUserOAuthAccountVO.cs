using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusUserOAuthAccountVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public int? Id { get; set; }
        public string? Uuid { get; set; }
        public int? UserId { get; set; }
        public string? OauthProvider { get; set; }
        public string? OpenId { get; set; }
        public string? UnionId { get; set; }
        public string? AppId { get; set; }
        public int? ChannelAccountId { get; set; }
        public string? AccessTokenExpiresAt { get; set; }
    }
}
