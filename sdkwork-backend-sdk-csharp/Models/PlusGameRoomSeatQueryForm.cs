using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Backend.Models
{
    public class PlusGameRoomSeatQueryForm
    {
        public int? Id { get; set; }
        public string? CreatedAtFrom { get; set; }
        public string? CreatedAtTo { get; set; }
        public int? RoomId { get; set; }
        public int? UserId { get; set; }
        public string? Status { get; set; }
    }
}
