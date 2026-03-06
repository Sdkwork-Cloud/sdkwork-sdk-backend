using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class QrCodeStatusVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public string? Status { get; set; }
        public UserVO? UserInfo { get; set; }
        public LoginResultVO? Token { get; set; }
    }
}
