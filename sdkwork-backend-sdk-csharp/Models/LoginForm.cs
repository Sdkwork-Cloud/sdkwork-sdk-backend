using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class LoginForm
    {
        public string? Type { get; set; }
        public string? Email { get; set; }
        public string? Phone { get; set; }
        public string? Username { get; set; }
        public string? Password { get; set; }
        public string? Owner { get; set; }
        public string? Captcha { get; set; }
        public string? CaptchaId { get; set; }
        public bool? RememberMe { get; set; }
        public string? VerificationCode { get; set; }
        public string? InvitationCode { get; set; }
    }
}
