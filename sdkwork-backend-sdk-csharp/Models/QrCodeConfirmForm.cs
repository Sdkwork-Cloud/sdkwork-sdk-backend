using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class QrCodeConfirmForm
    {
        public string? QrKey { get; set; }
        public string? Token { get; set; }
    }
}
