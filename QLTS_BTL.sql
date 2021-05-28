create database QLTS;
use QLTS;

-- bang user
-- drop table TaiKhoan;
CREATE TABLE TaiKhoan
(
	IdTaiKhoan INTEGER auto_increment PRIMARY KEY
	,Username VARCHAR(50)   not null
	,Pass VARCHAR(50) not null 
);
insert into TaiKhoan(IdTaiKhoan, Username, Pass) values 
-- INSERT INTO TaiKhoan VALUES
	(NOT NULL,'user1','user1')
	,(NOT NULL,'user2','user2')
	,(NOT NULL,'user3','user3')
	,(NOT NULL,'user4','user4')
	,(NOT NULL,'user5','user5')
	,(NOT NULL,'user6','user6')
	,(NOT NULL,'user7','user7');


CREATE TABLE QuanTriVien
(
	IdQTV INTEGER auto_increment PRIMARY KEY
	,Username VARCHAR(50)   not null
	,Pass VARCHAR(50) not null 
);
INSERT INTO QuanTriVien (IdQTV, Username, Pass) VALUES
	(NOT NULL,'quantrivien','admin_qtv')
	,(NOT NULL,'buidangtan','buidangtan')
	,(NOT NULL,'nguyenvanson','nguyenvanson')
	,(NOT NULL,'nguyenducthanh','nguyenducthanh');




CREATE TABLE DiaChi
(
	IdDiaChi INTEGER auto_increment PRIMARY KEY
	,SoNha INT not null
	,Duong NVARCHAR(50) not null
	,Quan NVARCHAR(50) not null
	,ThanhPho NVARCHAR(50) not null
);
-- drop table DiaChi

INSERT INTO DiaChi(IdDiaChi, SoNha, Duong, Quan, ThanhPho) VALUES

	(NOT NULL,101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(NOT NULL,102,N'Đường 102 ', N'Cẩm Phả', N'Quảng Ninh')
	,(NOT NULL,103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(NOT NULL,132,N'Đường Quốc Giản', N'Bắc Kiến Xường', N'Thái Bình')
	,(NOT NULL,102,N'Đường 102 102', N'Cẩm Phả', N'Quảng Ninh')
	,(NOT NULL,103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(NOT NULL,101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(NOT NULL,102,N'Đường 102', N'Cẩm Phả', N'Quảng Ninh')
	,(NOT NULL,103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(NOT NULL,101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(NOT NULL,102,N'Đường 102', N'Cẩm Phả', N'Quảng Ninh')
	,(NOT NULL,103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(NOT NULL,101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(NOT NULL,102,N'Đường 102', N'Cẩm Phả', N'Quảng Ninh')
	,(NOT NULL,103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(NOT NULL,101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(NOT NULL,102,N'Đường 102', N'Cẩm Phả', N'Quảng Ninh');


-- UPDATE DiaChi SET SoNha = 111, Duong = N'Đường 40', Quan = N'Lê Chân', ThanhPho = N'Hải Phòng'
-- WHERE IdDiaChi = 10001

-- select * from DiaChi
-- delete ThiSinh

CREATE TABLE Khoi
(
	IdKhoi INT PRIMARY KEY
	,TenKhoi NVARCHAR(10) not null
	,Mon1 NVARCHAR(10) not null
	,Mon2 NVARCHAR(10) not null
	,Mon3 NVARCHAR(10) not null
);
-- drop table Khoi
-- delete Khoi

INSERT INTO Khoi
VALUES
	(1,N'Khối A',N'Toán',N'Lý', N'Hóa')
	,(2,N'Khối B',N'Toán',N'Hóa', N'Sinh')
	,(3,N'Khối C',N'Văn',N'Sử', N'Địa');

CREATE TABLE ThiSinh
(
	SBD  INTEGER auto_increment PRIMARY KEY
	,HoTen NVARCHAR(50) not null
	,IdDiaChi INT  not null	
	,IdKhoi INT not null
	,UuTien NVARCHAR(50) not null
);

-- UPDATE ThiSinh SET
-- HoTen = N'Trần Phạm Tuấn Anh'
-- ,IdDiaChi = 10001
-- ,IdKhoi = 1
-- ,UuTien = N'Nhóm 1'
-- WHERE SBD = 10001


INSERT INTO ThiSinh(SBD,HoTen,IDDiaChi,IDKhoi,UuTien)
VALUES
	(NOT NULL,N'Nguyễn Văn A',1, 1, N'Nhóm 1')
	,(NOT NULL,N'Trần Văn B',2, 2, N'Nhóm 2')
	,(NOT NULL,N'Lưu Hải Yến',3, 2, N'Nhóm 3')
	,(NOT NULL,N'Cao Thị Hoan',4, 1, N'Nhóm 2')
	,(NOT NULL,N'Nguyễn Thị Thu',5, 1, N'Nhóm 3')
	,(NOT NULL,N'Lý Như Hoa',6, 1, N'Nhóm 1')
	,(NOT NULL,N'Trần Thị Vân',7, 3, N'Nhóm 3')
	,(NOT NULL,N'Nguyễn Vân Anh',8, 1, N'Nhóm 3')
	,(NOT NULL,N'Nguyễn Thị An',9, 2, N'Nhóm 3')
	,(NOT NULL,N'Trần Tuấn Anh',10, 3, N'Nhóm 1')
	,(NOT NULL,N'Nguyễn Hoàng',11, 3, N'Nhóm 3')
	,(NOT NULL,N'Nguyễn Thị Thu',12, 2, N'Nhóm 1')
	,(NOT NULL,N'Nguyễn Thị Thu',13, 1, N'Nhóm 3')
	,(NOT NULL,N'Trần Trung Kiên',14, 3, N'Nhóm 2')
	,(NOT NULL,N'Phạm Thị Thư',15, 2, N'Nhóm 1')
	,(NOT NULL,N'Vũ Ngọc Như',16, 3, N'Nhóm 3')
    ,(NOT NULL, N'Vũ Ngọc Anh', 17, 1, N'Nhóm 1');
    
    
-- ,(NOT NULL,N'Bạch Như Nguyệt',10016, 3, N'Nhóm 2')

	
-- drop table ThiSinh
-- delete ThiSinh

-- INSERT INTO ThiSinh
-- VALUEs
-- (1000001,N'Nguyễn Văn ABC',10001, 1 , N'Nhóm 1')

-- drop table Khoi
-- drop table DiaChi

-- delete  ThiSinh

select SBD,HoTen,SoNha,Duong,Quan,ThanhPho,TenKhoi,Mon1,Mon2, Mon3, UuTien 
	from ThiSinh inner join DiaChi on ThiSinh.SBD = DiaChi.IdDiaChi
				inner join Khoi on ThiSinh.IdKhoi = Khoi.IdKhoi;


				select*from ThiSinh;
				select * from DiaChi;
				select*from TaiKhoan;
				select*from QuanTriVien;
                
