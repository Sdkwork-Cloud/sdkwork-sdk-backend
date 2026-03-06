using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Backend.Http;
using Backend.Models;

namespace Backend.Api
{
    public class AccountExchangeConfigApi
    {
        private readonly HttpClient _client;

        public AccountExchangeConfigApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// Get points-to-cash rate
        /// </summary>
        public async Task<PlusApiResultAccountExchangeRateVO?> GetPointsToCashRateAsync()
        {
            return await _client.GetAsync<PlusApiResultAccountExchangeRateVO>(ApiPaths.BackendPath("/account/exchange-config/points-cash-rate"));
        }

        /// <summary>
        /// Update points-to-cash rate
        /// </summary>
        public async Task<PlusApiResultAccountExchangeRateVO?> UpdatePointsToCashRateAsync(AccountExchangeRateUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultAccountExchangeRateVO>(ApiPaths.BackendPath("/account/exchange-config/points-cash-rate"), body);
        }
    }
}
