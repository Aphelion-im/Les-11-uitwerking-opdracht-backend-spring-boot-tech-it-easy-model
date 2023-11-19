-- We vullen hier de database met data.
-- Let er op dat je datums en enums juist invoert
-- Enums: AvailableSize en ScreenQuality
-- Opmerking! De oorspronkelijke NOVI onderstaande SQL heeft een paar fouten in de entries. Op sommige plekken is het ingevoerde cijfer van de Enum te hoog, omdat de enum een zero-based index heeft. D
-- Als er fouten in de enums entries zitten, dan zal Postman geen resultaten geven.
INSERT INTO televisions (id, type, brand, name, price, available_size, refresh_rate, screen_type, screen_quality, smart_tv, wifi, voice_control, hdr, bluetooth, ambi_light, original_stock, sold)
VALUES (1001, 'NH3216SMART', 'Nikkei', 'HD smart TV', 159, 3, 100, 'LED', 1,  true, true, false, false, false, false, '2023-08-24', null),
       (1002, '43PUS6504/12/L', 'Philips', '4K UHD LED Smart Tv', 379, 2, 60, 'LED', 2,  true, true, false, true, false, false, '2023-04-05', '2023-06-28'),
       (1003, '43PUS6504/12/M', 'Philips', '4K UHD LED Smart Tv', 379, 1, 60, 'LED', 3,  true, true, false, true, false, false, '2023-05-19', '2023-05-22'),
       (1004, '43PUS6504/12/S', 'Philips', '4K UHD LED Smart Tv', 379, 3, 60, 'LED', 4,  true, true, false, true, false, false, '2023-07-01', '2023-07-31'),
       (1005, 'OLED55C16LA', 'LG', 'LG OLED55C16LA', 989, 3, 100, 'OLED', 4,  true, true, true, true, true, false, '2023-09-01', '2023-09-07');

-- nog een extra tv zonder datums
INSERT INTO televisions (id, type, brand, name, price, available_size, refresh_rate, screen_type, screen_quality, smart_tv, wifi, voice_control, hdr, bluetooth, ambi_light)
VALUES (1006, '55AU7040', 'Samsung', 'Crystal UHD', 549, 3, 100, 'LED-LCD', 2,  true, true, true, true, true, false);

-- Postman zal uiteindelijk de 0, 1, 2, of 3 (Enum Index nummer)vertalen naar S, M, L of XL
-- public enum AvailableSize {
--     S(50),   --> Index 0
--     M(55),   --> Index 1
--     L(60),   --> Index 2
--     XL(65);  --> Index 3
--
-- public final int size;
-- private AvailableSize(int size){
--         this.size = size;
-- }
-- }

-- Screen Quality: 1 t/m 5.
-- public enum ScreenQuality {
--     UHD,
--     HD,
--     FHD,
--     QHD,
--     HDREADY
-- }