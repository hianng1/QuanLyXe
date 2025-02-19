create database QuanLyXe;
use QuanLyXe;

INSERT INTO danh_muc(CategoryID, ten_danh_muc, mo_ta)
VALUES
('DM01', N'Sedan', N'Dòng xe sedan phổ biến, phù hợp cho gia đình và cá nhân'),
('DM02', N'SUV', N'Dòng xe SUV đa dụng, phù hợp cho mọi địa hình'),
('DM03', N'Bán tải', N'Dòng xe bán tải mạnh mẽ, phù hợp cho công việc và giải trí'),
('DM04', N'Xe điện', N'Dòng xe thân thiện với môi trường, sử dụng động cơ điện'),
('DM05', N'Hatchback', N'Dòng xe nhỏ gọn, phù hợp cho đô thị'),
('DM06', N'Coupe', N'Dòng xe thể thao, thiết kế 2 cửa'),
('DM07', N'MPV', N'Dòng xe đa dụng, nhiều chỗ ngồi, phù hợp cho gia đình lớn'),
('DM08', N'Xe sang', N'Dòng xe cao cấp, sang trọng, dành cho giới thượng lưu'),
('DM09', N'Xe thể thao', N'Dòng xe hiệu suất cao, thiết kế thể thao'),
('DM10', N'Xe cổ điển', N'Dòng xe cổ điển, phục vụ sưu tầm và giải trí');

INSERT INTO san_pham (ProductID, ten_san_pham, so_ghe, truyen_dong, nhien_lieu, dia_diem_lay_xe, hang_xe, gia, so_luong_trong_kho, CategoryID, ngay_san_xuat, bao_hanh)
VALUES
('SP001', N'Xe Toyota Camry 2023', 5, N'Tự động', N'Xăng', N'Hà Nội', N'Toyota', 1200000000.00, 10, 'DM01', '2023-01-01', N'3 năm'),
('SP002', N'Xe Honda CR-V 2023', 7, N'Tự động', N'Xăng', N'Hồ Chí Minh', N'Honda', 1500000000.00, 5, 'DM02', '2023-02-01', N'5 năm'),
('SP003', N'Xe Ford Ranger 2023', 5, N'Số sàn', N'Dầu', N'Đà Nẵng', N'Ford', 900000000.00, 8, 'DM03', '2023-03-01', N'4 năm'),
('SP004', N'Xe Hyundai Tucson 2023', 5, N'Tự động', N'Xăng', N'Hải Phòng', N'Hyundai', 1100000000.00, 7, 'DM02', '2023-04-01', N'5 năm'),
('SP005', N'Xe Mazda CX-5 2023', 5, N'Tự động', N'Xăng', N'Cần Thơ', N'Mazda', 1300000000.00, 6, 'DM02', '2023-05-01', N'5 năm'),
('SP006', N'Xe VinFast VF e34', 5, N'Tự động', N'Điện', N'Hà Nội', N'VinFast', 800000000.00, 15, 'DM04', '2023-06-01', N'7 năm'),
('SP007', N'Xe Kia Seltos 2023', 5, N'Tự động', N'Xăng', N'Hồ Chí Minh', N'Kia', 950000000.00, 9, 'DM02', '2023-07-01', N'5 năm'),
('SP008', N'Xe Mercedes-Benz C200 2023', 5, N'Tự động', N'Xăng', N'Hà Nội', N'Mercedes-Benz', 2500000000.00, 3, 'DM08', '2023-08-01', N'6 năm'),
('SP009', N'Xe BMW X5 2023', 5, N'Tự động', N'Xăng', N'Hồ Chí Minh', N'BMW', 3500000000.00, 2, 'DM02', '2023-09-01', N'6 năm'),
('SP010', N'Xe Audi Q7 2023', 7, N'Tự động', N'Xăng', N'Đà Nẵng', N'Audi', 4000000000.00, 1, 'DM02', '2023-10-01', N'6 năm');

