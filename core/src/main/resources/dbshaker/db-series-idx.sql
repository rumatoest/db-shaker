ALTER TABLE series ADD PRIMARY KEY HASH (id);
ALTER TABLE series ADD FOREIGN KEY (brand_id) REFERENCES brands(id);
