CREATE TABLE IF NOT EXISTS exchange_rates (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    from_currency VARCHAR(3),
    to_currency VARCHAR(3),
    conversion_rate DECIMAL(19,4)
);