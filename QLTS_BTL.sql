create database QLTS
go 
use QLTS
go
-- bang user
CREATE TABLE TaiKhoan
(
	IdDiaChi INTEGER IDENTITY(10000,1) PRIMARY KEY
	,Username VARCHAR(50)   not null
	,Pass VARCHAR(50) not null 
)
INSERT INTO TaiKhoan VALUES
	('user1','user1')
	,('user2','user2')
	,('user3','user3')
	,('user4','user4')
	,('user5','user5')
	,('user6','user6')
	,('user7','user7')
	,('2','2')


CREATE TABLE QuanTriVien
(
	IdDiaChi INTEGER IDENTITY(10000,1) PRIMARY KEY
	,Username VARCHAR(50)   not null
	,Pass VARCHAR(50) not null 
)
INSERT INTO QuanTriVien VALUES
	('quantrivien','admin_qtv')
	,('buidangtan','buidangtan')
	,('nguyenvanson','nguyenvanson')
	,('nguyenducthanh','nguyenducthanh')
	,('1','1')




CREATE TABLE DiaChi
(
	IdDiaChi INTEGER IDENTITY(10000,1) PRIMARY KEY
	,SoNha INT not null
	,Duong NVARCHAR(50) not null
	,Quan NVARCHAR(50) not null
	,ThanhPho NVARCHAR(50) not null
)
-- drop table DiaChi

INSERT INTO DiaChi
VALUES

	(101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(102,N'Đường 102 ', N'Cẩm Phả', N'Quảng Ninh')
	,(103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(132,N'Đường Quốc Giản', N'Bắc Kiến Xường', N'Thái Bình')
	,(102,N'Đường 102 102', N'Cẩm Phả', N'Quảng Ninh')
	,(103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(102,N'Đường 102', N'Cẩm Phả', N'Quảng Ninh')
	,(103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(102,N'Đường 102', N'Cẩm Phả', N'Quảng Ninh')
	,(103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(102,N'Đường 102', N'Cẩm Phả', N'Quảng Ninh')
	,(103,N'Đường 103', N'Hải Hậu', N'Nam Định')
	,(101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(102,N'Đường 102', N'Cẩm Phả', N'Quảng Ninh')


--UPDATE DiaChi SET SoNha = 111, Duong = N'Đường 40', Quan = N'Lê Chân', ThanhPho = N'Hải Phòng'
--		WHERE IdDiaChi = 10001

--select * from DiaChi
-- delete ThiSinh

CREATE TABLE Khoi
(
	IdKhoi INT PRIMARY KEY
	,TenKhoi NVARCHAR(10) not null
	,Mon1 NVARCHAR(10) not null
	,Mon2 NVARCHAR(10) not null
	,Mon3 NVARCHAR(10) not null
)
--drop table Khoi
--delete Khoi

INSERT INTO Khoi
VALUES
	(1,N'Khối A',N'Toán',N'Lý', N'Hóa')
	,(2,N'Khối B',N'Toán',N'Hóa', N'Sinh')
	,(3,N'Khối C',N'Văn',N'Sử', N'Địa')

CREATE TABLE ThiSinh
(
	SBD  INTEGER IDENTITY(10000,1) PRIMARY KEY
	,HoTen NVARCHAR(50) not null
	,IdDiaChi INT  not null	
	,IdKhoi INT not null
	,UuTien NVARCHAR(50) not null
)

--UPDATE ThiSinh SET
--		HoTen = N'Trần Phạm Tuấn Anh'
--		,IdDiaChi = 10001
--		,IdKhoi = 1
--		,UuTien = N'Nhóm 1'
--		WHERE SBD = 10001


INSERT INTO ThiSinh
VALUES
	(N'Nguyễn Văn A',10000, 1, N'Nhóm 1')
	,(N'Trần Văn B',10001, 2, N'Nhóm 2')
	,(N'Lưu Hải Yến',10002, 2, N'Nhóm 3')
	,(N'Cao Thị Hoan',10003, 1, N'Nhóm 2')
	,(N'Nguyễn Thị Thu',10004, 1, N'Nhóm 3')
	,(N'Lý Như Hoa',10005, 1, N'Nhóm 1')
	,(N'Trần Thị Vân',10006, 3, N'Nhóm 3')
	,(N'Nguyễn Vân Anh',10007, 1, N'Nhóm 3')
	,(N'Nguyễn Thị An',10008, 2, N'Nhóm 3')
	,(N'Trần Tuấn Anh',1009, 3, N'Nhóm 1')
	,(N'Nguyễn Hoàng',10010, 3, N'Nhóm 3')
	,(N'Nguyễn Thị Thu',10011, 2, N'Nhóm 1')
	,(N'Nguyễn Thị Thu',10012, 1, N'Nhóm 3')
	,(N'Trần Trung Kiên',10013, 3, N'Nhóm 2')
	,(N'Phạm Thị Thư',10014, 2, N'Nhóm 1')
	,(N'Vũ Ngọc Như',10015, 3, N'Nhóm 3')
--	,(N'Bạch Như Nguyệt',10016, 3, N'Nhóm 2')

	
--drop table ThiSinh
--delete ThiSinh

--	INSERT INTO ThiSinh
--VALUEs
--	(1000001,N'Nguyễn Văn ABC',10001, 1 , N'Nhóm 1')

--drop table Khoi
--drop table DiaChi

--delete  ThiSinh

select SBD,HoTen,SoNha,Duong,Quan,ThanhPho,TenKhoi,Mon1,Mon2, Mon3, UuTien 
	from ThiSinh inner join DiaChi on ThiSinh.SBD = DiaChi.IdDiaChi
				inner join Khoi on ThiSinh.IdKhoi = Khoi.IdKhoi


				select*from ThiSinh
				select * from DiaChi
				select*from TaiKhoan
				select*from QuanTriVien