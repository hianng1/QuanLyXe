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

-- Chèn dữ liệu mẫu
INSERT INTO nhan_vien(staffid, ten_nhan_vien, email, so_dien_thoai, mat_khau, vai_tro)
VALUES 
('NV001', N'Nguyễn Văn A', 'nva@example.com', 123456789, 'password123', 1), -- Quản lý
('NV002', N'Trần Thị B', 'ttb@example.com', 987654321, 'password456', 0), -- Nhân viên bình thường
('NV003', N'Lê Văn C', 'lvc@example.com', 555555555, 'password789', 0), -- Nhân viên bình thường
('NV004', N'Phạm Thị D', 'ptd@example.com', 111111111, 'password101', 1); -- Quản lý

-- Chèn dữ liệu mẫu
INSERT INTO ma_khuyen_mai(CouponID, ma_khuyen_mai, phan_tram_giam, han_su_dung)
VALUES 
('CP001', 'SUMMER2023', 10.50, '2023-12-31'), -- Giảm 10.5%, hết hạn vào 31/12/2023
('CP002', 'FALLSALE', 15.00, '2023-11-15'), -- Giảm 15%, hết hạn vào 15/11/2023
('CP003', 'WINTER2024', 20.00, '2024-02-28'), -- Giảm 20%, hết hạn vào 28/02/2024
('CP004', 'NEWYEAR2024', 25.00, '2024-01-31'); -- Giảm 25%, hết hạn vào 31/01/2024

INSERT INTO khach_hang (userID, ten_khach_hang, email, so_dien_thoai, dia_chi, mat_khau, vai_tro)
VALUES
('KH001', 'Nguyen Van A', 'nguyenvana@example.com', 0912345678, '123 Đường ABC, Quận 1, TP.HCM', 'password123', 0),
('KH002', 'Tran Thi B', 'tranthib@example.com', 0912345679, '456 Đường XYZ, Quận 2, TP.HCM', 'password123', 0),
('KH003', 'Le Van C', 'levanc@example.com', 0912345680, '789 Đường DEF, Quận 3, TP.HCM', 'password123', 0),
('KH004', 'Pham Thi D', 'phamthid@example.com', 0912345681, '321 Đường GHI, Quận 4, TP.HCM', 'password123', 0),
('KH005', 'Hoang Van E', 'hoangvane@example.com', 0912345682, '654 Đường JKL, Quận 5, TP.HCM', 'password123', 0),
('KH006', 'Vu Thi F', 'vuthif@example.com', 0912345683, '987 Đường MNO, Quận 6, TP.HCM', 'password123', 0),
('KH007', 'Do Van G', 'dovang@example.com', 0912345684, '111 Đường PQR, Quận 7, TP.HCM', 'password123', 0),
('KH008', 'Mai Thi H', 'maithih@example.com', 0912345685, '222 Đường STU, Quận 8, TP.HCM', 'password123', 0),
('KH009', 'Dang Van I', 'dangvani@example.com', 0912345686, '333 Đường VWX, Quận 9, TP.HCM', 'password123', 0),
('KH010', 'Bui Thi K', 'buithik@example.com', 0912345687, '444 Đường YZZ, Quận 10, TP.HCM', 'password123', 0);