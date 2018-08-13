INSERT INTO public.partner (id, code, company, email, name, phone) VALUES (-10, '010290-12345', false, 'john.smith@gmail.com', 'John Smith', '+37112345678');
INSERT INTO public.partner (id, code, company, email, name, phone) VALUES (-9, '201188-12345', false, 'maria.smith@outlook.com', 'Maria Smith', '+37187654321');

INSERT INTO public.object (id, apartment_number, city, house_number, postal_code, region, street, type) VALUES (-10, '1', 'Riga', '34', 'LV-1010', 'Kurzeme', 'Kursu', 'APT');
INSERT INTO public.object (id, apartment_number, city, house_number, postal_code, region, street, type) VALUES (-9, null, 'Liepaja', '12', 'LV-3411', 'Kurzeme', 'Liepas', 'HSE');

INSERT INTO public.contract (id, end_date, start_date, object_id, partner_id) VALUES (-10, null, '2014-06-02 19:42:07.751000', -10, -10);
INSERT INTO public.contract (id, end_date, start_date, object_id, partner_id) VALUES (-9, '2014-06-02 19:42:07.750000', '2010-11-19 15:36:10.545000', -9, -10);

INSERT INTO public.meter (id, install_date, serial_number, type, verification_date, object_id) VALUES (-10, '2015-06-14 19:43:49.489000', '1294634809234', 'HW', '2017-06-14 19:44:24.209000', -10);
INSERT INTO public.meter (id, install_date, serial_number, type, verification_date, object_id) VALUES (-9, '2015-06-14 19:43:49.489000', '1294634809234', 'HW', '2018-06-14 19:44:24.209000', -9);

INSERT INTO public.period (id, end_date, name, start_date) VALUES (-10, '2018-05-27 23:59:59.999999', 'May', '2018-05-20 00:00:00.000000');
INSERT INTO public.period (id, end_date, name, start_date) VALUES (-9, '2018-06-27 23:59:59.999999', 'June', '2018-06-20 00:00:00.000000');

INSERT INTO public.reading (id, date, value, meter_id, period_id) VALUES (-10, '2018-05-24 19:48:19.110000', 359, -10, -10);
INSERT INTO public.reading (id, date, value, meter_id, period_id) VALUES (-9, '2018-05-26 02:48:19.110000', 800, -10, -9);