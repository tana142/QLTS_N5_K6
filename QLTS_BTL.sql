create database QLTS
go 
use QLTS
go
CREATE TABLE DiaChi
(
	IdDiaChi int primary key
	,SoNha int not null
	,Duong nvarchar(50) not null
	,Quan nvarchar(50) not null
	,ThanhPho nvarchar(50) not null
)


INSERT INTO DiaChi
VALUES

	(10001,101,N'Đường 39', N'Lê Chân', N'Hải Phòng')
	,(10002,102,N'Đường 102 102', N'Cẩm Phả', N'Quảng Ninh')
	,(10003,103,N'Đường 103', N'Hải Hậu', N'Nam Định')


UPDATE DiaChi SET SoNha = 111, Duong = N'Đường 40', Quan = N'Lê Chân', ThanhPho = N'Hải Phòng'
		WHERE IdDiaChi = 10001

select * from DiaChi

CREATE TABLE Khoi
(
	IdKhoi int primary key
	,TenKhoi nvarchar(4) not null
	,Mon1 nvarchar(10) not null
	,Mon2 nvarchar(10) not null
	,Mon3 nvarchar(10) not null
)

delete Khoi

INSERT INTO Khoi
VALUES
	(1,N'Khối A',N'Toán',N'Lý', N'Hóa')
	,(2,N'Khối B',N'Toán',N'Hóa', N'Sinh')
	,(3,N'Khối C',N'Văn',N'Sử', N'Địa')

CREATE TABLE ThiSinh
(
	SBD int primary key
	,HoTen nvarchar(50) not null
	,IdDiaChi int  not null	
	,IdKhoi int not null
	,UuTien nvarchar(50) not null
)

UPDATE ThiSinh SET
		HoTen = N'Trần Phạm Tuấn Anh'
		,IdDiaChi = 10001
		,IdKhoi = 1
		,UuTien = N'Nhóm 1'
		WHERE SBD = 10001


INSERT INTO ThiSinh
VALUES
	(10001,N'Nguyễn Văn A',10001, 1, N'Nhóm 1')
	,(10002,N'Trần Văn B',10002, 2, N'Nhóm 2')
	,(10003,N'Nguyễn Thị Thu Thảo',10003, 3, N'Nhóm 3')




	INSERT INTO ThiSinh
VALUEs
	(1000001,N'Nguyễn Văn ABC',10001, 1 , N'Nhóm 1')

drop table Khoi
drop table ThiSinh
drop table DiaChi

delete  ThiSinh

select SBD,HoTen,SoNha,Duong,Quan,ThanhPho,TenKhoi,Mon1,Mon2, Mon3, UuTien 
	from ThiSinh inner join DiaChi on ThiSinh.IdDiaChi = DiaChi.IdDiaChi
				inner join Khoi on ThiSinh.IdKhoi = Khoi.IdKhoi


				select*from ThiSinh
