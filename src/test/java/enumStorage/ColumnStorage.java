package enumStorage;

public enum ColumnStorage {
    AVG_FILL_PRICE("Avg fill price"),
    BENCHMARK_PRICE("Benchmark price"),
    CURRENCY_CODE("Currency code"),
    DB_SEQUENCE_NUMBER("Db sequence number"),
    EXEC_SIZE("Exec size"),
    EXEC_TYPE("Exec type"),
    END_TIME("End time"),
    EXECUTION_PRICE_VOLATILITY("Execution price volatility"),
    ID("Id"),
    INSTRUMENT("Instrument"),
    MULTIPLIER("Multiplier"),
    NUM_OF_EXECUTIONS("Num of executions"),
    PRICE_IMP_TICKS("Price imp. (ticks)"),
    PERMANENT_MARKET_IMPACT("Permanent market impact"),
    PRICE("Price"),
    PRICE_IMP_AMOUNT("Price imp. (amount)"),
    PARTICIPATION_RATE("Participation rate"),
    REALIZED_MARKET_IMPACT("Realized market impact"),
    SIDE("Side"),
    SIZE("Size"),
    START_TIME("Start time"),
    SHORTFALL("Shortfall"),
    SEQUENCE_NUMBER("Sequence number"),
    TYPE("Type"),
    TICK_SIZE("Tick size");

    private final String columnName;

    ColumnStorage(String column) {
        this.columnName = column;
    }

    public String getColumnName() {
        return columnName;
    }
}
