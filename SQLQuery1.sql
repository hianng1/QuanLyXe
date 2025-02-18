create database QuanLyXe;
use QuanLyXe;

INSERT INTO san_pham(ProductID, ten_san_pham, so_ghe, truyen_dong, nhien_lieu, dia_diem_lay_xe, hang_xe, gia, so_luong_trong_kho, the_loai_san_pham, CategoryID)
VALUES
('SP001', N'Xe Toyota Camry 2023', 5, N'Tự động', N'Xăng', N'Hà Nội', N'Toyota', 1200000000.00, 10, N'Sedan', 1),
('SP002', N'Xe Honda CR-V 2023', 7, N'Tự động', N'Xăng', N'Hồ Chí Minh', N'Honda', 1500000000.00, 5, N'SUV', 2),
('SP003', N'Xe Ford Ranger 2023', 5, N'Số sàn', N'Dầu', N'Đà Nẵng', N'Ford', 900000000.00, 8, N'Bán tải', 3),
('SP004', N'Xe Hyundai Tucson 2023', 5, N'Tự động', N'Xăng', N'Hải Phòng', N'Hyundai', 1100000000.00, 7, N'SUV', 2),
('SP005', N'Xe Mazda CX-5 2023', 5, N'Tự động', N'Xăng', N'Cần Thơ', N'Mazda', 1300000000.00, 6, N'SUV', 2),
('SP006', N'Xe VinFast VF e34', 5, N'Tự động', N'Điện', N'Hà Nội', N'VinFast', 800000000.00, 15, N'Sedan', 4),
('SP007', N'Xe Kia Seltos 2023', 5, N'Tự động', N'Xăng', N'Hồ Chí Minh', N'Kia', 950000000.00, 9, N'SUV', 2),
('SP008', N'Xe Mercedes-Benz C200 2023', 5, N'Tự động', N'Xăng', N'Hà Nội', N'Mercedes-Benz', 2500000000.00, 3, N'Sedan', 1),
('SP009', N'Xe BMW X5 2023', 5, N'Tự động', N'Xăng', N'Hồ Chí Minh', N'BMW', 3500000000.00, 2, N'SUV', 2),
('SP010', N'Xe Audi Q7 2023', 7, N'Tự động', N'Xăng', N'Đà Nẵng', N'Audi', 4000000000.00, 1, N'SUV', 2);