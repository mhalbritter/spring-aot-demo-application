CREATE TABLE IF NOT EXISTS authors
(
    id
    integer
    GENERATED
    ALWAYS AS
    IDENTITY
    PRIMARY
    KEY,
    name
    varchar
    NOT
    NULL
);
