package com.paritytrading.parity.ticker;

import com.paritytrading.parity.book.MarketListener;

abstract class MarketDataListener implements MarketListener {

    static final double PRICE_FACTOR = 100.0;

    private long timestamp;

    public void timestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public long timestampMillis() {
        return timestamp / 1_000_000;
    }

}
