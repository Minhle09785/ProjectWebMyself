﻿insert into Categories(Id, Name) values ('1000', N'Áo Thun')
insert into Categories(Id, Name) values ('1001', N'Áo Sơ Mi')
insert into Categories(Id, Name) values ('1002', N'Quần Short')
insert into Categories(Id, Name) values ('1003', N'Phụ Kiện')
insert into Categories(Id, Name) values ('1004', N'Nón Mũ')
go
SET IDENTITY_INSERT [dbo].[Products] ON 

insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1050', N'Áo Thun Trắng', '1.png', 12, '2022-12-22',0 , '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1051', N'Áo Thun Xanh Lam', '2.png', 22, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1052', N'Áo Thun Đen Mun', '3.png', 23, '2022-10-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1053', N'Áo Thun Nâu Xám', '4.png', 25, '2021-11-10',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1054', N'Áo Thun Xanh Dương Cao Cấp', '5.png', 32, '2022-07-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1055', N'Áo Thun Màu Xanh Xám ICCI', '6.png', 42, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1056', N'Áo Thun Màu Nâu Xẫm', '7.png', 24, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1057', N'Áo Thun Đen In Họa Tiết', '8.png', 18, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1058', N'Quần Thun Nâu Xám ', '9.png', 10, '2022-11-12',0, '1002')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1059', N'Áo Thun POLO Đen Xẫm Salary', '10.png', 52, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1060', N'Quần Short Màu Kaki', '11.png', 33, '2022-11-12',0, '1002')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1061', N'Quần Short Đen Không Họa Tiết', '12.png', 62, '2022-11-12',0, '1002')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1062', N'Quần Short Đen Hãng Adio', '13.png', 20, '2022-11-12',0, '1002')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1063', N'Quần Short Đen Bó', '14.png', 44, '2022-11-12',0, '1002')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1064', N'Quần Short Đen Có Dây In Họa Tiết', '15.png', 22, '2022-11-12',0, '1002')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1065', N'Quần Thể thao Đen', '16.png', 40, '2022-11-12',0, '1002')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1066', N'Quần Thun Đen Không In họa Tiết', '17.png', 34, '2022-11-12',0, '1002')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1067', N'Quần Thun Polo FUll Đen', '18.png', 62, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1068', N'Áo Thun POLO Sọc Trắng Đen', '19.png', 22, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1069', N'Áo Thun POLO In Họa Tiết Cao Cấp', '20.png', 42, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1070', N'Áo Thun POLO Trắng', '21.png', 100, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1071', N'Áo Thun POLO Xanh Lam', '22.png', 82, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1072', N'Áo Thun POLO Color Kem', '23.png', 102, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1073', N'Áo Thun POLO Trắng Sọc Xanh', '24.png', 70, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1074', N'Áo Thun POLO Green', '25.png', 62, '2022-11-12',0, '1000')
insert into Products(Id, [Name], [Image], Price, CreateDate, Available, CategoryId)
values ('1075', N'Áo Thun POLO Color Full Kem', '26.png', 76, '2022-11-12',0, '1000')
 select * from Products